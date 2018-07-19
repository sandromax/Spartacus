package io.sandromax.domain.tree;

import java.util.ArrayList;

public class Layer {
    private String name;
    private ArrayList<Area> children;

    public Layer(String name) {
        this.name = name;
    }

    public Layer(String name, ArrayList<Area> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Area> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Area> children) {
        this.children = children;
    }

    public void addChild(Area area) {
        children.add(area);
    }
}
