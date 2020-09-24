package structural.bridge.implementation_change;

import structural.bridge.FileDownloadImplementor;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor {

    public Object downloadFile(String path) {
        return new Object();
    }

    public boolean storeFile(Object object) {
        System.out.println("File download successfully in WINDOWS!!");
        return true;
    }

    public boolean delete(String object) {
        return false;
    }
}
