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
}
