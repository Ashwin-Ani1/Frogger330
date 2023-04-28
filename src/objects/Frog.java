package objects;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class Frog extends GameObject{
	public Frog(int row, int col) {
        super(row, col, "FROG");
        setPrefSize(50, 50); 
        setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
    }
}
