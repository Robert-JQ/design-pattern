package behavior.chain_of_responsibility;

public interface ApproveHandler {

    void setNextHandler(ApproveHandler nextHandler);

    void approve(Leave leave);

}
