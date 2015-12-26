package designpattern.action.command;

public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        System.out.println(">>>>>>>>>>add log<<<<<<<<<<<<");
        audioPlayer.play();
    }
}
