package org.francis.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Franc1s
 * @date 2022/8/22
 * @apiNote
 */
public class BoxFactory {
    public static BoxFactory boxFactory;

    private Map<String, AbstractBox> boxMap;

    private BoxFactory() {
        boxMap =new HashMap<>();
        boxMap.put("I",new IBox());
        boxMap.put("L",new LBox());
    }

    public static BoxFactory getInstance() {
        if (boxFactory == null) {
            synchronized (BoxFactory.class) {
                if (boxFactory == null) {
                    boxFactory = new BoxFactory();
                }
            }
        }
        return boxFactory;
    }

    public AbstractBox getShape(String name){
        return boxMap.get(name);
    }
}
