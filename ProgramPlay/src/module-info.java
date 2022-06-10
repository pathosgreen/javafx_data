module TestBuild {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens Page to javafx.graphics, javafx.fxml;
}
