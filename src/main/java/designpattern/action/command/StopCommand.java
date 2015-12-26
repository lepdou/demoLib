package designpattern.action.command;

public class StopCommand implements Command{
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void execute() {
        System.out.println(">>>>>>>>>>add log<<<<<<<<<<<<");
        audioPlayer.stop();
    }
}
