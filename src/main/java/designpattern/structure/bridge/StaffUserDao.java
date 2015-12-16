package designpattern.structure.bridge;

public class StaffUserDao extends UserDao{

    public StaffUserDao(DatabaseOperation operation){
        this.operation = operation;

    }
    @Override
    void insertUser() {
        System.out.println("do staff user insert");
        this.operation.parseSql("insert into user() values()");
    }
}
