package MOD;

public enum DirectionMinotaur {
	// images relating to keywords
	Up("Minotaur.png"), Down("Minotaur.png"), Right("Minotaur.png"), Left("Minotaur.png");

	// INSTANCE VARIABLES
	private String _dir;

	// CONSTRUCTOR
	private DirectionMinotaur(String d) {
		_dir = d;
	}

	// ACCESSOR METHOD
	public String getDir() { return _dir; }
}
