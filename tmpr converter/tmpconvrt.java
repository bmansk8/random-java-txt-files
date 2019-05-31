import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JSlider;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class tmpconvrt extends JFrame implements ChangeListener {
	
	JTabbedPane tabpane = new JTabbedPane();
	
	JSlider slidr = new JSlider();
	
	JSlider slidr2 = new JSlider(0,300);
	
		JTextField fieldFah = new JTextField(4);
		JTextField fieldCel = new JTextField(4);
		JTextField fieldKel = new JTextField(4);
		
		JTextField fieldPou = new JTextField(4);
		JTextField fieldKilo = new JTextField(4);
		JTextField fieldNewt = new JTextField(4);
	
	public static void main(String[] args){
		
	new tmpconvrt();		
		
	}
	
	public void stateChanged(ChangeEvent e){
		Object src = e.getSource();
		
		if(src == slidr){
			int sldrVal = slidr.getValue();
		
			double eqate=((sldrVal-32) /1.8f);
			eqate = Math.floor(eqate * 100) / 100;
		
			fieldKel.setText(eqate+273 + "");
			fieldFah.setText(sldrVal + "");
			fieldCel.setText(eqate + "" );
		}
		
		if(src == slidr2){
			
			int slidrVal = slidr2.getValue();
			
			fieldPou.setText(slidrVal + "");
			
			fieldKilo.setText(slidrVal/2 + "");
			
			fieldNewt.setText(slidrVal*5 + "");
			
		}
	}
	
	
	tmpconvrt(){
		super ("tempture converter");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		
		fieldFah.setEditable(false);
		fieldCel.setEditable(false);
		fieldKel.setEditable(false);
		fieldPou.setEditable(false);		
		fieldKilo.setEditable(false);
		fieldNewt.setEditable(false);
		
		
		panel1.add(fieldFah);
		panel1.add(fieldCel);
		panel1.add(fieldKel);
		panel1.add(slidr);
		panel2.add(slidr2);
		panel2.add(fieldPou);
		panel2.add(fieldKilo);
		panel2.add(fieldNewt);
		slidr2.addChangeListener(this);
		slidr.addChangeListener(this);
		tabpane.addTab("tempture",panel1);
		tabpane.addTab("mass",panel2);
		
		add(tabpane);
		setVisible(true);
	}
	
	
}