package org.francis.behavioral.command;

/**
 * @author Franc1s
 * @date 2022/8/23
 * @apiNote
 */
public class OrderCommand implements Command{
    private Chief chief;

    @Override
    public void execute() {
        chief.execute();
    }
}
