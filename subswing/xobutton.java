import javax.swing.ImageIcon;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class xobutton extends JButton implements ActionListener{
	
 ImageIcon X,O;
	int index = 0;
	
	static boolean xTurn = true;
	
	tictacto board;
	
	
	public xobutton(tictacto board){
		
		this.addActionListener(this);
		
		this.board = board;
		
		X = new ImageIcon(this.getClass().getResource("X.png"));
		
		O = new ImageIcon(this.getClass().getResource("O.jpg"));
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(getIcon() == null){
			
			if(xTurn)
				setIcon(X);
			else
				setIcon(O);
			
			xTurn = !xTurn;
			
			board.checkWin();
		}
	}
	
	
	public char getChar(){
		
		if (getIcon() == null)
			return 'E';
		if (getIcon() == X)
			return'X';
		if (getIcon() == O)
			return'O';
		
		return'E';
		
	}
	
	public void reset(){
		
		setIcon(null);
		
	}
}