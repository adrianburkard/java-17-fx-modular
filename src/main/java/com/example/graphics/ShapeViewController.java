package com.example.graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ShapeViewController implements Initializable {

    private Rectangular rectangular;

    @FXML
    public TextField inputFieldWidth;

    @FXML
    public TextField inputFieldHeight;

    @FXML
    public Button computeButton;

    @FXML
    public Label circumferenceTextField;

    @FXML
    public Label areaTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.rectangular = new Rectangular(0,0,0,2);
        inputFieldWidth.setTextFormatter(new DecimalTextFormatter(0, 10));
        inputFieldHeight.setTextFormatter(new DecimalTextFormatter(0, 10));
    }

    @FXML
    public void handleComputeButton(ActionEvent actionEvent) {
        rectangular.setWidth(Double.parseDouble(inputFieldWidth.getText()));
        rectangular.setHeight(Double.parseDouble(inputFieldHeight.getText()));
        circumferenceTextField.setText(String.valueOf(rectangular.computeCircumference()));
        areaTextField.setText(String.valueOf(rectangular.computeArea()));
    }

}
