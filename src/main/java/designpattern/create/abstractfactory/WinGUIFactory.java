package designpattern.create.abstractfactory;

public class WinGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public ToolBar createToolBar() {
        return new WinToolBar();
    }
}
