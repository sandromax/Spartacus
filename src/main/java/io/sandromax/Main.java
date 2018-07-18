package io.sandromax;

import io.sandromax.windows.ModalWindowExample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        Parent mainBorder = FXMLLoader.load(getClass().getResource("/WindowMain.fxml"));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

//        Scene scene = new Scene(main, 800, 600);
        Scene scene = new Scene(mainBorder);

//        Text scenetitle = new Text("Please Login: ");
//        scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
//        Label userName = new Label("User Name:");
//        TextField userTextField = new TextField();
//        Label pw = new Label("Password: ");
//        PasswordField pwBox = new PasswordField();

//        grid.add(scenetitle,0,0,2,1);
//        grid.add(userName,0,1);
//        grid.add(userTextField, 1,1);
//        grid.add(pw,0,2);
//        grid.add(pwBox,1,2);

        grid.setGridLinesVisible(false);

        Button btn = new Button("Press the button");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);

        btn.setOnAction(e ->
        {
            ModalWindowExample.display("modal", "bon nui");
            ModalWindowExample.display("modal2", "bon nui");
            ModalWindowExample.display("modal3", "bon nui");
            ModalWindowExample.display("modal4", "bon nui");
        });

        primaryStage.setTitle("Spartacus");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
