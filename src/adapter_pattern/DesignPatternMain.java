package adapter_pattern;

interface MediaPackage {
    void playFile(String fileName);
}
interface MediaPlayer {
    void play(String fileName);
}

class MKV implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("playing MKV file : " + fileName);
    }
}

class Mp3 implements MediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("playing mp3 file : " + fileName);
    }
}

class Mp4 implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("playing mp4 file : " + fileName);
    }
}

class FormatAdapter implements MediaPlayer{

    private MediaPackage mMedia;

    FormatAdapter(MediaPackage media) {
        mMedia = media;
    }
    @Override
    public void play(String fileName) {
        System.out.println("using adapter : ");
        mMedia.playFile(fileName);
    }
}
public class DesignPatternMain {

    public static void main(String[] args) {
        MediaPlayer player = new Mp3();
        player.play("mp3 file");

        player = new FormatAdapter(new Mp4());
        player.play("file mp4");

        player = new FormatAdapter(new MKV());
        player.play("mkv");
    }
}
