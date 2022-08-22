package org.francis.structural.combination;

import java.util.Objects;

/**
 * @author Franc1s
 * @date 2022/8/22
 * @apiNote
 */
public abstract class MenuComponent {
    protected String name;
    protected Integer level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuComponent that = (MenuComponent) o;
        return Objects.equals(name, that.name) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

    /**
     * 添加
     */
    public void addMenu(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除
     */
    public void removeMenu(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取子菜单或子菜单项
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    abstract void print();
}
