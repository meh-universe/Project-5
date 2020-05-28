package MOD;

public enum DirectionPlayer {
	// images relating to keywords
	Up("arrowUp.png"), Down("arrowDown.png"), Right("arrowRight.png"), Left("arrowLeft.png");

	// INSTANCE VARIABLES
	private String _dir;

	// CONSTRUCTOR
	private DirectionPlayer(String d) {
		_dir = d;
	}

	// ACCESSOR METHOD
	public String getDir() { return _dir; }
}
