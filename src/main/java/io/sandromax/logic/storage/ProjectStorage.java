package io.sandromax.logic.storage;

import io.sandromax.layers.Project;

import java.nio.file.Path;

public interface ProjectStorage {
    void save(Project project);

    Project download(Path pathToFile);

    int synchronize(Project project);
}
