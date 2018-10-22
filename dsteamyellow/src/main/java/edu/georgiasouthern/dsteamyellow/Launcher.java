package edu.georgiasouthern.dsteamyellow;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.ui.App;
import java.awt.EventQueue;


public class Launcher {
	public static void main(String[] args) {
		DBConnection dbc = DBConnection.getInstance();
		
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
	
	public static void OnClose() {
		DBConnection.getInstance().closeConnection();
	}

}
