package designpattern.create.abstractfactory;

public class WinButton implements Button{
    @Override
    public void draw() {
        System.out.println("windows button");
    }
}
