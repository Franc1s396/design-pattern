package org.francis.behavioral.responsibilitychain;

/**
 * @author Franc1s
 * @date 2022/8/24
 * @apiNote
 */
public class GroupLeader extends HandlerChain{
    public GroupLeader() {
        super(0, HandlerChain.NUM_1);
    }

    @Override
    protected void handleLevelRequest(LeaveRequest leaveRequest) {
        System.out.println("小组组长处理请假");
    }
}
