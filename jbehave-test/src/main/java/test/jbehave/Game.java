package test.jbehave;

public class Game {

	boolean grid[][];
	
	
	
	
	public Game(int width, int height) {
		grid=new boolean[width][height];
	}

	public void setObserver(StringRenderer renderer) {
		renderer.setGrig(grid);
		
		
	}

	public void toggleCellAt(int column, int row) {
		grid[row][column]=!grid[row][column];
		
	}

}
