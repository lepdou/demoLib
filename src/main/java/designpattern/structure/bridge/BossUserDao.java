package designpattern.structure.bridge;

public class BossUserDao extends UserDao{

    public BossUserDao(DatabaseOperation operation){
        this.operation = operation;
    }

    @Override
    void insertUser() {
        System.out.println("do boss insert");
        operation.parseSql("insert into user() values()");
    }
}
