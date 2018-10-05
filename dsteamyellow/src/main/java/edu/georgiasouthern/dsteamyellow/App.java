package edu.georgiasouthern.dsteamyellow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import java.awt.BorderLayout;

public class App {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
					UIManager m = new UIManager();
					m.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		OrderPanel orderPanel = new OrderPanel();
		tabbedPane.addTab("Orders", null, orderPanel, null);
	}

}
