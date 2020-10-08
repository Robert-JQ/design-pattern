package behavior.chain_of_responsibility;

public class HR implements ApproveHandler {

    private ApproveHandler nextHandler;

    private static final int MAX_LEAVES_CAN_APPROVE = 30;

    @Override
    public void setNextHandler(ApproveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void approve(Leave leave) {
        if (leave.getNumberOfDays() < MAX_LEAVES_CAN_APPROVE) {
            String output = String.format("LeaveId:%d,Days:%d,Approver:%s",
                    leave.getLeaveId(), leave.getNumberOfDays(), "HR");
            System.out.println(output);
        } else {
            if (nextHandler != null) {
                nextHandler.approve(leave);
            }
        }
    }
}
