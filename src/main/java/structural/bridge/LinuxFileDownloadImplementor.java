package structural.bridge;

public class LinuxFileDownloadImplementor implements FileDownloadImplementor {

    public Object downloadFile(String path) {
        return new Object();
    }

    public boolean storeFile(Object object) {
        System.out.println("File download successfully in LINUX!!");
        return true;
    }
}
