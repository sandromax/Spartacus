package io.sandromax.storage.tree.json;

import io.sandromax.domain.tree.Area;
import io.sandromax.domain.tree.Project;
import io.sandromax.storage.errors.StorageError;
import io.sandromax.storage.tree.TreeStorage;
import io.sandromax.storage.tree.xml.XMLTreeStorage;

public class JsonTreeStorage implements TreeStorage{

    @Override
    public StorageError newProject(Project project) {
        return null;
    }

    @Override
    public StorageError renameProject(String newName) {
        return null;
    }

    @Override
    public StorageError newArea(String name) {
        return null;
    }

    @Override
    public StorageError renameArea(String newName) {
        return null;
    }

    @Override
    public StorageError moveArea(Area parentArea) {
        return null;
    }

    @Override
    public StorageError deleteArea() {
        return null;
    }
}
