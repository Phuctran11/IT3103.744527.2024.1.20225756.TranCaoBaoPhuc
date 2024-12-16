package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class PainterController {

    @FXML
    private Pane drawingAreaPane; 

    @FXML
    private ToggleGroup identical; 

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear(); 
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        double x = event.getX();
        double y = event.getY();

      
        if (x >= 0 && x <= drawingAreaPane.getWidth() && y >= 0 && y <= drawingAreaPane.getHeight()) {
            if (((RadioButton) identical.getSelectedToggle()).getText().equals("Pen")) {
                Circle newCircle = new Circle(x, y, 4, Color.BLACK);
                drawingAreaPane.getChildren().add(newCircle); 
            } else if (((RadioButton) identical.getSelectedToggle()).getText().equals("Eraser")) {
                Circle eraserCircle = new Circle(x, y, 10, Color.WHITE); 
                drawingAreaPane.getChildren().add(eraserCircle); 
            }
        }
    }
}
