package designpattern.structure.decorator;

public class TextView implements View {

    @Override
    public void draw() {
        System.out.println("draw a text view");
    }
}
