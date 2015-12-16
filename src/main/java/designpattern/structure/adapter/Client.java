package designpattern.structure.adapter;

/**
 * 适配器模式
 *  核心:实现某种功能时，已经存在相应功能的实现，但是由于接口不兼容，
 *  无法使用。此时，定义一个符合当前环境的接口，在实现类（Adapter）中，
 *  实现接口时，把请求转发到已经存在的类。此外也可以扩充一些功能
 *
 *  结合其他模式：
 *     适配器模式和装饰者模式类似，只是侧重点不同。
 *     --适配器模式侧重于接口适配
 *     --装饰者模式在于扩展功能
 *
 */
public class Client {

    public static void func(Target target){
        target.showText();
    }

    public static void main(String[] args){
        func(new Adapter());
    }
}
