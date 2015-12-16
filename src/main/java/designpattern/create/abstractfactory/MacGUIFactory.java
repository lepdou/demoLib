package designpattern.create.abstractfactory;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ToolBar createToolBar() {
        return new MacToolBar();
    }
}
