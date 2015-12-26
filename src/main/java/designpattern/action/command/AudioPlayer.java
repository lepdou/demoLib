package designpattern.action.command;

/**
 * 请求接受者，在简化版本中，可以不要这个角色
 */
public class AudioPlayer {

    public void play(){
        System.out.println("play");
    }

    public void stop(){
        System.out.println("stop");
    }
}
