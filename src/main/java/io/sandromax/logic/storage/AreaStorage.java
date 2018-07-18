package io.sandromax.logic.storage;

import io.sandromax.layers.Area;

public interface AreaStorage {
    boolean addNewArea(Area newArea);

    boolean deleteArea(Area area);

    boolean moveArea(Area areaFrom, Area areaTo);
}
