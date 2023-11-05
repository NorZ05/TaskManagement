/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


//*
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent; // Import MouseEvent from the correct package
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ProjectManagementAndTaskTracker extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml")); // Correct the typo in "getResources" to "getResource"
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT); // Correct the typo in "initstyle" to "initStyle"

        root.setOnMousePressed((MouseEvent event)-> {
            
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
           
        });

        root.setOnMouseDragged((MouseEvent event)-> {
            
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
