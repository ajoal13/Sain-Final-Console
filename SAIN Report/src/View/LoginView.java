package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LoginView extends Application{

	HBox loginBoxUpper, loginBoxLower; // for input
	VBox loginWindow;
	Label userIDLbl;
	Label passwordLbl;
	TextField userIDTxt;
	TextField passwordTxt;
	Button okButton;
	Button exitButton;
	FlowPane LoginPane, SainPane, SearchPane;
	Scene scene1, scene2, scene3;
	
	Stage thestage;
	
	OKButtonListener okButtonListener;

	





	public void LoginView(Stage primaryStage) {
	
	 thestage=primaryStage;
	 	
	 	loginBoxUpper = new HBox(20);
		userIDLbl = new Label("UserID: ");
		userIDLbl.setAlignment(Pos.TOP_RIGHT);
		userIDTxt = new TextField();
		loginBoxUpper = new HBox(20);
		passwordLbl = new Label("Password: ");
		passwordLbl.setAlignment(Pos.CENTER_RIGHT);
		passwordTxt = new TextField();
		okButton = new Button("OK");
		exitButton = new Button("Exit");
	
		okButton.setOnAction(e -> {
			String userID = userIDTxt.getText();
			String password = passwordTxt.getText();
			 
			OKButtonEventObject ev = 
					new OKButtonEventObject(this, userID, password);
			if (okButtonListener != null) {
				okButtonListener.okButtonClicked(ev);
			
			}
		});
	
	
	
	LoginPane=new FlowPane();
    SainPane=new FlowPane();
    SearchPane = new FlowPane();
    LoginPane.setVgap(10);
    SainPane.setVgap(10);
    SearchPane.setVgap(10);
    
  loginBoxUpper.getChildren().addAll(userIDLbl, userIDTxt, okButton);
  loginBoxLower.getChildren().addAll(userIDLbl, userIDTxt, okButton);
  loginWindow.getChildren().addAll(loginBoxUpper, loginBoxLower);
      
  LoginPane.getChildren().addAll(loginWindow);
		
  scene1 = new Scene(LoginPane, 200, 100);
  scene2 = new Scene(SearchPane, 200, 100);
  scene3 = new Scene(SainPane, 200, 100);
  
  primaryStage.setTitle("Sain Login");
  primaryStage.setScene(scene1);
  primaryStage.show();
    
		}

	



	public void setOKButtonListener(OKButtonListener okButtonListener) {
		
	}





	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}


//////////////////////////////////////////////////////////////////////////////end




//
//
//
//
//loginBoxUpper.getChildren().addAll(userIDLbl, userIDTxt, okButton);
//loginBoxUpper.setAlignment(Pos.BASELINE_LEFT);
//loginBoxUpper.setMargin(userIDLbl, new Insets(50, 0, 0, 30));
//
//loginBoxLower.getChildren().addAll(	passwordLbl, passwordTxt, exitButton);
//loginBoxLower.setAlignment(Pos.BASELINE_RIGHT);
//loginBoxLower.setMargin(userIDLbl, new Insets(50, 0, 0, 30));
//
//		
//pane = new VBox(30);
//pane.getChildren().addAll(loginBoxUpper, loginBoxLower);
//	stage.setScene(new Scene(pane, 600, 200));
//stage.show();
//
//}
//
