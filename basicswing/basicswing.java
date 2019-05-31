	import javax.swing.JLabel;
	
	import javax.swing.JTextArea;
	
	import javax.swing.JTextField;
	
	import java.awt.Color;
	
	import javax.swing.JButton;
	
	import javax.swing.JPanel;

	import javax.swing.JFrame;

public class basicswing extends JFrame{
	
	
	public static void main(String[] args){
	new	basicswing();
		
	}
	
	basicswing(){
		//setup
		super("program test");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		
		//adding things to frame
	 JPanel panel = new JPanel();
	 JTextArea txtarea = new JTextArea (10,20);
	 JTextField txtfld = new JTextField("text field test",20);
	 JButton button = new JButton("confirm test");
	 JLabel jlabel = new JLabel("label test",JLabel.LEFT);
	 jlabel.setForeground(Color.WHITE);
	 panel.add(txtarea);
	 panel.add(txtfld);
	 panel.add(button);
	 panel.add(jlabel);
	 panel.setBackground(Color.BLUE);
	 add(panel);
	 setVisible(true);
	}
}