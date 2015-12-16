package designpattern.structure.adapter;

public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void showText() {
        adaptee.showTextToWindows();
    }
}
