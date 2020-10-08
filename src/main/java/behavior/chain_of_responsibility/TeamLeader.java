package behavior.chain_of_responsibility;

public class TeamLeader implements ApproveHandler {

    private ApproveHandler nextHandler;

    public static final int MAX_LEAVES_CAN_APPROVE = 10;

    @Override
    public void setNextHandler(ApproveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void approve(Leave leave) {
        if (leave.getNumberOfDays() < MAX_LEAVES_CAN_APPROVE) {
            String output = String.format("LeaveId:%d,Days:%d,Approver:%s",
                    leave.getLeaveId(), leave.getNumberOfDays(), "TeamLeader");
            System.out.println(output);
        } else {
            if (nextHandler != null) {
                nextHandler.approve(leave);
            }
        }
    }
}
