package io.sandromax.logic.tree;

import io.sandromax.domain.tree.Area;
import io.sandromax.domain.tree.Project;

public interface ITreeLogic {
    Project newProject(String name);

    Project renameProject(String newName);

    Area newArea(String name);

    Area renameArea(String newName);

    boolean moveArea(Area parentArea);

    boolean deleteArea();

}
