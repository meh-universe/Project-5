package MOD;

public class Position {

	// INSTANCE VARIABLES
	private int _row;
	private int _col;

	// ACCESSOR METHODS
	public int getRow() { return _row; }
	public int getCol() { return _col; }

	// SETTER METHOD
	public void setEnd(Position position) {
	}

	// CONSTRUCTOR
	public Position(int r, int c) {
		_row = r;
		_col = c;
	}

	/**
	 * This method makes a string representation of the position
	 *  - "row: [_row]  col: [_col]"
	 * @return a String representation of the position
	 */
	public String toString() {
		return "row:" + _row + "col:" + _col;
	}
}
