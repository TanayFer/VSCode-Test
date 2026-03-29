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