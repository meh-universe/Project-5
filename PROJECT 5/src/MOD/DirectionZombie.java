package MOD;

public enum DirectionZombie {
	// images relating to keywords
	Up("zombie.png"), Down("zombie.png"), Right("zombie.png"), Left("zombie.png");

	// INSTANCE VARIABLES
	private String _dir;

	// CONSTRUCTOR
	private DirectionZombie(String d) {
		_dir = d;
	}

	// ACCESSOR METHOD
	public String getDir() { return _dir; }
}
