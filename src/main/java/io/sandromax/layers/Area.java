package io.sandromax.layers;

import java.util.ArrayList;
import java.util.List;

/**
 * Описывает область строительства
 * Describes area of construction
 */
public class Area extends Layer{
    private Area parentArea;

    private Area(String name, Area parentArea) {
        super(name);
        this.parentArea = parentArea;
    }

    public Area(String name, Area parentArea, ArrayList<Area> children) {
        super(name, children);
        this.parentArea = parentArea;
    }

    public String getName() {
        return super.getName();
    }

    public Area getParentArea() {
        return parentArea;
    }

    public void setParentArea(Area parentArea) {
        this.parentArea = parentArea;
    }

    public ArrayList<Area> getChildren() {
        return super.getChildren();
    }

    public void addChild(Area child) {
        super.getChildren().add(child);
    }
}
