package structural.bridge.implementation_change;

public interface FileDownloadImplementor {

    Object downloadFile(String path);

    boolean storeFile(Object object);

    boolean delete(String object);
}
