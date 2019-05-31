import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JViewport;


import java.awt.BorderLayout;


import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileInputStream;


import java.util.Scanner;

public class texteditor extends JFrame implements ActionListener, ChangeListener{
	
	JPanel panel = new JPanel();
	JToolBar toolb = new JToolBar();
	JButton save = new JButton("Save");
	JButton open = new JButton("Open");
	
	
	JTabbedPane tabpane = new JTabbedPane();
	
	
	
	
	/*JTextArea area = new JTextArea();	
	JTextArea area2 = new JTextArea();	
	
	
	JToolBar toolb2 = new JToolBar();
	
	JPanel northpanel = new JPanel();	
	
	JButton save2 = new JButton("Save2");
	
	JButton open2 = new JButton("Open2"); */
	
	
	public static void main (String[] args){
		new texteditor();
	}
	
	texteditor(){
		super("text editor");
		setSize(700,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		save.addActionListener(this);
		open.addActionListener(this);
		
		panel.setLayout(new BorderLayout() );

		toolb.add(save);
		toolb.add(open);
		panel.add(toolb,BorderLayout.NORTH);
		
		/*toolb2.add(save2);
		toolb2.add(open2);
		northpanel.add(toolb2); */

		//panel.add(northpanel, BorderLayout.NORTH );
		
		//tabpane.add(scroll);
		//tabpane.add(area2);
		JTextArea area1 = new JTextArea();
			JScrollPane scrollpane1 = new JScrollPane(area1,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
				
		JTextArea area2 = new JTextArea();
			JScrollPane scrollpane2 = new JScrollPane(area2,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		
		tabpane.addTab("default",scrollpane1);
		tabpane.addTab("+",scrollpane2);
		panel.add(tabpane,BorderLayout.CENTER);
		tabpane.addChangeListener(this);
		
		add(panel);
		setVisible(true);
		
	}
	
	/*
	  select window
	  add name to tabs
	  make new tabs
	  save depend on active tab
	*/
	
	
	public void actionPerformed(ActionEvent evt){
		
		Object src = evt.getSource();
		if(src==save){
	     
			JFileChooser chooser = new JFileChooser();
			int saveval = chooser.showSaveDialog(null);
				
			if(saveval == JFileChooser.APPROVE_OPTION){
				
				File file = chooser.getSelectedFile();
				
				String filename = file.getName();
				
				int index =	tabpane.getSelectedIndex();
				
				try{
					FileOutputStream out = new FileOutputStream(file);
					PrintWriter writer = new PrintWriter(out);
						JScrollPane scrollpane = (JScrollPane)(tabpane.getSelectedComponent());
						JViewport port = (JViewport)(scrollpane.getComponent(0));
						JTextArea area = (JTextArea)(port.getView());
						tabpane.setTitleAt(index,filename);
						writer.println(area.getText());
						writer.close();
						}catch(FileNotFoundException e){
						e.printStackTrace();
						}
		
			}
		}
		
		if(src==open){
			
			JFileChooser chooser = new JFileChooser();
			int returnval = chooser.showOpenDialog(null);
		
			if(returnval == JFileChooser.APPROVE_OPTION){
					
				File file = chooser.getSelectedFile();
				
				String filename = file.getName();
				
				try{
					FileInputStream in = new FileInputStream(file);
					Scanner scan = new Scanner(in);
					JTextArea area = new JTextArea();
					JScrollPane scrollpane = new JScrollPane(area,
						JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
						JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
					tabpane.add(scrollpane ,0);
					tabpane.setTitleAt(0,filename);
					//tabpane.addTab(filename,scrollpane);
					area.setText("");
					while(scan.hasNextLine()){
						String nextLine = scan.nextLine();
						area.append(nextLine+"\n");
					}
					
				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void stateChanged(ChangeEvent e){
		int curindex = tabpane.getSelectedIndex();
		
		if(curindex == tabpane.getTabCount()-1){
			JTextArea area = new JTextArea();
			JScrollPane scrollpane = new JScrollPane(area,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
			tabpane.setTitleAt(curindex,"newtab");
			tabpane.addTab("+",scrollpane);
		}
	}
	
}

