package structural.proxy;

public class ProxyDesignPatternMain {

    public static void main(String[] args) {
        User user = new User("jqq", "123");
        FolderProxy folderProxy = new FolderProxy(user);
        System.out.println("When username and password are correct:");
        folderProxy.performOperations();
        System.out.println("**********************");
        User userWrong = new User("lskj", "jgh");
        FolderProxy folderProxyWrong = new FolderProxy(userWrong);
        System.out.println("When username and password are wrong:");
        folderProxyWrong.performOperations();
    }

}
