package gson;

public class IDBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IDBean{" +
                "id=" + id +
                '}';
    }
}
