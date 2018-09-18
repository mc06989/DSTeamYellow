import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindowMenuBar extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1317240351410203271L;

	public MainWindowMenuBar() {
		initUI();
	}
	
	private void initUI() {
		JMenu fileMenu = new JMenu("File...");
		JMenuItem newMenuItem = new JMenuItem("New...");
		JMenuItem openMenuItem = new JMenuItem("Open...");
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.setMnemonic(KeyEvent.VK_F);
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		
		JMenu editMenu = new JMenu("Edit...");
		JMenuItem settingsMenuItem = new JMenuItem("Settings");
		editMenu.add(settingsMenuItem);
		
		JMenu helpMenu = new JMenu("Help");
		JMenuItem aboutMenuItem = new JMenuItem("About");
		helpMenu.add(aboutMenuItem);
		
		add(fileMenu);
		add(editMenu);
		add(helpMenu);
	}
}
