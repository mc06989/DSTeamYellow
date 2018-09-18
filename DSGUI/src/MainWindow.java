import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class MainWindow extends JFrame {

	private static final long serialVersionUID = -3880026026104218593L;

	public MainWindow() {
		initUI();
	}
	
	private void initUI() {
		JPanel pane = new JPanel(new BorderLayout());
		setContentPane(pane);
		
		
		
		MainWindowMenuBar mb = new MainWindowMenuBar();
		setJMenuBar(mb);
		//quitButton.addActionListener((ActionEvent event)->{
		//	System.exit(0);
		//});
		
		setTitle("Simple example");
		setSize(640,480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
