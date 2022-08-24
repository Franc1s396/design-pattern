package org.francis.behavioral.responsibilitychain;

import lombok.Data;

/**
 * @author Franc1s
 * @date 2022/8/24
 * @apiNote
 */
@Data
public abstract class HandlerChain {
    protected static final int NUM_1=1;
    protected static final int NUM_3=3;
    protected static final int NUM_7=7;

    private int numStart;
    private int numEnd;
    private HandlerChain handlerChain;

    public HandlerChain(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    protected abstract void handleLevelRequest(LeaveRequest leaveRequest);

    public void submit(LeaveRequest leaveRequest){
        handleLevelRequest(leaveRequest);
        if (handlerChain!=null && leaveRequest.getNum()>numEnd){
            handlerChain.submit(leaveRequest);
        }else {
            System.out.println("处理完毕");
        }
    }
}
