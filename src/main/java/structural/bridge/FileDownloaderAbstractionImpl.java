package structural.bridge;

public class FileDownloaderAbstractionImpl implements  FileDownloaderAbstraction {

    private FileDownloadImplementor provider = null;

    public FileDownloaderAbstractionImpl(FileDownloadImplementor provider) {
        super();
        this.provider = provider;
    }

    public Object download(String path) {
        return provider.downloadFile(path);
    }

    public boolean store(Object object) {
        return provider.storeFile(object);
    }
}
