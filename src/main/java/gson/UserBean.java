package gson;

import java.util.List;

public class UserBean {
    private int id;
    private String name;
    private List<ArrayBean> likes;

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

    public List<ArrayBean> getLikes() {
        return likes;
    }

    public void setLikes(List<ArrayBean> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", likes=" + likes +
                '}';
    }
}
