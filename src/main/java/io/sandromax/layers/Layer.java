package io.sandromax.layers;


import java.util.ArrayList;
import java.util.List;

/**
 * Позволяет разделять стройку на слои, в которых размещаються области
 *
 */
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
}
