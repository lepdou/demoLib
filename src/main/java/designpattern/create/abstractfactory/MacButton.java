package designpattern.create.abstractfactory;

public class MacButton implements Button{

    @Override
    public void draw() {
        System.out.println("mac button");
    }
}
