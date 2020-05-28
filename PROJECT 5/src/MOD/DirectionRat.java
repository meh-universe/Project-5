package MOD;

public enum DirectionRat {
	// images relating to keywords
	Up("rat.png"), Down("rat.png"), Right("rat.png"), Left("rat.png");

	// INSTANCE VARIABLES
	private String _dir;

	// CONSTRUCTOR
	private DirectionRat(String d) {
		_dir = d;
	}

	// ACCESSOR METHOD
	public String getDir() { return _dir; }
}
