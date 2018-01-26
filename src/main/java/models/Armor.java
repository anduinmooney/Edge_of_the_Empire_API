package models;

public class Armor {
    private String armorName;
    private String defense;
    private String soak;
    private String armorPrice;
    private String armorEncumberance;
    private String armorHardPoint;
    private String armorRarity;
    private int id;

    public Armor(String armorName, String defense, String soak, String armorPrice, String armorEncumberance, String armorHardPoint, String armorRarity) {
        this.armorName = armorName;
        this.defense = defense;
        this.soak = soak;
        this.armorPrice = armorPrice;
        this.armorEncumberance = armorEncumberance;
        this.armorHardPoint = armorHardPoint;
        this.armorRarity = armorRarity;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String name) {
        this.armorName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSoak() {
        return soak;
    }

    public void setSoak(String soak) {
        this.soak = soak;
    }

    public String getArmorPrice() {
        return armorPrice;
    }

    public void setArmorPrice(String price) {
        this.armorPrice = price;
    }

    public String getArmorEncumberance() {
        return armorEncumberance;
    }

    public void setArmorEncumberance(String armorEncumberance) {
        this.armorEncumberance = armorEncumberance;
    }

    public String getArmorHardPoint() {
        return armorHardPoint;
    }

    public void setArmorHardPoint(String armorHardPoint) {
        this.armorHardPoint = armorHardPoint;
    }

    public String getArmorRarity() {
        return armorRarity;
    }

    public void setArmorRarity(String armorRarity) {
        this.armorRarity = armorRarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Armor armor = (Armor) o;

        if (armorName != null ? !armorName.equals(armor.armorName) : armor.armorName != null) return false;
        if (defense != null ? !defense.equals(armor.defense) : armor.defense != null) return false;
        if (soak != null ? !soak.equals(armor.soak) : armor.soak != null) return false;
        if (armorPrice != null ? !armorPrice.equals(armor.armorPrice) : armor.armorPrice != null) return false;
        if (armorEncumberance != null ? !armorEncumberance.equals(armor.armorEncumberance) : armor.armorEncumberance != null)
            return false;
        if (armorHardPoint != null ? !armorHardPoint.equals(armor.armorHardPoint) : armor.armorHardPoint != null)
            return false;
        return armorRarity != null ? armorRarity.equals(armor.armorRarity) : armor.armorRarity == null;
    }

    @Override
    public int hashCode() {
        int result = armorName != null ? armorName.hashCode() : 0;
        result = 31 * result + (defense != null ? defense.hashCode() : 0);
        result = 31 * result + (soak != null ? soak.hashCode() : 0);
        result = 31 * result + (armorPrice != null ? armorPrice.hashCode() : 0);
        result = 31 * result + (armorEncumberance != null ? armorEncumberance.hashCode() : 0);
        result = 31 * result + (armorHardPoint != null ? armorHardPoint.hashCode() : 0);
        result = 31 * result + (armorRarity != null ? armorRarity.hashCode() : 0);
        return result;
    }
}
