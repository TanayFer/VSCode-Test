abstract class CloudService {
    abstract void uploadFile(String name);
}

class GoogleDrive extends CloudService {
    @Override
    void uploadFile(String name) {
        System.out.println("Uploading " + name + " to Google Drive");
    }
}

class Dropbox extends CloudService {
    @Override
    void uploadFile(String name) {
        System.out.println("Uploading " + name + " to Dropbox");
    }
}