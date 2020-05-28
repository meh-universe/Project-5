package CONT;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import MAIN.Main;
import MOD.*;
import VIEW.Frame;

public class Keyboard implements KeyListener {

	// INSTANCE VARIABLE
	private Frame _f;

	// CONSTRUCTOR
	public Keyboard(Frame f) {
		_f = f;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	/**
	 * This method monitors the user's arrow keys so that the player can move. In turn the Minotaur, Rats, and Zombies
	 * move alone with the player's movements. It also allows for the use of the number keys to change the level if
	 * desired.
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		int counter = 0;
		
		// UP
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			int r = _f.getPlayer().getPosition().getRow();
			int c = _f.getPlayer().getPosition().getCol();
			
			int rM = _f.getMinotaur().getPosition().getRow();
			int cM = _f.getMinotaur().getPosition().getCol();
			
			int rR = _f.getRat().getPosition().getRow();
			int cR = _f.getRat().getPosition().getCol();
			
			int rZM = _f.getZombie().getPosition().getRow();
			int cZM = _f.getZombie().getPosition().getCol();
			
			if(!_f.getMaze().getMaze()[r - 1][c]) {
				_f.removePlayer();
				_f.addPlayer(r-1, c, DirectionPlayer.Up);
				counter++;
			}
			if(!_f.getMaze().getMaze()[rM + 1][cM]) {
				_f.removeMinotaur();
				_f.addMinotaur(rM+1, cM, DirectionMinotaur.Up);
			}
			if(!_f.getMaze().getMaze()[rR][cR + 1]) {
				_f.removeRat();
				_f.addRat(rR, cR+1, DirectionRat.Up);
			}
			if(!_f.getMaze().getMaze()[rZM][cZM + 1] && counter == 0) {
				_f.removeZombie();
				_f.addZombie(rZM, cZM+1, DirectionZombie.Up);
				counter = 0;
			}
		}
		
		// LEFT
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			int r = _f.getPlayer().getPosition().getRow();
			int c = _f.getPlayer().getPosition().getCol();
			
			int rM = _f.getMinotaur().getPosition().getRow();
			int cM = _f.getMinotaur().getPosition().getCol();
			
			int rR = _f.getRat().getPosition().getRow();
			int cR = _f.getRat().getPosition().getCol();
			
			int rZM = _f.getZombie().getPosition().getRow();
			int cZM = _f.getZombie().getPosition().getCol();
			
			if(!_f.getMaze().getMaze()[r][c - 1]) {
				_f.removePlayer();
				_f.addPlayer(r, c-1, DirectionPlayer.Left);
				counter++;
			}
			if(!_f.getMaze().getMaze()[rM][cM + 1]) {
				_f.removeMinotaur();
				_f.addMinotaur(rM, cM+1, DirectionMinotaur.Left);
			}
			if(!_f.getMaze().getMaze()[rR][cR - 1]) {
				_f.removeRat();
				_f.addRat(rR, cR-1, DirectionRat.Left);
			}
			if(_f.getMaze().getMaze()[rZM][cZM-1] == false && counter == 2) {
				_f.removeZombie();
				_f.addZombie(rZM, cZM-1, DirectionZombie.Left);
				counter = 0;
			}
		}
		
		// DOWN
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			int r = _f.getPlayer().getPosition().getRow();
			int c = _f.getPlayer().getPosition().getCol();
			
			int rM = _f.getMinotaur().getPosition().getRow();
			int cM = _f.getMinotaur().getPosition().getCol();
			
			int rR = _f.getRat().getPosition().getRow();
			int cR = _f.getRat().getPosition().getCol();
			
			int rZM = _f.getZombie().getPosition().getRow();
			int cZM = _f.getZombie().getPosition().getCol();
			
			if(!_f.getMaze().getMaze()[r + 1][c]) {
				_f.removePlayer();
				_f.addPlayer(r+1, c, DirectionPlayer.Down);
				counter++;
			}
			if(!_f.getMaze().getMaze()[rM - 1][cM]) {
				_f.removeMinotaur();
				_f.addMinotaur(rM-1, cM, DirectionMinotaur.Down);
			}
			if(!_f.getMaze().getMaze()[rR][cR + 1]) {
				_f.removeRat();
				_f.addRat(rR, cR+1, DirectionRat.Down);
			}
			if(!_f.getMaze().getMaze()[rZM][cZM + 1] && counter == 2) {
				_f.removeZombie();
				_f.addZombie(rZM, cZM+1, DirectionZombie.Down);
				counter = 0;
			}
		}
		
		// RIGHT
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			int r = _f.getPlayer().getPosition().getRow();
			int c = _f.getPlayer().getPosition().getCol();
			
			int rM = _f.getMinotaur().getPosition().getRow();
			int cM = _f.getMinotaur().getPosition().getCol();
			
			int rR = _f.getRat().getPosition().getRow();
			int cR = _f.getRat().getPosition().getCol();
						
			int rZM = _f.getZombie().getPosition().getRow();
			int cZM = _f.getZombie().getPosition().getCol();
			
			if(!_f.getMaze().getMaze()[r][c + 1]) {
				_f.removePlayer();
				_f.addPlayer(r, c+1, DirectionPlayer.Right);
				counter++;
			}
			if(!_f.getMaze().getMaze()[rM][cM - 1]) {
				_f.removeMinotaur();
				_f.addMinotaur(rM, cM-1, DirectionMinotaur.Right);
			}
			if(!_f.getMaze().getMaze()[rR][cR + 1]) {
				_f.removeRat();
				_f.addRat(rR, cR+1, DirectionRat.Right);
			} 
			if(!_f.getMaze().getMaze()[rZM][cZM + 1]) {
				_f.removeZombie();
				_f.addZombie(rZM, cZM+1, DirectionZombie.Right);
				counter = 0;
			} 
		}

		// GOING THROUGH THE LEVELS
		else if(e.getKeyCode() == KeyEvent.VK_1) {
        	_f._frame.dispose();
            Main.Lab1();
		}
		else if(e.getKeyCode() == KeyEvent.VK_2) {
        	_f._frame.dispose();
            Main.Lab2();
		}
		else if(e.getKeyCode() == KeyEvent.VK_3) {
        	_f._frame.dispose();
            Main.Lab3();
		}
		else if(e.getKeyCode() == KeyEvent.VK_4) {
        	_f._frame.dispose();
            Main.Lab4();
		}
		else if(e.getKeyCode() == KeyEvent.VK_5) {
        	_f._frame.dispose();
            Main.Lab5();
		}
		else if(e.getKeyCode() == KeyEvent.VK_6) {
        	_f._frame.dispose();
            Main.Lab6();
		}
		else if(e.getKeyCode() == KeyEvent.VK_7) {
        	_f._frame.dispose();
            Main.Lab7();
		}
		else if(e.getKeyCode() == KeyEvent.VK_8) {
        	_f._frame.dispose();
            Main.Lab8();
		}
		else if(e.getKeyCode() == KeyEvent.VK_9) {
        	_f._frame.dispose();
            Main.Lab9();
		}
		else if(e.getKeyCode() == KeyEvent.VK_0) {
        	_f._frame.dispose();
            Main.Lab10();
		}
	}
}
