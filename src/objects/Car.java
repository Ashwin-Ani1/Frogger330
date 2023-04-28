package objects;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Car extends GameObject {

	public Car(int row, int col, String l) {
		super(row, col, l);
		setPrefSize(50, 50); 
        setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
	}
}
