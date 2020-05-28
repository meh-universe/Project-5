package MOD;

public class Maze {

	// INSTANCE VARIABLES
	private boolean[][] _maze;
	public static Position _start;
    public static Position _end;
    public static Position _minotaur;
    public static Position _sword;
    public static Position _rat;
    public static Position _zombie;

    // ACCESSOR METHODS
    public Position getStart() { return _start; }
    public Position getEnd() { return _end; }
    public Position getMinotaur() { return _minotaur; }
    public Position getSword() {return _sword; }
    public Position getRat() { return _rat; }
    public Position getZombie() { return _zombie; }

	public boolean[][] getMaze() { return _maze; }

    // SETTER METHOD
    public void setPosition(Position p) {
		// TODO Auto-generated method stub
	}

	// CONSTRUCTOR
	// Sets up the mazes and the positions of the start/end of the maze, the Minotaur, Sword, Rats, and Zombies.
	public Maze(int lvlcnt) {
		// true is a wall.

		// 											*** MAZE 1 *** 											//
		if(lvlcnt == 0) {
			Position[] _Minotaur = {new Position(1, 1)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(1, 4)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(3, 9)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(1, 8)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(5, 6)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze1 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	true,	true,	false,	false,	false,	false,	false,	true,	true}, // 1
				{true,	false,	true,	true,	false,	true,	true,	true,	true,	true,	true}, // 2
				{true,	false,	true,	true,	false,	false,	true,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	true,	true,	false,	false,	false,	true}, // 4
				{true,	false,	false,	true,	false,	false,	false,	false,	true, 	false,	true}, // 5
				{true,	false,	true,	true,	false,	false,	false,	false,	true,	false,	true}, // 6
				{true,	false,	false,	false,	false,	true,	true,	false,	true,	false,	true}, // 7
				{true,	false,	true,	true,	false,	true,	true,	false,	false,	false,	true}, // 8
				{true,	false,	true,	false,	false,	true,	false,	false,	true,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze1;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 2 *** 											//
		else if(lvlcnt == 1) {
			Position[] _mTaur = {new Position(1, 1)};
			Position _aMinotaur = _mTaur[0];

			Position[] _PlayerStart = {new Position(1, 4)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(8, 6)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4, 1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze2 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze2;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 3 *** 											//
		else if(lvlcnt == 2) {
			Position[] _Minotaur = {new Position(4, 0)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze3 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze3;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 4 *** 											//
		else if(lvlcnt == 3) {
			Position[] _Minotaur = {new Position(4, 0)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze4 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze4;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 5 *** 											//
		else if(lvlcnt == 4) {
			Position[] _Minotaur = {new Position(3, 3)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze5 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze5;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 6 *** 											//
		else if(lvlcnt == 5) {
			Position[] _Minotaur = {new Position(3, 3)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze6 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze6;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 7 *** 											//
		else if(lvlcnt == 6) {
			Position[] _Minotaur = {new Position(3, 3)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze7 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze7;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());

			
		}


		// 											*** MAZE 8 *** 											//
		else if(lvlcnt == 7) {
			Position[] _Minotaur = {new Position(3, 3)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze8 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze8;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}


		// 											*** MAZE 9 *** 											//
		else if(lvlcnt == 8) {
			Position[] _Minotaur = {new Position(3, 3)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze9 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze9;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());

			
		}


		// 											*** MAZE 10 *** 											//
		else if(lvlcnt == 9) {
			Position[] _Minotaur = {new Position(3, 3)};
			Position _aMinotaur = _Minotaur[0];

			Position[] _PlayerStart = {new Position(8, 5)};
			Position _aPlayerStart = _PlayerStart[0];

			Position[] _PlayerEnd = {new Position(4,2)};
			Position _aPlayerEnd = _PlayerEnd[0];

			Position[] _SwordSpawn = {new Position(4,1)};
			Position _aSwordSpawn = _SwordSpawn[0];

			Position[] _ratSpawn = {new Position(8, 2)};
			Position _aRatSpawn = _ratSpawn[0];

			Position[] _zombieSpawn = {new Position(6, 6)};
			Position _aZombieSpawn = _zombieSpawn[0];

			boolean[][] maze10 = {
				// 0	  1		  2		 3		  4		 5		 6		  7		  8		  9		 10
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 0
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 1
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 2
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 3
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 4
				{true,	false,	false,	false,	false,	false,	false,	false,	false, 	false,	true}, // 5
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 6
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 7
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 8
				{true,	false,	false,	false,	false,	false,	false,	false,	false,	false,	true}, // 9
				{true,	true,	true,	true,	true,	true,	true,	true,	true,	true,	true}, // 10
			};

			_maze = maze10;
			_start = new Position(_aPlayerStart.getRow(), _aPlayerStart.getCol());
			_end = new Position(_aPlayerEnd.getRow(), _aPlayerEnd.getCol());
			_minotaur = new Position(_aMinotaur.getRow(), _aMinotaur.getCol());
			_sword = new Position(_aSwordSpawn.getRow(), _aSwordSpawn.getCol());
			_rat = new Position(_aRatSpawn.getRow(), _aRatSpawn.getCol());
			_zombie = new Position(_aZombieSpawn.getRow(), _aZombieSpawn.getCol());
		}
	}
}