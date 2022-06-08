package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			// stage > scane > container > node
			
			Label label = new Label();
			label.setText("test");
			label.setStyle("-fx-font-size:50");
			
			StackPane pane = new StackPane();
			pane.getChildren().add(label);
//			StackPane.setAlignment(label, Pos.TOP_CENTER);
			StackPane.setAlignment(label, Pos.CENTER_LEFT);
			
			Scene scene = new Scene(pane, 150, 150);
			
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