package apachecommon.beanutils;

public class POJO {
    private int id;
    private String name;
    private boolean isMale;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}