package designpattern.create.abstractfactory;

public class WinToolBar implements ToolBar{
    @Override
    public void draw() {
        System.out.println("windows toolbar");
    }
}
