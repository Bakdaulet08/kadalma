package org.example.kadalma;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class controllerRes {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label resPoint;

    public int cnt;


    @FXML
    void initialize() {
        assert resPoint != null : "fx:id=\"resPoint\" was not injected: check your FXML file 'resPage.fxml'.";
        resPoint.setText(String.valueOf(cnt));

    }

    public int getCnt() {
        return cnt;
    }

    public controllerRes() {
        this.cnt = cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
    public void addcount(int count){
        cnt+=count;
    }

    private void pastePoint(int point) {
        resPoint.setText(String.valueOf(point));
    }

}

