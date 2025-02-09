package org.example.kadalma;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class mainController {

    private Stage stage;
    private Scene scene;

    @FXML
    RadioButton cr1, cr2, cr3, cr4, cr5;
    Label resPoint;
    @FXML
    ToggleGroup q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;


    @FXML
    RadioButton cr6, cr7, cr8, cr9, cr10;

    public int counter = 0;
    controllerRes c = new controllerRes();


    public void switchTo2Part(ActionEvent event) throws IOException {
        if (isAnyRadioButtonSelected(cr1, cr2, cr3, cr4, cr5)) {
            if(cr1.isSelected()) counter++;
            if(cr2.isSelected()) counter++;
            if(cr3.isSelected()) counter++;
            if(cr4.isSelected()) counter++;
            if(cr5.isSelected()) counter++;
            if (resPoint != null){
                resPoint.setText(String.valueOf(counter));
            }
            FXMLLoader loader = new FXMLLoader(getClass().getResource("secondPage.fxml"));
            Parent root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            System.out.println("Counter value: " + counter);

        } else {
            System.out.println("Пожалуйста, выберите ответы на все вопросы.");
        }
    }

    public void switchToFinish(ActionEvent event) throws IOException {
        if (isAnyRadioButtonSelected(cr6, cr7, cr8, cr9, cr10)) {
            if(cr6.isSelected()) counter++;
            if(cr7.isSelected()) counter++;
            if(cr8.isSelected()) counter++;
            if(cr9.isSelected()) counter++;
            if(cr10.isSelected()) counter++;

            if (resPoint != null)resPoint.setText(String.valueOf(Integer.parseInt(resPoint.getText()) + counter));

            FXMLLoader loader = new FXMLLoader(getClass().getResource("resPage.fxml"));
            Parent root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            System.out.println("Counter value: " + counter);
        } else {
            System.out.println("Пожалуйста, выберите ответы на все вопросы.");
        }
    }

    private boolean isAnyRadioButtonSelected(RadioButton... radioButtons) {
        for (RadioButton rb : radioButtons) {
            if (rb.isSelected()) {
                return true;
            }
        }
        return false;
    }
}
