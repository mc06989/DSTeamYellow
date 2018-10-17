package edu.georgiasouthern.dsteamyellow.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.spring.DaoFactory;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import edu.georgiasouthern.dsteamyellow.db.NorthwindTableDefinitions.*;

public class DBConnection {
	
	private static volatile DBConnection sdbconnection;
	public static volatile Dao<OrderView, Integer> orderViewDao;
	
	public static DBConnection getInstance() {
		if (sdbconnection == null) {
			sdbconnection = new DBConnection();
		}
		
		return sdbconnection;
	}
	
	private DBConnection() {
		String databaseUrl = "jdbc:sqlserver://dbyellowteam.database.windows.net:1433;database=dbyellowteam;user=dbyellow@dbyellowteam;password=Dbyell0wteam;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		ConnectionSource connectionSource;
		try {
			connectionSource = new JdbcConnectionSource(databaseUrl);
		

			System.out.println(connectionSource.toString());
		
			new DaoFactory();
			orderViewDao = DaoFactory.createDao(connectionSource, OrderView.class);
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public Object[][] getOrderViewList(){
		List<OrderView> orders=null;
		List<Object[]> a = new ArrayList<>();
		try {
			QueryBuilder<OrderView, Integer> q = orderViewDao.queryBuilder();
			orders = orderViewDao.query(q.prepare());
			
			
			for (OrderView o : orders) {
				ArrayList<Object> b = new ArrayList<Object>();
				b.add(o.getOrderID());
				b.add(o.getContactName());
				b.add(o.getCompanyName());
				b.add(o.getRequiredDate());
				a.add(b.toArray());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Object[][] d = new Object[a.size()][];
		
		for(int i =0;i<a.size();i++) {
			d[i]=a.get(i);
		}
		return  (Object[][]) d;
	}
	
}
