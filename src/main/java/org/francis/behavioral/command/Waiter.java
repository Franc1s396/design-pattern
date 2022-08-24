package org.francis.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Franc1s
 * @date 2022/8/23
 * @apiNote
 */
public class Waiter {
    private List<Command> commandList;

    public void addCommand(Command command) {
        if (commandList == null) {
            commandList = new ArrayList<>();
        }
        commandList.add(command);
    }

    public void orderUp() {
        commandList.forEach(Command::execute);
    }
}
