package test.jbehave;

public class StringRenderer {

	private static final String CR = System.getProperty("line.separator");
	private boolean[][] grid;

	public String asString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < grid.length; i++) {
			boolean column[] = grid[i];
			for (int j = 0; j < column.length; j++) {
				boolean b = column[j];
				if (b) {
					builder.append("X");
				} else {
					builder.append('.');
				}
			}
			builder.append(CR);
		}
		builder.setLength(builder.length() - CR.length());
		return builder.toString();
	}

	public void setGrig(boolean[][] grid) {
		this.grid = grid;
	}

}
