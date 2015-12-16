package designpattern.builder;

public class HumanBuilder implements PersonBuilder{
    private Human human = new Human();

    @Override
    public void buildHead() {
        human.setHeader("human header");
    }

    @Override
    public void buildBody() {
        human.setBody("human body");

    }

    @Override
    public void buildHair() {
        human.setHair("black hair");
    }

    public Human getResult(){
        return human;
    }

    public Human build(){
        buildBody();
        buildHair();
        buildHead();
        return human;
    }
}
