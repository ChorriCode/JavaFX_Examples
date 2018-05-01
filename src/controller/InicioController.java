package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import Samples.animation.Animation;
import Samples.canvastest.CanvasTest;
import Samples.colorfulcircles.*;
import Samples.helloeffects.HelloEffects;
import Samples.login.Login;
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
    	Stage primaryStage = new Stage();
		sample1.start(primaryStage);
    }
    
    @FXML
    void showExample2(ActionEvent event) {
    	WebViewSample sample2 = new WebViewSample();
    	Stage primaryStage = new Stage();
		sample2.start(primaryStage);
    }

    @FXML
    void showExample3(ActionEvent event) {
    	Login sample3 = new Login();
    	Stage primaryStage = new Stage();
		sample3.start(primaryStage);
    }
    
    @FXML
    void showExample4(ActionEvent event) {
    	Animation sample4 = new Animation();
    	Stage primaryStage = new Stage();
		sample4.start(primaryStage);
    }
    
    @FXML
    void showExample5(ActionEvent event) {
    	HelloEffects sample5 = new HelloEffects();
    	Stage primaryStage = new Stage();
			sample5.start(primaryStage);
    }
    
    
    @FXML
    void showExample6(ActionEvent event) {
    	CanvasTest sample6 = new CanvasTest();
    	Stage primaryStage = new Stage();
			sample6.start(primaryStage);
    }
    
}
