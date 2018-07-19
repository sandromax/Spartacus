package io.sandromax.storage;

import io.sandromax.domain.tree.Project;

import java.nio.file.Path;

public interface ProjectStorage {
    void save(Project project);

    Project download(Path pathToFile);

    int synchronize(Project project);
}
