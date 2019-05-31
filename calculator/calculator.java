	import java.awt.event.ActionListener;
	
	import javax.swing.JLabel;
	
	import javax.swing.JTextField;
	
	import java.awt.Color;
	
    import java.awt.event.ActionEvent;
	
	import javax.swing.JButton;
	
	import javax.swing.JPanel;

	import javax.swing.JFrame;

public class calculator extends JFrame implements ActionListener {
	
	
	 JPanel panel = new JPanel();
	 JLabel labelA = new JLabel("first input: ");
	 JTextField fieldA = new JTextField(4);
	 JLabel labelB = new JLabel("second input: ");
	 JTextField fieldB = new JTextField(4);
	 JLabel labelout = new JLabel("output");
	 JTextField fieldout = new JTextField(4);
	 
	 JButton buttonDivide = new JButton("Divide");
	 JButton buttonAdd = new JButton("Add");
	 JButton buttonSubtract = new JButton ("Subtract");
	 JButton buttonTimez = new JButton ("Multiply");
	
	//divide simbale -> /
	
	public static void main(String[] args){
	new	calculator();
		
	}
	
	calculator(){
		//setup
		super("calculator");
		setSize(400,400);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//adding things to frame
	 buttonSubtract.addActionListener(this);
	 buttonAdd.addActionListener(this);
	 buttonTimez.addActionListener(this);
	 buttonDivide.addActionListener(this);
	 
	 labelout.setForeground(Color.WHITE);
	 labelA.setForeground(Color.WHITE);
	 labelB.setForeground(Color.WHITE);
	 panel.setBackground(Color.BLACK);
	 
	 fieldout.setEditable(false);
	 
	 panel.add(labelA);
     panel.add(fieldA);
	 panel.add(labelB);
	 panel.add(fieldB);
	 panel.add(labelout);
	 panel.add(fieldout);
	
	 panel.add(buttonAdd);
	 panel.add(buttonSubtract);
	 panel.add(buttonTimez);
	 panel.add(buttonDivide);
	 add(panel); 
	 
	 setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt){
		String textA = fieldA.getText().trim();
		String textB = fieldB.getText().trim();
		int numA = 0, numB = 0;
		try{
			 numA = Integer.parseInt(textA);
			 numB = Integer.parseInt(textB);
		}catch(NumberFormatException e){
		    fieldout.setText("NAN");
			return;
		}
		
		Object src = evt.getSource();
		if(src == buttonAdd)
		fieldout.setText((numA + numB) + "");
		
		if(src == buttonSubtract)
		fieldout.setText((numA - numB) + "");
	
		if(src == buttonTimez)
		fieldout.setText((numA * numB) + "");
	
	    if(src == buttonDivide)
		fieldout.setText((numA / numB) + "");	
		
	}
	
}