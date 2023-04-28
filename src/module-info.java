module CSC330Proj {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.graphics;
	
	opens game to javafx.graphics, javafx.fxml;
}
