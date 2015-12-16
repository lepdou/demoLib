package designpattern.structure.decorator;

/**
 * (Decorator) 装饰者模式
 * 核心：不是通过继承扩展现有的类的功能，因为这样成本会很高，通过一个装饰者（Decorator）维护被扩展的类的引用，
 * 装饰者和被扩展的类具有一模一样的接口，装饰者把请求转发给被扩展类之前或者之后可以做一些额外的工作，这种情况称为
 * 纵向扩展。相对的横向扩展则是，装饰者对外提供更多的接口。
 *
 * 其它模式：
 *  装饰者模式适用于被装饰者具有很小的接口集，当具有很大的接口集的时候，每一个请求都要转发，成本很高而且很丑。
 *  这时候可以使用策略模式，把部分功能实现抽象出来，放到另外的继承树中实现，而且很容易动态替换策略。
 *
 */
public class Client {

    public static void main(String[] args){
        TextView textView = new TextView();
        ScrollDecorator scrollDecorator = new ScrollDecorator(textView);
        scrollDecorator.draw();
    }
}
