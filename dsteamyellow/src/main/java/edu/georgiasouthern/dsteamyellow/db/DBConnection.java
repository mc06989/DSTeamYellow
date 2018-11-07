package edu.georgiasouthern.dsteamyellow.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.spring.DaoFactory;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.*;

public class DBConnection {
	
	private static volatile DBConnection sdbconnection;
	public static volatile Dao<OrderView, Integer> orderViewDao;
	public static volatile Dao<Employee, Integer> employeeDao;
	public static volatile Dao<OrderDetailsView, Integer> orderDetailViewDao;
	public static volatile Dao<EmployeeView, Integer> employeeViewDao;
	public static volatile Dao<Product, Integer> productDao;
	public static volatile Dao<Order, Integer> orderDao;
	ConnectionSource connectionSource;
	public static DBConnection getInstance() {
		if (sdbconnection == null) {
			sdbconnection = new DBConnection();
		}
		
		return sdbconnection;
	}
	
	private DBConnection() {
		String databaseUrl = "jdbc:sqlserver://dbyellowteam.database.windows.net:1433;database=dbyellowteam;user=dbyellow@dbyellowteam;password=Dbyell0wteam;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		try {
			connectionSource = new JdbcConnectionSource(databaseUrl);
			new DaoFactory();
			orderViewDao = DaoFactory.createDao(connectionSource, OrderView.class);
			orderDetailViewDao = DaoFactory.createDao(connectionSource, OrderDetailsView.class);
			employeeViewDao = DaoFactory.createDao(connectionSource, EmployeeView.class);
			employeeDao = DaoFactory.createDao(connectionSource, Employee.class);
			productDao = DaoFactory.createDao(connectionSource, Product.class);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			connectionSource.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
//	
//	public Object[][] getEmployeeList(){
//		List<Employee> orders=null;
//		List<Object[]> a = new ArrayList<>();
//		try {
//			QueryBuilder<Employee, Integer> q = employeeDao.queryBuilder();
//			orders = employeeDao.query(q.prepare());
//			
//			
//			for (Employee o : orders) {
//				ArrayList<Object> b = new ArrayList<Object>();
//				b.add(o.getExtension());
//				
//				a.add(b.toArray());
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		Object[][] d = new Object[a.size()][];
//		
//		for(int i =0;i<a.size();i++) {
//			d[i]=a.get(i);
//		}
//		return  (Object[][]) d;
//	}
	
	public OrderDetailsView getOrderDetails(int oid) {
		QueryBuilder<OrderDetailsView, Integer> q = orderDetailViewDao.queryBuilder();
		
		List<OrderDetailsView> odv = null;
		try {
			q.where().eq("OrderId", oid);
			odv= orderDetailViewDao.query(q.prepare());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return odv.get(0);
	}
	
	public Object[][] getEmployeeViewList(){
		List<EmployeeView> orders=null;
		List<Object[]> a = new ArrayList<>();
		try {
			QueryBuilder<EmployeeView, Integer> q = employeeViewDao.queryBuilder();
			orders = employeeViewDao.query(q.prepare());
			
			
			for (EmployeeView o : orders) {
				ArrayList<Object> b = new ArrayList<Object>();
				b.add(o.getEmployeeID());
				b.add(o.getEmployeeName());
				b.add(o.getTitle());
				b.add(o.getFullAddress());
				b.add(o.getHomePhone());
				b.add(o.getReportsTo());
				b.add(o.getReportsToID());
				
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
	
	public Employee getEmployeeDetails(int eid) {
		Employee e = null;
		try {
			e= employeeDao.queryForId(eid);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return e;
	}
	

	public Object[][] getProductsOnOrder(int oid) {
		List<Product> orders= new ArrayList<Product>();
		List<Object[]> a = new ArrayList<>();
		try {
			
			GenericRawResults<String[]> aa = productDao.queryRaw("select * from OrderDetails where Orderid="+oid);
			ArrayList<Integer> productIDs = new ArrayList<Integer>();
			for (String[] aaa : aa) {
				productIDs.add(Integer.parseInt(aaa[1]));
			}
			QueryBuilder<Product, Integer> q = productDao.queryBuilder();

			for (Integer pro : productIDs) {
				orders.add(productDao.queryForId(pro));
			}
			
			
			for (Product o : orders) {
				ArrayList<Object> b = new ArrayList<Object>();
				b.add(o.getProductID());
				b.add(o.getProductName());
				b.add(o.getSupplierID());
				b.add(o.getCategoryID());
				b.add(o.getQuantityPerUnit());
				b.add(o.getUnitPrice());
				b.add(o.getUnitsInStock());
				b.add(o.getUnitsOnOrder());
				b.add(o.getReorderLevel());
				b.add(o.isDiscontinued());
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
