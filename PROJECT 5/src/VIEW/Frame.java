package VIEW;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import MAIN.Main;
import CONT.*;
import MOD.*;

public class Frame {

	// INSTANCE VARIABLES
	public JFrame _frame;
	private JPanel _pan;
	private JLabel[][] _labMaze;
	private JLabel _ply;
	private JLabel _mg;
	private JLabel _rg;
	private JLabel _zmg;
	private JLabel _sg;
	private JLabel _eg;
	private Maze _m;
	private Player _p;
	private Minotaur _minotaur;
	private Rat _r;
	private Zombie _zm;
	private Sword _s;
	private Position _e;


	// ACCESSOR METHODS
	public Maze getMaze() { return _m; }
	public JLabel[][] getMazeGraphic() { return _labMaze; }
	
	public Player getPlayer() { return _p; }
	public JLabel getPlayerGraphic() { return _ply; }
	
	public Minotaur getMinotaur() { return _minotaur; }
	public JLabel getMinotaurGraphic() { return _mg; }
	
	public Rat getRat() { return _r; }
	public JLabel getRatGraphic() { return _rg; }
	
	public Zombie getZombie() { return _zm; }
	public JLabel getZombieGraphic() { return _zmg; }
	
	public Sword getSword() {return _s;}
	public JLabel getSwordGraphic() { return _sg; }
	
	public Position getEnd() { return _e; }
	public JLabel getEndGraphic() { return _eg; }


	// CONSTRUCTOR
	public Frame(Maze m, Player p, Minotaur minotaur, Rat r, Zombie zm, Sword s, Position e) {
		_m = m;
		_p = p;
		_minotaur = minotaur;
		_r = r;
		_zm = zm;
		_s = s;
		_e = e;

		setupLabels();
		setupPanel();

		setupFrame();
	}


	// SETTING UP
		/**
		 * This method sets up the player on the maze and the icon of the maze
		 */
		private void setupLabels(){
			_labMaze = new JLabel[_m.getMaze().length][_m.getMaze()[0].length];
			for(int r = 0; r < _labMaze.length; r++) {
				for(int c = 0; c < _labMaze[0].length; c++) {
					if(_m.getMaze()[r][c]) {
						ImageIcon i = new ImageIcon(getClass().getResource("void.png"));
						_labMaze[r][c] = new JLabel(i);
					}
					else {
						ImageIcon i = new ImageIcon(getClass().getResource("space.png"));
						_labMaze[r][c] = new JLabel(i);
					}
				}
			}
		}

		/**
		 * This method sets up the panel
		 */
		private void setupPanel() {
			_pan = new JPanel(new GridLayout(_labMaze.length, _labMaze[0].length));
			for(JLabel[] l: _labMaze) {
				for(JLabel b : l) {
					_pan.add(b);
				}
			}
			_pan.repaint();
		}

		/**
		 * This method sets up the frame
		 */
		private void setupFrame() {
			// Setting up the frame
			_frame = new JFrame("Maze game");
			_frame.add(_pan);
			_frame.pack();
			_frame.setResizable(false);
			_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setupPlayer();
			setupMinotaur();
			setupRat();
			setupZombie();
			setupSword();
			setupEnd();
			_frame.repaint();
			_frame.addKeyListener(new Keyboard(this));
			_frame.setVisible(true);
		}

		/**
		* This method sets up the player on the panel
		*/
		private void setupPlayer() {
			ImageIcon i = new ImageIcon(getClass().getResource("arrowUp.png"));
			_ply = new JLabel(i);
			int r = _p.getPosition().getRow();
			int c = _p.getPosition().getCol();
			_ply.setLocation(0, 0);
			_ply.setSize(_labMaze[r][c].getSize());
			_labMaze[r][c].add(_ply);
			_labMaze[r][c].repaint();
		}

		/**
		* This method sets up the Minotaur on the panel
		*/
		private void setupMinotaur() {
			ImageIcon i = new ImageIcon(getClass().getResource("Minotaur.png"));
			_mg = new JLabel(i);
			int r = Maze._minotaur.getRow();
			int c = Maze._minotaur.getCol();
			_mg.setLocation(0, 0);
			_mg.setSize(_labMaze[r][c].getSize());
			_labMaze[r][c].add(_mg);
			_labMaze[r][c].repaint();
		}

		/**
		* This method sets up the Rat on the panel
		*/
		private void setupRat() {
			ImageIcon i = new ImageIcon(getClass().getResource("rat.png"));
			_rg = new JLabel(i);
			int r = Maze._rat.getRow();
			int c = Maze._rat.getCol();
			_rg.setLocation(0, 0);
			_rg.setSize(_labMaze[r][c].getSize());
			_labMaze[r][c].add(_rg);
			_labMaze[r][c].repaint();
		}

		/**
		* This method sets up the Zombie on the panel
		*/
		private void setupZombie() {
			ImageIcon i = new ImageIcon(getClass().getResource("zombie.png"));
			_zmg = new JLabel(i);
			int r = Maze._zombie.getRow();
			int c = Maze._zombie.getCol();
			_zmg.setLocation(0, 0);
			_zmg.setSize(_labMaze[r][c].getSize());
			_labMaze[r][c].add(_zmg);
			_labMaze[r][c].repaint();
		}

		/**
		* This method sets up the sword on the panel
		*/
		private void setupSword() {
		ImageIcon i = new ImageIcon(getClass().getResource("sword.png"));
			_sg = new JLabel(i);
			int r = Maze._sword.getRow();
			int c = Maze._sword.getCol();
			_sg.setLocation(0, 0);
			_sg.setSize(_labMaze[r][c].getSize());
			_labMaze[r][c].add(_sg);
			_labMaze[r][c].repaint();
		}

		/**
		* This method sets up the end on the panel
		*/
		private void setupEnd() {
			ImageIcon i = new ImageIcon(getClass().getResource("end.png"));
			_eg = new JLabel(i);
			int r = Maze._end.getRow();
			int c = Maze._end.getCol();
			_eg.setLocation(0, 0);
			_eg.setSize(_labMaze[r][c].getSize());
			_labMaze[r][c].add(_eg);
			_labMaze[r][c].repaint();
		}
		
		
	// ADDING THE IMAGE
		/**
		 * This method adds the player image on the panel
		 */
		public void addPlayer(int r, int c, DirectionPlayer d) {
			ImageIcon i = new ImageIcon(getClass().getResource(d.getDir()));
			_ply = new JLabel(i);
			_ply.setSize(_labMaze[r][c].getSize());
			_p.setPosition(new Position(r,c));
			_labMaze[r][c].add(_ply);
			_labMaze[r][c].repaint();

			// if the player gets to the end of a maze it goes to the next level
			if(r == _m.getEnd().getRow() && c == _m.getEnd().getCol()) {
				JOptionPane.showMessageDialog(_frame, "Congrats! You've made it to the next floor.");
				if(Overseer.level1() && !Overseer2.level2()) {
					_frame.dispose();
					Main.Lab1();
				}
				else if(Overseer2.level2() && !Overseer3.level3()) {
					_frame.dispose();
					Main.Lab2();
				}
				else if(Overseer3.level3() && !Overseer4.level4()) {
					_frame.dispose();
					Main.Lab3();
				}
				else if(Overseer4.level4() && !Overseer5.level5()) {
					_frame.dispose();
					Main.Lab4();
				}
				else if(Overseer5.level5() && !Overseer6.level6()) {
					_frame.dispose();
					Main.Lab5();
				}
				else if(Overseer6.level6() && !Overseer7.level7()) {
					_frame.dispose();
					Main.Lab6();
				}
				else if(Overseer7.level7() && !Overseer8.level8()) {
					_frame.dispose();
					Main.Lab7();
				}
				else if(Overseer8.level8() && !Overseer9.level9()) {
					_frame.dispose();
					Main.Lab8();
				}
				else if(Overseer9.level9() && !Overseer10.level10()) {
					_frame.dispose();
					Main.Lab9();
				}
				else if(Overseer10.level10()){
					JOptionPane.showMessageDialog(_frame, "10");
					_frame.dispose();
				}
			}
			// if the player is on the square of the sword
			else if(r == _s.getPosition().getRow() && c == _s.getPosition().getCol()) {
				JOptionPane.showMessageDialog(_frame, "YOU HAVE PICKED UP THE MIGHTY SWORD!");
				_s.delete(_e, _p, _s);
				_labMaze[r][c].remove(_sg);
			}
		}

		/**
		 * This method adds the Minotaur image on the panel
		 */
		public void addMinotaur(int r, int c, DirectionMinotaur d) {
			ImageIcon i = new ImageIcon(getClass().getResource(d.getDir()));
			_mg = new JLabel(i);
			_mg.setSize(_labMaze[r][c].getSize());
			_minotaur.setPosition(new Position(r,c));
			_labMaze[r][c].add(_mg);
			_labMaze[r][c].repaint();
		}

		/**
		 * This method adds the Rat image on the panel
		 */
		public void addRat(int r, int c, DirectionRat d) {
			ImageIcon i = new ImageIcon(getClass().getResource(d.getDir()));
			_rg = new JLabel(i);
			_rg.setSize(_labMaze[r][c].getSize());
			_r.setPosition(new Position(r,c));
			_labMaze[r][c].add(_rg);
		}

		/**
		 * This method adds the Zombie image on the panel
		 */
		public void addZombie(int r, int c, DirectionZombie d) {
			ImageIcon i = new ImageIcon(getClass().getResource(d.getDir()));
			_zmg = new JLabel(i);
			_zmg.setSize(_labMaze[r][c].getSize());
			_zm.setPosition(new Position(r,c));
			_labMaze[r][c].add(_zmg);
		}

		/**
		 * This method adds the sword image on the panel
		 */
		public void addSword(int r, int c, DirectionPlayer d) {
			ImageIcon i = new ImageIcon(getClass().getResource(d.getDir()));
			_sg = new JLabel(i);
			_sg.setSize(_labMaze[r][c].getSize());
			_s.setPosition(new Position(r, c));
			_labMaze[r][c].add(_sg);
			_labMaze[r][c].repaint();
		}

		/**
		 * This method adds the end image on the panel
		 */
		public void addEnd(int r, int c, DirectionPlayer d, Maze maze1) {
			ImageIcon i = new ImageIcon(getClass().getResource(d.getDir()));
			_eg = new JLabel(i);
			_eg.setSize(_labMaze[r][c].getSize());
			_e.setEnd(new Position(r,c));
			_labMaze[r][c].add(_eg);
			_labMaze[r][c].repaint();
		}


	// REMOVE THE IMAGE
		/**
		 * This method removes the player image on the panel
		 */
		public void removePlayer() {
			int r = _p.getPosition().getRow();
			int c = _p.getPosition().getCol();
			_labMaze[r][c].remove(_ply);
			_labMaze[r][c].repaint();
		}

		/**
		 * This method removes the Minotaur image on the panel
		 */
		public void removeMinotaur() {
			int r = _minotaur.getPosition().getRow();
			int c = _minotaur.getPosition().getCol();
			_labMaze[r][c].remove(_mg);
			_labMaze[r][c].repaint();
		}

		/**
		 * This method removes the rat image on the panel
		 */
		public void removeRat() {
			int r = _r.getPosition().getRow();
			int c = _r.getPosition().getCol();
			_labMaze[r][c].remove(_rg);
			_labMaze[r][c].repaint();
		}

		/**
		 * This method removes the Zombie image on the panel
		 */
		public void removeZombie() {
			int r = _zm.getPosition().getRow();
			int c = _zm.getPosition().getCol();
			_labMaze[r][c].remove(_zmg);
			_labMaze[r][c].repaint();
		}

		/**
		 * This method removes the sword image on the panel
		 */
		public void removeSword() {
			int r = _s.getPosition().getRow();
			int c = _s.getPosition().getCol();
			_labMaze[r][c].remove(_sg);
			_labMaze[r][c].repaint();
		}
}