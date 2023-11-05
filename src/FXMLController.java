
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author My Pc
 */
public class FXMLController implements Initializable {

    @FXML
    private javafx.scene.control.Label lblName;
    @FXML
    private javafx.scene.control.Label lblGreeting;
    @FXML
    private javafx.scene.control.Label lblGreeting1;
    @FXML
    private javafx.scene.control.Label lblGreeting2;
    @FXML
    private javafx.scene.control.Label lblGreeting21;
    @FXML
    private javafx.scene.control.Label lblGreeting211;
    @FXML
    private VBox vTaskItems;
    @FXML
    private Button btnEX;
    @FXML
    private VBox vTaskItemsupcoming;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (event.getSource() == btnEX) {
            System.exit(0);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        List<TasksModel> model = new ArrayList<>();
        model.add(new TasksModel("Fix bug on issue #87 ", "InComplete", new Image(getClass().getResourceAsStream("/icons/icons8_in_progress_24px_1.png"))));
        model.add(new TasksModel("Fix bug on issue #84 ", "InComplete", new Image(getClass().getResourceAsStream("/icons/icons8_in_progress_24px_1.png"))));
        model.add(new TasksModel("Fix Label - Bug ", "Complete", new Image(getClass().getResourceAsStream("/icons/icons8_Checkmark_24px_1.png"))));
        model.add(new TasksModel("Fix bug on 7", "Complete", new Image(getClass().getResourceAsStream("/icons/icons8_Checkmark_24px_1.png"))));
        model.add(new TasksModel("Fix bug on issue #87 ", "InComplete", new Image(getClass().getResourceAsStream("/icons/icons8_in_progress_24px_1.png"))));
        model.add(new TasksModel("Remove Button on FXML Project 23", "Complete", new Image(getClass().getResourceAsStream("/icons/icons8_Checkmark_24px_1.png"))));

        
        Node[] nodes = new Node[model.size()];
        for (int i = 0; i < nodes.length; i++) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("TaskItem.fxml"));
                TaskItemController controller = new TaskItemController();
                loader.setController(controller);
                nodes[i] = loader.load(); 
                vTaskItems.getChildren().add(nodes[i]);
                controller.setTask(model.get(i));
                
            } catch (Exception e) {
            }
        }

        Node[] nodesUpcoming = new Node[10];
        for (int i = 0; i < nodesUpcoming.length; i++) { // Fix the for loop
            try {
                nodes[i] = FXMLLoader.load(getClass().getResource("TaskItem.fxml")); // Correct the typo in "getResources"
                vTaskItemsupcoming.getChildren().add(nodes[i]); // Add nodes to vTaskItemsComplete, not vTaskItems
            } catch (Exception e) {
            }
        }
    }
}