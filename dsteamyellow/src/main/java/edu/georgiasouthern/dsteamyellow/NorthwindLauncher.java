package edu.georgiasouthern.dsteamyellow;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.ui.App;
import java.awt.EventQueue;
import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class NorthwindLauncher {
	
	public static void main(String[] args) {
		DBConnection dbc = DBConnection.getInstance();
		String databaseUrl = "";
		try {
			ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
		} catch (SQLException e1) {
			//TODO: Properly catch SQL Server errors
			e1.printStackTrace();
		}
		
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
