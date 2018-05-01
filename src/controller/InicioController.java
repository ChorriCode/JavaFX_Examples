package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import Samples.colorfulcircles.*;
import Samples.webviewsample.WebViewSample;

public class InicioController {
	
    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button6;

    @FXML
    private Button button1;

    @FXML
    void showExample1(ActionEvent event) {
    	ColorfulCircles sample1 = new ColorfulCircles();
    	Stage p = new Stage();
		sample1.start(p);
    }
    
    @FXML
    void showExample2(ActionEvent event) {
    	WebViewSample sample2 = new WebViewSample();
    	Stage p = new Stage();
		sample2.start(p);
    }


}
