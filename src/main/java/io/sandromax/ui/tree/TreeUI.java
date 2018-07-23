package io.sandromax.ui.tree;

import io.sandromax.domain.tree.Area;
import io.sandromax.domain.tree.Project;
import javafx.scene.control.TreeView;

public interface TreeUI {
    TreeView<String> newProject(TreeView<String> treeView, String name);

    TreeView<String> renameProject(TreeView<String> treeView, String newName);

    TreeView<String> newArea(TreeView<String> treeView, String name);

    TreeView<String> renameArea(TreeView<String> treeView, String newName);

    TreeView<String> moveArea(TreeView<String> treeView, Area parentArea);

    TreeView<String> deleteArea(TreeView<String> treeView);
}
