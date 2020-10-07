package behavior.observer;

public class ObserverPatternMain {

    public static void main(String[] args) {
        OfficialAccount csdn = new OfficialAccount("csdn");
        OfficialAccount infoq = new OfficialAccount("infoq");

        Follower mark = new Follower("Mark");
        Follower eric = new Follower("Eric");
        Follower jack = new Follower("Jack");
        Follower frank = new Follower("Frank");
        Follower daniel = new Follower("Daniel");
        Follower alice = new Follower("Alice");

        csdn.register(mark);
        csdn.register(eric);
        csdn.register(jack);

        infoq.register(frank);
        infoq.register(daniel);
        infoq.register(alice);

        csdn.pushArticle("observer design pattern video course");
        infoq.pushArticle("spring 5.0 is out");

        csdn.unregister(eric);
        csdn.pushArticle("core java course is released");

    }

}
