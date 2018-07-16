package io.sandromax.domain.layers;

import java.util.List;

/**
 * Описывает область строительства
 * Describes area of construction
 */
public class Area {
    private String name;
    private Layer layer;

    public Area() {
    }

    private Area(String name, Layer layer) {
        this.name = name;
        this.layer = layer;
    }

    public static Area createNewArea(String name, Layer layer, List<Area> areaList) {
        Area newArea = new Area(name, layer);

        if(!hasSameArea(newArea, areaList)) {
            return newArea;
        }

        return null;
    }

    private static boolean hasSameArea(Area areaNew, List<Area> areaList) {
        for(Area areaInList : areaList) {
            if(areaNew.name.equals(areaInList.name) & areaNew.layer.equals(areaInList.layer)) {
                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Layer getLayer() {
        return layer;
    }

    public void setLayer(Layer layer) {
        this.layer = layer;
    }
}
