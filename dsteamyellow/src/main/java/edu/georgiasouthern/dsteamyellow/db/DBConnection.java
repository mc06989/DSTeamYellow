package edu.georgiasouthern.dsteamyellow.db;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.spring.DaoFactory;
import com.j256.ormlite.support.ConnectionSource;
import edu.georgiasouthern.dsteamyellow.db.NorthwindTableDefinitions.*;
public class DBConnection {
	
	private static volatile DBConnection sdbconnection;
	
	public static DBConnection getInstance() {
		if (sdbconnection == null) {
			sdbconnection = new DBConnection();
		}
		
		return sdbconnection;
	}
	
	private DBConnection() {
		String databaseUrl = "jdbc:sqlserver://dbyellowteam.database.windows.net:1433;database=dbyellowteam;user=dbyellow@dbyellowteam;password=Dbyell0wteam;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
		System.out.println(connectionSource.toString());
		try {
			new DaoFactory();
			Dao<Category, Integer> dao = DaoFactory.createDao(connectionSource, Category.class);
			Category c = dao.queryForId(2);
			System.out.println(c.getCategoryName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
