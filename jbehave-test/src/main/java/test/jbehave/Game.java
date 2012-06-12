package test.jbehave;

public class Game {

	private boolean grid[][];

	public Game(int width, int height) {
		grid = new boolean[width][height];
	}

	public void setObserver(StringRenderer renderer) {
		renderer.setGrig(grid);

	}

	public void toggleCellAt(int column, int row) {
		grid[row][column] = !grid[row][column];

	}

	public void reset() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = false;
			}
		}

	}

}
