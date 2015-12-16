package designpattern.structure.bridge;

public abstract class UserDao {
    protected DatabaseOperation operation;

    abstract void insertUser();
}
