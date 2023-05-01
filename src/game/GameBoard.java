package game;

import objects.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

public class GameBoard extends Pane {
	private static final int ROWS = 15;
	private static final int COLS = 15;
	private GameObject[][] matrix;
	private GridPane grid;

	public GameBoard() {
		matrix = new GameObject[ROWS][COLS];
		grid = new GridPane();
		initMatrix();
        grid.prefWidthProperty().bind(widthProperty());
        grid.prefHeightProperty().bind(heightProperty());
		getChildren().add(grid);
	}

	private void initMatrix() {
		for (int row = 0; row < ROWS; row++) {
			RowConstraints rowConstraints = new RowConstraints();
			rowConstraints.setPercentHeight(100.0 / ROWS);
			grid.getRowConstraints().add(rowConstraints);

			for (int col = 0; col < COLS; col++) {
				GameObject entity;

				if (row == 0 || row == ROWS - 1) {
					entity = new Water(row, col, "WATER");
				} else if (row % 2 == 1) {
					entity = new Car(row, col, "CAR");
				} else {
					entity = new Log(row, col, "LOG");
				}

				matrix[row][col] = entity;
				grid.add(entity, col, row);

				if (row == 0) {
					ColumnConstraints columnConstraints = new ColumnConstraints();
					columnConstraints.setPercentWidth(100.0 / COLS);
					grid.getColumnConstraints().add(columnConstraints);
				}
			}
		}

		Frog frog = new Frog(ROWS - 1, COLS / 2);
		matrix[ROWS - 1][COLS / 2] = frog;
		grid.add(frog, COLS / 2, ROWS - 1);
	}
}