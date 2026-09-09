abstract class MediaFile {
    abstract void play();
}

class Video extends MediaFile {
    @Override
    void play() {
        System.out.println("Playing video...");
    }
}

class Audio extends MediaFile {
    @Override
    void play() {
        System.out.println("Playing audio...");
    }
}

public class a {
    public static void main(String[] args) {
        MediaFile video = new Video();
        MediaFile audio = new Audio();

        video.play();
        audio.play();
    }
}