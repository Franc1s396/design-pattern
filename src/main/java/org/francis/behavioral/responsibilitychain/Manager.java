package org.francis.behavioral.responsibilitychain;

/**
 * @author Franc1s
 * @date 2022/8/24
 * @apiNote
 */
public class Manager extends HandlerChain{
    public Manager() {
        super(HandlerChain.NUM_1, HandlerChain.NUM_3);
    }

    @Override
    protected void handleLevelRequest(LeaveRequest leaveRequest) {
        System.out.println("总经理处理请假");
    }
}
