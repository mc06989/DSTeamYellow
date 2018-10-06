package edu.georgiasouthern.dsteamyellow.db;

public class DBConnection {
	
	private static volatile DBConnection sdbconnection;
	
	public static DBConnection getInstance() {
		if (sdbconnection == null) {
			sdbconnection = new DBConnection();
		}
		
		return sdbconnection;
	}
	
	private DBConnection() {
		
	}
	
}
