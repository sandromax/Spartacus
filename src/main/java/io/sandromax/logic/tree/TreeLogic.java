package io.sandromax.logic.tree;

import io.sandromax.domain.tree.Area;
import io.sandromax.domain.tree.Project;

public class TreeLogic implements ITreeLogic {
    @Override
    public Project newProject(String name) {
        return null;
    }

    @Override
    public Project renameProject(String newName) {
        return null;
    }

    @Override
    public Area newArea(String name) {
        return null;
    }

    @Override
    public Area renameArea(String newName) {
        return null;
    }

    @Override
    public boolean moveArea(Area parentArea) {
        return false;
    }

    @Override
    public boolean deleteArea() {
        return false;
    }
}
