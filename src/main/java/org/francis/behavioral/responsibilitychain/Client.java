package org.francis.behavioral.responsibilitychain;

/**
 * @author Franc1s
 * @date 2022/8/24
 * @apiNote
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setName("mwc");
        leaveRequest.setNum(2);
        leaveRequest.setContent("生病");

        HandlerChain groupLeader=new GroupLeader();
        groupLeader.setHandlerChain(new Manager());

        groupLeader.submit(leaveRequest);
    }
}
