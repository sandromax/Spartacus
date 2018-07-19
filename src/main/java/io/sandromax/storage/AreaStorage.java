package io.sandromax.storage;


import io.sandromax.domain.tree.Area;

public interface AreaStorage {
    boolean addNewArea(Area newArea);

    boolean deleteArea(Area area);

    boolean moveArea(Area areaFrom, Area areaTo);
}
