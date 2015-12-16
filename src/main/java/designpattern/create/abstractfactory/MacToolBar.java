package designpattern.create.abstractfactory;

public class MacToolBar implements ToolBar{
    @Override
    public void draw() {
        System.out.println("mac toolbar");
    }
}
