package models;

public class Weapon {
    private String name;
    private String skill;
    private String damage;
    private String critical;
    private String range;
    private String encumberance;
    private String hardPoint;
    private String rarity;
    private String price;
    private int id;

    public Weapon(String name, String skill, String damage, String critical, String range, String encumberance, String hardPoint, String rarity, String price) {
        this.name = name;
        this.skill = skill;
        this.damage = damage;
        this.critical = critical;
        this.range = range;
        this.encumberance = encumberance;
        this.hardPoint = hardPoint;
        this.rarity = rarity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getEncumberance() {
        return encumberance;
    }

    public void setEncumberance(String encumberance) {
        this.encumberance = encumberance;
    }

    public String getHardPoint() {
        return hardPoint;
    }

    public void setHardPoint(String hardPoint) {
        this.hardPoint = hardPoint;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weapon weapon = (Weapon) o;

        if (id != weapon.id) return false;
        if (name != null ? !name.equals(weapon.name) : weapon.name != null) return false;
        if (skill != null ? !skill.equals(weapon.skill) : weapon.skill != null) return false;
        if (damage != null ? !damage.equals(weapon.damage) : weapon.damage != null) return false;
        if (critical != null ? !critical.equals(weapon.critical) : weapon.critical != null) return false;
        if (range != null ? !range.equals(weapon.range) : weapon.range != null) return false;
        if (encumberance != null ? !encumberance.equals(weapon.encumberance) : weapon.encumberance != null)
            return false;
        if (hardPoint != null ? !hardPoint.equals(weapon.hardPoint) : weapon.hardPoint != null) return false;
        if (rarity != null ? !rarity.equals(weapon.rarity) : weapon.rarity != null) return false;
        return price != null ? price.equals(weapon.price) : weapon.price == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (skill != null ? skill.hashCode() : 0);
        result = 31 * result + (damage != null ? damage.hashCode() : 0);
        result = 31 * result + (critical != null ? critical.hashCode() : 0);
        result = 31 * result + (range != null ? range.hashCode() : 0);
        result = 31 * result + (encumberance != null ? encumberance.hashCode() : 0);
        result = 31 * result + (hardPoint != null ? hardPoint.hashCode() : 0);
        result = 31 * result + (rarity != null ? rarity.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
