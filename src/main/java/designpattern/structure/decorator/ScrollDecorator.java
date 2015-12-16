package designpattern.structure.decorator;

public class ScrollDecorator extends Decorator{

    public ScrollDecorator(View view){
        this.view = view;
    }

    @Override
    public void draw() {
        scrollEnable();
        view.draw();
    }

    private void scrollEnable(){
        System.out.println("view can be scroll now");
    }
}
