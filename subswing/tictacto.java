import javax.swing.JOptionPane;

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.GridLayout;

public class tictacto extends JFrame{
		
		xobutton[]	buttons = new xobutton[9];
		
		JPanel panel = new JPanel();
			
	public static void main(String args[]){
		new tictacto();
	}
	
	public void checkWin(){
		
	//i=0 top
	//i=3 middle
	//i=6 bottom
		for(int i=0;i<9;i+=3){
			char rowLetter = buttons[i].getChar();
			if(rowLetter == 'E' )
				continue;//skips all of this |
										  // V
			if (
				buttons[i+1].getChar() == rowLetter &&
				buttons[i+2].getChar() == rowLetter
				){
					JOptionPane.showMessageDialog(null,rowLetter+ " wins get shrekt!");
					resetbuttons();
				}
		}
		
		for(int i=0;i<3;i++){
			char collumLetter = buttons[i].getChar();
			if(collumLetter == 'E')
				continue;
			if(
			buttons[i+3].getChar() == collumLetter &&
			buttons[i+6].getChar() == collumLetter 
			 ){
				
				JOptionPane.showMessageDialog(null,collumLetter + " wins get shrekt");
				  resetbuttons();
			 }
		}
	
	
		char diagLetter = buttons[4].getChar();
		if(diagLetter == 'E')
			return;// ends the method early
		if(
		buttons[0].getChar() == diagLetter &&
		buttons[8].getChar() == diagLetter
		){

			System.out.println(diagLetter + " wins get shrekt!");
		    resetbuttons();
		}
		
		if(
		buttons[2].getChar() == diagLetter &&
		buttons[6].getChar() == diagLetter
		){
			
			  JOptionPane.showMessageDialog(null,diagLetter + " wins get shrekt!");
			  resetbuttons();
		}
		
	}
	
	public void resetbuttons(){

		for(int i =0; i<9; i ++){
			buttons[i].reset();
		}
	}

	
	tictacto () {
		super("tic tac toe");
		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel.setLayout(new GridLayout(3,3));
	    
		
		for(int i =0;i<9;i++){
			buttons [i] = new xobutton(this);
			panel.add(buttons[i]);
		}
	
		add(panel);
		setVisible(true);
	
	
	}
	
}