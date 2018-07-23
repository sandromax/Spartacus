package io.sandromax.storage.tree;

import io.sandromax.domain.tree.Area;
import io.sandromax.domain.tree.Project;
import io.sandromax.storage.errors.StorageError;

public interface TreeStorage {
    StorageError newProject(Project project);

    StorageError renameProject(String newName);

    StorageError newArea(String name);

    StorageError renameArea(String newName);

    StorageError moveArea(Area parentArea);

    StorageError deleteArea();
}
