package designpattern.create.abstractfactory;

/**
 * 抽象工厂设计模式
 * 核心：
 *  1.作为应用，不关注于组件创建的细节，只关注组件创建的接口
 *  2.每个工厂实现类创建“同系列”的产品
 *
 * 结合其他模式：
 *  1.具体工厂实现类可以用“单例模式”实现
 *  2.在抽象工厂中定义的创建接口其实是“工厂方法模式”的表现
 */
public class Client {

    public static void main(String[] args){
        GUIFactory guiFactory = new MacGUIFactory();
        Button button = guiFactory.createButton();
        ToolBar toolBar = guiFactory.createToolBar();
        button.draw();
        toolBar.draw();

    }
}
