package behavior.chain_of_responsibility;

public class ClientProgram {

    public static void main(String[] args) {
        TeamLeader tl = new TeamLeader();
        ProjectLeader pl = new ProjectLeader();
        HR hr = new HR();

        tl.setNextHandler(pl);
        tl.setNextHandler(hr);

        tl.approve(new Leave(1, 5));
        tl.approve(new Leave(2, 15));
        tl.approve(new Leave(3, 25));
        tl.approve(new Leave(4, 35));
    }

}
