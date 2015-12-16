package designpattern.builder;

public class RobotBuilder implements PersonBuilder {
    Robot robot = new Robot();

    @Override
    public void buildHead() {
        robot.setHeader("robot head");
    }

    @Override
    public void buildBody() {
        robot.setBody("robot body");
    }

    @Override
    public void buildHair() {

    }

    /**
     * 在构建时，不需要director传入参数时，可以在build方法中调用构建方法序列。
     * 换句话说，构造器具有构造过程中所需的所有资源。
     * 否则应该在director中调用构建过程。
     * @return
     */
    Robot build(){
        buildHead();
        buildBody();
        return robot;
    }

    Robot returnResult(){
        return robot;
    }
}
