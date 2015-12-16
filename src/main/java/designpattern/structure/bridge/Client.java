package designpattern.structure.bridge;

/**
 * （Bridge）桥梁模式
 *  核心：分离业务抽象和具体实现，两棵树独立发展，互相不影响。
 *  如果不分离会导致类的增长成 M x N ，分离之后是 M + N
 *  说白了，就是两个维度的抽象不一样在一棵树中体现，而应该放在两棵树中
 *
 *  结合其它模式：
 *      工厂方法模式
 *      由工厂类决定返回哪个实现类给业务抽象树，这样就不用耦合具体实现类的创建过程
 *
 *
 */
public class Client {

    private boolean isId;
    private boolean hasN;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(boolean isId) {
        this.isId = isId;
    }

    public void setHasN(boolean hasN) {
        this.hasN = hasN;
    }

    public boolean isId() {
        return isId;
    }

    public boolean isHasN() {
        return hasN;
    }

    public static void main(String[] args){
        DatabaseOperation operation = new MysqlOperation();
        UserDao userDao = new BossUserDao(operation);
        userDao.insertUser();
    }
}
