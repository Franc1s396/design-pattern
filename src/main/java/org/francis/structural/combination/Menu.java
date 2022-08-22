package org.francis.structural.combination;

import java.util.List;

/**
 * @author Franc1s
 * @date 2022/8/22
 * @apiNote
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList;

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addMenu(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void removeMenu(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    void print() {
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
