package org.francis.craetor.prototype;

import lombok.Data;

/**
 * @author Franc1s
 * @date 2022/8/21
 * @apiNote
 */
@Data
public class User implements Cloneable{
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
