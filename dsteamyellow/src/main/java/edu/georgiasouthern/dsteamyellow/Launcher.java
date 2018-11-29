package edu.georgiasouthern.dsteamyellow;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.ui.App;
import edu.georgiasouthern.dsteamyellow.ui.DesktopApp;

import java.awt.EventQueue;


public class Launcher {
	public static void main(String[] args) {
		DBConnection dbc = DBConnection.getInstance();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesktopApp window = DesktopApp.getDesktop();
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
