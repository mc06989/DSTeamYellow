package edu.georgiasouthern.dsteamyellow.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;
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
	
	@DatabaseTable(tableName="OrderView")
	public static class OrderView{
		@DatabaseField(canBeNull=false)
		private int OrderID;
		@DatabaseField(canBeNull=true)
		private String contactName;
		@DatabaseField(canBeNull=true)
		private Date RequiredDate;
		@DatabaseField(canBeNull=false)
		private String CompanyName;
		
		public int getOrderID() {
			return OrderID;
		}

		public void setOrderID(int orderID) {
			OrderID = orderID;
		}

		public String getContactName() {
			return contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public Date getRequiredDate() {
			return RequiredDate;
		}

		public void setRequiredDate(Date requiredDate) {
			RequiredDate = requiredDate;
		}

		public String getCompanyName() {
			return CompanyName;
		}

		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}

		public OrderView() {
			
		}
	}
}
