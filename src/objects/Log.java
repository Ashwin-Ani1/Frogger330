package objects;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Log extends GameObject {

	public Log(int row, int col, String l) {
		super(row, col, l);
		setPrefSize(50, 50); 
        setBackground(new Background(new BackgroundFill(Color.BROWN, null, null)));
	}
}
