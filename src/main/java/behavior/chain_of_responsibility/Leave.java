package behavior.chain_of_responsibility;

public class Leave {

    private int leaveId;
    private int numberOfDays;

    public Leave(int leaveId, int numberOfDays) {
        this.leaveId = leaveId;
        this.numberOfDays = numberOfDays;
    }

    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
