package be.intecbrussel;

public abstract class MediaPlayer {
    private FileType fileType;

    public enum FileType {
        MP3 ("mp3"),
        MP4 ("mp4"),
        VLC ("vlc");

        private String fileExtension;

        FileType (String fileExtension) {
            this.fileExtension = fileExtension;
        }

        public String getFileExtension() {
            return fileExtension;
        }
    }

    abstract void play(FileType fileType, String fileName) throws MismatchFileType;
}