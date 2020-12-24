package be.intecbrussel;

public class MediaAdapter extends MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    //constructor
    MediaAdapter(FileType fileType) {
        switch (fileType) {
            case MP4:
                advancedMediaPlayer = new Mp4Player();
                break;
            case VLC:
                advancedMediaPlayer = new VlcPlayer();
                break;
        }
    }

    //method
    @Override
    void play(FileType fileType, String fileName) {
        switch (fileType) {
            case MP4:
                advancedMediaPlayer.playMp4(fileName);
                break;
            case VLC:
                advancedMediaPlayer.playVlc(fileName);
                break;
        }
    }
}