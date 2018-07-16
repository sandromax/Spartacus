package io.sandromax.domain.windows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ModalNewLayer {

    private static String name;

    public static String display() {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("New Name");
        window.setMinWidth(350);
        Label label = new Label();
        label.setText("Enter new layer name");
        TextField textField = new TextField();

        Button confirmBtn = new Button("Confirm");

        confirmBtn.setOnAction(e -> {
            name = textField.getText();
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, confirmBtn, textField);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return name;
    }
}
