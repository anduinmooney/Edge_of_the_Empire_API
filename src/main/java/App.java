import com.google.gson.Gson;
import dao.Sql2oArmorDao;
import dao.Sql2oWeaponDao;
import dao.Sql2oAdversariesDao;
import models.Adversaries;
import models.Armor;
import models.Weapon;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        Sql2oWeaponDao weaponDao;
        Sql2oAdversariesDao adversariesDao;
        Sql2oArmorDao armorDao;
        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

        weaponDao = new Sql2oWeaponDao(sql2o);
        adversariesDao = new Sql2oAdversariesDao(sql2o);
        armorDao = new Sql2oArmorDao(sql2o);
        conn = sql2o.open();


        post("/weapons/new", "application/json", (req, res) -> {
            Weapon weapon = gson.fromJson(req.body(), Weapon.class);
            weaponDao.add(weapon);
            res.status(201);
            return gson.toJson(weapon);
        });

        get("/weapons", "application/json", (req, res) -> {
            return gson.toJson(weaponDao.getAll());
        });

        get("/weapons/:id", "application/json", (req, res) -> {
            res.type("application/json");
            int weaponId = Integer.parseInt(req.params("id"));
            return gson.toJson(weaponDao.findById(weaponId));
        });

        post("/armors/new", "application/json", (req, res) -> {
            Armor armor = gson.fromJson(req.body(), Armor.class);
            armorDao.add(armor);
            res.status(201);
            return gson.toJson(armor);
        });

        get("/armors", "application/json", (req, res) -> {
            return gson.toJson(armorDao.getAll());
        });

        get("/armors/:id", "application/json", (req, res) -> {
            res.type("application/json");
            int armorId = Integer.parseInt(req.params("id"));
            return gson.toJson(armorDao.findById(armorId));
        });

        post("/adversaries/new", "application/json", (req, res) -> {
            Adversaries adversaries = gson.fromJson(req.body(), Adversaries.class);
            adversariesDao.add(adversaries);
            res.status(201);
            return gson.toJson(adversaries);
        });

        get("/adversaries", "application/json", (req, res) -> {
            return gson.toJson(adversariesDao.getAll());
        });

        get("/adversaries/:id", "application/json", (req, res) -> {
            res.type("application/json");
            int adversariesId = Integer.parseInt(req.params("id"));
            return gson.toJson(adversariesDao.findById(adversariesId));
        });

        after((req, res) ->{
            res.type("application/json");
        });
    }
}