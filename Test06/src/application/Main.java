package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			// stage > scane > container > node
			
			Label label = new Label();
			label.setText(Integer.toString(num));
			label.setStyle("-fx-font-size:50");
			
			Button button = new Button();
			button.setText("Add");
			button.setStyle("-fx-font-size:15");
			button.setOnAction(e ->{
				num++;
				label.setText(Integer.toString(num));
			});
			
			StackPane pane = new StackPane();
//			pane.getChildren().add(label);
//			pane.getChildren().add(button);
			pane.getChildren().addAll(label,button);
			StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
			
			Scene scene = new Scene(pane, 350, 150);
			
			stage.setScene(scene);
			stage.setTitle("Add Program");
			stage.setResizable(false);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	int num = 0; // ��������
	
	public static void main(String[] args) {
		launch(args);
	}
}
