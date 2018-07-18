package io.sandromax.layers;

import java.util.ArrayList;
import java.util.List;

/**
 * Описывает область строительства
 * Describes area of construction
 */
public class Area {
    private String name;
    private Area parentArea;
    private ArrayList<Area> children;

    public Area() {
    }

    private Area(String name, Area parentArea) {
        this.name = name;
        this.parentArea = parentArea;
    }

    public Area(String name, Area parentArea, ArrayList<Area> children) {
        this.name = name;
        this.parentArea = parentArea;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public Area getParentArea() {
        return parentArea;
    }

    public void setParentArea(Area parentArea) {
        this.parentArea = parentArea;
    }

    public ArrayList<Area> getChildren() {
        return children;
    }

    public void addChild(Area child) {
        children.add(child);
    }
}
