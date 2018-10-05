package edu.georgiasouthern.dsteamyellow;

import edu.georgiasouthern.dsteamyellow.ui.App;
import java.awt.EventQueue;

public class NorthwindLauncher {

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

}
