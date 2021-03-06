package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			// stage > scene > container > node
			
			Label text = new Label();
			text.setText("Hello JavaFX");
			//CSSs
//			text.setStyle("-fx-font-size:80");
//			text.setStyle("-fx-font-size:50; -fx-text-fill:green");
//			text.setStyle("-fx-font-size:50; -fx-background-color:green");
			text.setStyle("-fx-font-size:50; -fx-border-color:green");
			
			StackPane pane = new StackPane();
			pane.getChildren().add(text);
			
			
			Scene scene = new Scene(pane,500,300);
			
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
