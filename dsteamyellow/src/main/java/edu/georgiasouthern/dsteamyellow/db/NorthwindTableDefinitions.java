package edu.georgiasouthern.dsteamyellow.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
public class NorthwindTableDefinitions {
	
	@DatabaseTable(tableName="categories")
	static class Category{
		@DatabaseField(id=true)
		private int CategoryID;
		@DatabaseField(canBeNull=false)
		private String CategoryName;
		@DatabaseField(canBeNull=true)
		private String Description;
		
		public Category() {
			
		}
		
		public int getCategoryID() {
			return CategoryID;
		}
		public void setCategoryID(int categoryID) {
			CategoryID = categoryID;
		}
		public String getCategoryName() {
			return CategoryName;
		}
		public void setCategoryName(String categoryName) {
			CategoryName = categoryName;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		
	}
	
	@DatabaseTable(tableName="Orders")
	static class Order{
		
		
		public Order() {
			
		}
	}
	
	@DatabaseTable(tableName="OrderView")
	static class OrderView{
		@DatabaseField(canBeNull=false)
		private int orderID;
		public int getOrderID() {
			return orderID;
		}

		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}

		public String getCustomerID() {
			return customerID;
		}

		public void setCustomerID(String customerID) {
			this.customerID = customerID;
		}

		public int getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}

		@DatabaseField(canBeNull=false)
		private String customerID;
		@DatabaseField(canBeNull=true)
		private int employeeID;
		
		public OrderView() {
			
		}
	}
}
