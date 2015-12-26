package designpattern.action.command;

/**
 * （Command）命令模式
 *  核心：本来Client可以自己直接调用AudioPlayer的操作方法，但是引入Command中间这一层，
 *  可以更灵活。解耦调用方和具体执行方的联系。另外在Command这一层可以增加比如回退，增加日志等功能。
 *  另一方面可以组合很多Command形成宏命令。
 */
public class Client {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        String keyword = "s";
        if ("s".equals(keyword)){
            new PlayCommand(player).execute();
        }else if ("p".equals(keyword)){
            new StopCommand(player).execute();
        }

        System.out.println(">>>>>>>>> macro command <<<<<<<<<<<<<");
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(new PlayCommand(player))
                .addCommand(new StopCommand(player));
        macroCommand.execute();


    }
}
