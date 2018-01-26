package models;

public class Adversaries {
    private String adversaryName;
    private String level;
    private String index;
    private int id;

    public Adversaries(String adversaryName, String level, String index) {
        this.adversaryName = adversaryName;
        this.level = level;
        this.index = index;
    }

    public String getAdversaryName() {
        return adversaryName;
    }

    public void setAdversaryName(String adversaryName) {
        this.adversaryName = adversaryName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
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

        Adversaries that = (Adversaries) o;

        if (adversaryName != null ? !adversaryName.equals(that.adversaryName) : that.adversaryName != null)
            return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        return index != null ? index.equals(that.index) : that.index == null;
    }

    @Override
    public int hashCode() {
        int result = adversaryName != null ? adversaryName.hashCode() : 0;
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (index != null ? index.hashCode() : 0);
        return result;
    }
}
