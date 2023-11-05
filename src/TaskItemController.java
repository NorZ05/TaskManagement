/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author My Pc
 */
public class TaskItemController implements Initializable {

    @FXML
    private ImageView iconSelect;
    @FXML
    private Label lblTaskName;
    @FXML
    private Button btnInfo;
    
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
        
    }
    
    public void setTask(TasksModel model)
    {
        lblTaskName.setText(model.getTaskName());
        btnInfo.setText(model.getTaskStatus());
        iconSelect.setImage(model.getIcon());
        
        ContextMenu menu = new ContextMenu();
        if(model.getTaskStatus().equalsIgnoreCase("InComplete"))
        {
         menu.getItems().add(new MenuItem("Set Task Complete"));   
        }else{
            menu.getItems().add(new MenuItem("Set Task InComplete"));
        }
        lblTaskName.setContextMenu(menu);
        
    }
}
