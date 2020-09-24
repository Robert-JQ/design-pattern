package structural.bridge.abstraction_change;

public interface FileDownloaderAbstraction {

    Object download(String path);

    boolean store(Object object);

    boolean delete(String object);
}
