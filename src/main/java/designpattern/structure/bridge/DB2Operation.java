package designpattern.structure.bridge;

public class DB2Operation implements DatabaseOperation{

    @Override
    public void parseSql(String sql) {
        System.out.println("pase " + sql + "in DB2");
    }
}
