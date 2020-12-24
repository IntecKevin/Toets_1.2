package be.intecbrussel;

public class App {
    public static void main(String[] args) throws MismatchFileType {
        MediaPlayer walkMan = new AudioPlayer();

        walkMan.play(MediaPlayer.FileType.MP3,"Micheal Jackson.mp3");
        walkMan.play(MediaPlayer.FileType.MP4,"Elvis.mp4");
        walkMan.play(MediaPlayer.FileType.VLC,"Beatles.vlc");

        //deze geeft gevraagde error
        walkMan.play(MediaPlayer.FileType.MP3,"ABBA.vlc");
        //hetvolgende word dus niet uitgevoerd zoals gevraagd
        walkMan.play(MediaPlayer.FileType.MP3,"Rolling Stones.mp3");
    }
}