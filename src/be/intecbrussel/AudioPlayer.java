package be.intecbrussel;

public class AudioPlayer extends MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(FileType fileType, String fileName) throws MismatchFileType {

        MismatchFileTypeChecker(fileType,fileName);

        if (fileType == FileType.MP3) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        }
    }

    public void MismatchFileTypeChecker (FileType fileType, String fileName) throws MismatchFileType {
        if(!fileName.contains(fileType.getFileExtension())) {
            throw new MismatchFileType("Skipped file due to " + fileName + " not having the correct extension " + fileType.getFileExtension() + "\n");
        }
    }
}