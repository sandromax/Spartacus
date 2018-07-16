package io.sandromax.domain.controllers;

import io.sandromax.domain.windows.ModalNewLayer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class WindowMain implements Initializable {
    @FXML
    TreeView<String> treeView;
    @FXML
    TabPane tabPane;

    Image iconBus = new Image(getClass().getResourceAsStream("/img/bus.png"));
    Image iconHouse = new Image(getClass().getResourceAsStream("/img/house.png"));
    Image iconTrowel = new Image(getClass().getResourceAsStream("/img/trowel.png"));
    Image iconTrowel16 = new Image(getClass().getResourceAsStream("/img/trowel-16.png"));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(iconHouse.getHeight());
        System.out.println(iconHouse.getWidth());

//        ImageView ivTowel16 = new ImageView(iconTrowel16);

//        ImageView ivHouse = new ImageView();
//        iv2.setImage(iconHouse);
//        ivHouse.setFitWidth(16);
//        ivHouse.setPreserveRatio(true);
//        ivHouse.setSmooth(true);
//        ivHouse.setCache(true);
//
//        ImageView ivBus1 = new ImageView(iconBus);
//        ivBus1.setFitWidth(16);
//        ivBus1.setPreserveRatio(true);
//        ivBus1.setSmooth(true);
//        ivBus1.setCache(true);
//        ImageView ivBus2 = new ImageView(iconBus);
//        ivBus2.setFitWidth(16);
//        ivBus2.setPreserveRatio(true);
//        ivBus2.setSmooth(true);
//        ivBus2.setCache(true);
//        ImageView ivBus3 = new ImageView(iconBus);
//        ivBus3.setFitWidth(16);
//        ivBus3.setPreserveRatio(true);
//        ivBus3.setSmooth(true);
//        ivBus3.setCache(true);


        ImageView ivTrowel = new ImageView(iconTrowel);
//        iv4.setImage(iconHouse);
        ivTrowel.setFitWidth(16);
        ivTrowel.setPreserveRatio(true);
        ivTrowel.setSmooth(true);
        ivTrowel.setCache(true);

        TreeItem<String> root = new TreeItem<>("Project", ivTrowel);
        root.setExpanded(true);

        TreeItem<String> node0 = new TreeItem<>("House");
        TreeItem<String> node1 = new TreeItem<>("Yard");
        TreeItem<String> node2 = new TreeItem<>("Barn");
        TreeItem<String> nodePlus = new TreeItem<>("+");

        TreeItem<String> subNode0 = new TreeItem<>("Kitchen");
        TreeItem<String> subNode1 = new TreeItem<>("Roof");
        TreeItem<String> subNodePlus = new TreeItem<>("+");
        node0.getChildren().addAll(subNode0, subNode1, subNodePlus);


        root.getChildren().addAll(node0, node1, node2, nodePlus);
        treeView.setRoot(root);

    }

    public void mouseClickOnTree(MouseEvent mouseEvent) {
        TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();
        if(selectedItem != null) {
            if(mouseEvent.getButton().equals(MouseButton.SECONDARY)) {
                rightClickHandle(selectedItem);
            }
            else {
                leftClickHandle(selectedItem);
            }
        }


//        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
//        if(item != null) {
//            System.out.println("tree: " + item.getValue());
//
//            Tab selectedTab = tabPane.getSelectionModel().getSelectedItem();
//            System.out.println("tab: " + selectedTab.getId());
//
//            if(item.getValue().equals("+")) {
//                if(mouseEvent.getButton() == MouseButton.SECONDARY) {
//                    System.out.println("Right Click");
//
//                    treeViewPlusMenu(item).show(item.getGraphic(), Side.BOTTOM, 0,0);
//
//                    return;
//                }
//
//                String newLayerName = ModalNewLayer.display();
//                if(newLayerName.length() > 0) {
//                    item.getParent().getChildren().add(new TreeItem<>(newLayerName));
//                    newLayerName = null;
//                    plusToEnd(item.getParent());
//                }
//            }
//        }

    }

    private void rightClickHandle(TreeItem<String> selectedItem) {
        callLayerMenu(selectedItem);
    }

    private void callLayerMenu(TreeItem<String> selectedItem) {

    }

    private void leftClickHandle(TreeItem<String> selectedItem) {

    }

    private ContextMenu treeViewPlusMenu(TreeItem<String> item) {
        final ContextMenu contextMenu = new ContextMenu();
        MenuItem layerInside = new MenuItem("Inside layer");
        MenuItem delete = new MenuItem("Delete");

        layerInside.setOnAction(event -> {
            String newLayerName = ModalNewLayer.display();
            if(newLayerName.length() > 0) {
                item.getChildren().add(new TreeItem<>(newLayerName));
                newLayerName = null;
                plusToEnd(item);
            }
        });

        contextMenu.getItems().addAll(layerInside, delete);

        return contextMenu;
    }

    private void plusToEnd(TreeItem<String> treeItem) {
        treeItem.getChildren().remove(new TreeItem<>("+"));
        treeItem.getChildren().add(new TreeItem<>("+"));
    }



}
