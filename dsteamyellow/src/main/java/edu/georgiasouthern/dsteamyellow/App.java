package edu.georgiasouthern.dsteamyellow;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
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
	}

}
