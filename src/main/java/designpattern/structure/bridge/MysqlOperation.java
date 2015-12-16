package designpattern.structure.bridge;

public class MysqlOperation implements DatabaseOperation {

    @Override
    public void parseSql(String sql) {
        System.out.println("pase " + sql + " in mysql");
    }
}
