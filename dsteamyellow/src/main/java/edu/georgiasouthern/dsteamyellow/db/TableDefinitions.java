package edu.georgiasouthern.dsteamyellow.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;
//TODO: Implement Foreign key support for all tables and views
public class TableDefinitions {
	
	@DatabaseTable(tableName="categories")
	public static class Category{
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
	
	@DatabaseTable(tableName="Customers")
	public static class Customer{
		@DatabaseField(id=true)
		private String CustomerID;
		@DatabaseField(canBeNull=false)
		private String CompanyName;
		@DatabaseField(canBeNull=true)
		private String ContactName;
		@DatabaseField(canBeNull=true)
		private String ContactTitle;
		@DatabaseField(canBeNull=true)
		private String Address;
		@DatabaseField(canBeNull=true)
		private String City;
		@DatabaseField(canBeNull=true)
		private String Region;
		@DatabaseField(canBeNull=true)
		private String PostalCode;
		@DatabaseField(canBeNull=true)
		private String Country;
		@DatabaseField(canBeNull=true)
		private String Phone;
		@DatabaseField(canBeNull=true)
		private String Fax;
		
		public Customer() {
			
		}

		public String getCustomerID() {
			return CustomerID;
		}

		public void setCustomerID(String customerID) {
			CustomerID = customerID;
		}

		public String getCompanyName() {
			return CompanyName;
		}

		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}

		public String getContactName() {
			return ContactName;
		}

		public void setContactName(String contactName) {
			ContactName = contactName;
		}

		public String getContactTitle() {
			return ContactTitle;
		}

		public void setContactTitle(String contactTitle) {
			ContactTitle = contactTitle;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getRegion() {
			return Region;
		}

		public void setRegion(String region) {
			Region = region;
		}

		public String getPostalCode() {
			return PostalCode;
		}

		public void setPostalCode(String postalCode) {
			PostalCode = postalCode;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}

		public String getFax() {
			return Fax;
		}

		public void setFax(String fax) {
			Fax = fax;
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
	
	@DatabaseTable(tableName="OrderDetailsView")
	public static class OrderDetailsView{
		
		@DatabaseField(canBeNull=false)
		public int OrderID;
		@DatabaseField(canBeNull=true)
		public String ShipAddress;
		@DatabaseField(canBeNull=true)
		public String ShipPostal;
		@DatabaseField(canBeNull=false)
		public String CustomerID;
		@DatabaseField(canBeNull=true)
		public String ContactName;
//		@DatabaseField(canBeNull=true)
//		public float TotalPrice;
		@DatabaseField(canBeNull=false)
		public String ShipCity;
		
		public int getOrderID() {
			return OrderID;
		}

		public void setOrderID(int orderID) {
			OrderID = orderID;
		}

		public String getShipAddress() {
			return ShipAddress;
		}

		public void setShipAddress(String shipAddress) {
			ShipAddress = shipAddress;
		}

		public String getShipPostal() {
			return ShipPostal;
		}

		public void setShipPostal(String shipPostal) {
			ShipPostal = shipPostal;
		}

		public String getCustomerID() {
			return CustomerID;
		}

		public void setCustomerID(String customerID) {
			CustomerID = customerID;
		}

		public String getContactName() {
			return ContactName;
		}

		public void setContactName(String contactName) {
			ContactName = contactName;
		}

//		public float getTotalPrice() {
//			return TotalPrice;
//		}
//
//		public void setTotalPrice(float totalPrice) {
//			TotalPrice = totalPrice;
//		}

		public OrderDetailsView() {
			
		}
	}
	
	@DatabaseTable(tableName="Employees")
	public static class Employee{
		@DatabaseField(id=true,canBeNull=false, columnName="EmployeeID")
		private int EmployeeID;
		@DatabaseField(canBeNull=false)
		private String LastName;
		@DatabaseField(canBeNull=false)
		private String FirstName;
		@DatabaseField(canBeNull=false)
		private String Title;
		@DatabaseField(canBeNull=true)
		private String TitleOfCourtesy;
		@DatabaseField(canBeNull=true)
		private Date BirthDate;
		@DatabaseField(canBeNull=true)
		private Date HireDate;
		@DatabaseField(canBeNull=true)
		private String Address;
		@DatabaseField(canBeNull=true)
		private String City;
		@DatabaseField(canBeNull=true)
		private String Region;
		
		
		
		public int getEmployeeID() {
			return EmployeeID;
		}

		public void setEmployeeID(int employeeID) {
			EmployeeID = employeeID;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getTitle() {
			return Title;
		}

		public void setTitle(String title) {
			Title = title;
		}

		public String getTitleOfCourtesy() {
			return TitleOfCourtesy;
		}

		public void setTitleOfCourtesy(String titleOfCourtesy) {
			TitleOfCourtesy = titleOfCourtesy;
		}

		public Date getBirthDate() {
			return BirthDate;
		}

		public void setBirthDate(Date birthDate) {
			BirthDate = birthDate;
		}

		public Date getHireDate() {
			return HireDate;
		}

		public void setHireDate(Date hireDate) {
			HireDate = hireDate;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getRegion() {
			return Region;
		}

		public void setRegion(String region) {
			Region = region;
		}

		public String getPostalCode() {
			return PostalCode;
		}

		public void setPostalCode(String postalCode) {
			PostalCode = postalCode;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public String getHomePhone() {
			return HomePhone;
		}

		public void setHomePhone(String homePhone) {
			HomePhone = homePhone;
		}

		public String getExtension() {
			return Extension;
		}

		public void setExtension(String extension) {
			Extension = extension;
		}

		public int getReportsTo() {
			return ReportsTo;
		}

		public void setReportsTo(int reportsTo) {
			ReportsTo = reportsTo;
		}

		public String getPhotopath() {
			return Photopath;
		}

		public void setPhotopath(String photopath) {
			Photopath = photopath;
		}

		@DatabaseField(canBeNull=true)
		private String PostalCode;
		@DatabaseField(canBeNull=true)
		private String Country;
		@DatabaseField(canBeNull=true)
		private String HomePhone;
		@DatabaseField(canBeNull=true)
		private String Extension;
		@DatabaseField(canBeNull=true)
		private int ReportsTo;
		@DatabaseField(canBeNull=true)
		private String Photopath;
		@DatabaseField(canBeNull=true)
		private String Notes;
		
		public String getNotes() {
			return Notes;
		}

		public void setNotes(String notes) {
			Notes = notes;
		}

		public Employee() {
			
		}
	}
	
	@DatabaseTable(tableName="EmployeeView")
	public static class EmployeeView {
		@DatabaseField(canBeNull=false)
		private int EmployeeID;
		@DatabaseField(canBeNull=false)
		private String EmployeeName;
		@DatabaseField(canBeNull=true)
		private String Title;
		@DatabaseField(canBeNull=false)
		private String FullAddress;
		@DatabaseField(canBeNull=true)
		public String HomePhone;
		@DatabaseField(canBeNull=false)
		public String ReportsTo;
		@DatabaseField(canBeNull=true)
		public int ReportsToID;
		
		public int getEmployeeID() {
			return EmployeeID;
		}

		public void setEmployeeID(int employeeID) {
			EmployeeID = employeeID;
		}

		public String getEmployeeName() {
			return EmployeeName;
		}

		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}

		public String getTitle() {
			return Title;
		}

		public void setTitle(String title) {
			Title = title;
		}

		public String getFullAddress() {
			return FullAddress;
		}

		public void setFullAddress(String fullAddress) {
			FullAddress = fullAddress;
		}

		public String getHomePhone() {
			return HomePhone;
		}

		public void setHomePhone(String homePhone) {
			HomePhone = homePhone;
		}

		public String getReportsTo() {
			return ReportsTo;
		}

		public void setReportsTo(String reportsTo) {
			ReportsTo = reportsTo;
		}

		public int getReportsToID() {
			return ReportsToID;
		}

		public void setReportsToID(int reportsToID) {
			ReportsToID = reportsToID;
		}
		
		public EmployeeView() {
			
		}
	}
	
	@DatabaseTable(tableName="Products")
	public static class Product{
		public Product() {
			
		}
		@DatabaseField(id=true)
		private int ProductID;
		@DatabaseField(canBeNull=false)
		private String ProductName;
		@DatabaseField(canBeNull=true)
		private int SupplierID;
		@DatabaseField(canBeNull=true)
		private int CategoryID;
		@DatabaseField(canBeNull=true)
		private String QuantityPerUnit;
		@DatabaseField(canBeNull=true)
		private float UnitPrice;
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public int getSupplierID() {
			return SupplierID;
		}
		public void setSupplierID(int supplierID) {
			SupplierID = supplierID;
		}
		public int getCategoryID() {
			return CategoryID;
		}
		public void setCategoryID(int categoryID) {
			CategoryID = categoryID;
		}
		public String getQuantityPerUnit() {
			return QuantityPerUnit;
		}
		public void setQuantityPerUnit(String quantityPerUnit) {
			QuantityPerUnit = quantityPerUnit;
		}
		public float getUnitPrice() {
			return UnitPrice;
		}
		public void setUnitPrice(float unitPrice) {
			UnitPrice = unitPrice;
		}
		public short getUnitsInStock() {
			return UnitsInStock;
		}
		public void setUnitsInStock(short unitsInStock) {
			UnitsInStock = unitsInStock;
		}
		public short getUnitsOnOrder() {
			return UnitsOnOrder;
		}
		public void setUnitsOnOrder(short unitsOnOrder) {
			UnitsOnOrder = unitsOnOrder;
		}
		public short getReorderLevel() {
			return ReorderLevel;
		}
		public void setReorderLevel(short reorderLevel) {
			ReorderLevel = reorderLevel;
		}
		public boolean isDiscontinued() {
			return Discontinued;
		}
		public void setDiscontinued(boolean discontinued) {
			Discontinued = discontinued;
		}
		@DatabaseField(canBeNull=true)
		private short UnitsInStock;
		@DatabaseField(canBeNull=true)
		private short UnitsOnOrder;
		@DatabaseField(canBeNull=true)
		private short ReorderLevel;
		@DatabaseField(canBeNull=true)
		private boolean Discontinued;
	}

	@DatabaseTable(tableName="Orders")
	public static class Order{
		@DatabaseField(id=true)
		private Integer OrderID;
		@DatabaseField(foreign=true, foreignAutoRefresh=true, columnName="CustomerID")
		private Customer CustomerID;
		@DatabaseField(foreign=true, foreignAutoRefresh=true, columnName="EmployeeID")
		private Employee EmployeeID;
		@DatabaseField(canBeNull=true)
		private Date OrderDate;
		@DatabaseField(canBeNull=true)
		private Date RequiredDate;
		@DatabaseField(canBeNull=true)
		private Date ShippedDate;
		@DatabaseField(foreign=true, columnName="ShipVia")
		private Shipper ShipVia;
		@DatabaseField(canBeNull=true)
		private float Freight;
		@DatabaseField(canBeNull=true)
		private String ShipName;
		@DatabaseField(canBeNull=true)
		private String ShipAddress;
		@DatabaseField(canBeNull=true)
		private String ShipCity;
		@DatabaseField(canBeNull=true)
		private String ShipRegion;
		@DatabaseField(canBeNull=true)
		private String ShipPostalCode;
		@DatabaseField(canBeNull=true)
		private String ShipCountry;
		
		public Order() {
			
		}

		public int getOrderID() {
			return OrderID;
		}

		public void setOrderID(int orderID) {
			OrderID = orderID;
		}

		public Customer getCustomerID() {
			return CustomerID;
		}

		public void setCustomerID(Customer customerID) {
			CustomerID = customerID;
		}

		public Employee getEmployeeID() {
			return EmployeeID;
		}

		public void setEmployeeID(Employee employeeID) {
			EmployeeID = employeeID;
		}

		public Date getOrderDate() {
			return OrderDate;
		}

		public void setOrderDate(Date orderDate) {
			OrderDate = orderDate;
		}

		public Date getRequiredDate() {
			return RequiredDate;
		}

		public void setRequiredDate(Date requiredDate) {
			RequiredDate = requiredDate;
		}

		public Date getShippedDate() {
			return ShippedDate;
		}

		public void setShippedDate(Date shippedDate) {
			ShippedDate = shippedDate;
		}

		public Shipper getShipVia() {
			return ShipVia;
		}

		public void setShipVia(Shipper shipVia) {
			ShipVia = shipVia;
		}

		public float getFreight() {
			return Freight;
		}

		public void setFreight(float freight) {
			Freight = freight;
		}

		public String getShipName() {
			return ShipName;
		}

		public void setShipName(String shipName) {
			ShipName = shipName;
		}

		public String getShipAddress() {
			return ShipAddress;
		}

		public void setShipAddress(String shipAddress) {
			ShipAddress = shipAddress;
		}

		public String getShipCity() {
			return ShipCity;
		}

		public void setShipCity(String shipCity) {
			ShipCity = shipCity;
		}

		public String getShipRegion() {
			return ShipRegion;
		}

		public void setShipRegion(String shipRegion) {
			ShipRegion = shipRegion;
		}

		public String getShipPostalCode() {
			return ShipPostalCode;
		}

		public void setShipPostalCode(String shipPostalCode) {
			ShipPostalCode = shipPostalCode;
		}

		public String getShipCountry() {
			return ShipCountry;
		}

		public void setShipCountry(String shipCountry) {
			ShipCountry = shipCountry;
		}
		
		
	}

	@DatabaseTable(tableName="Shippers")
	public static class Shipper{
		
		@DatabaseField(id=true)
		private int ShipperID;
		@DatabaseField(canBeNull=false)
		private String CompanyName;
		@DatabaseField(canBeNull=true)
		private String Phone;
		
		public Shipper() {
			
		}

		public int getShipperID() {
			return ShipperID;
		}

		public void setShipperID(int shipperID) {
			ShipperID = shipperID;
		}

		public String getCompanyName() {
			return CompanyName;
		}

		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}
		
		
	}
	
	@DatabaseTable(tableName="Order Details")
	public static class OrderDetail{
		@DatabaseField(id=true)
		private int OrderID;
		@DatabaseField()
		private int ProductID;
		@DatabaseField(canBeNull=false)
		private float UnitPrice;
		@DatabaseField(canBeNull=false)
		private short Quantity;
		@DatabaseField(canBeNull=false)
		private float Discount;
		
		
		
		public OrderDetail() {
			
		}

		public int getOrderID() {
			return OrderID;
		}

		public void setOrderID(int orderID) {
			OrderID = orderID;
		}

		public int getProductID() {
			return ProductID;
		}

		public void setProductID(int productID) {
			ProductID = productID;
		}

		public float getUnitPrice() {
			return UnitPrice;
		}

		public void setUnitPrice(float unitPrice) {
			UnitPrice = unitPrice;
		}

		public short getQuantity() {
			return Quantity;
		}

		public void setQuantity(short quantity) {
			Quantity = quantity;
		}

		public float getDiscount() {
			return Discount;
		}

		public void setDiscount(float discount) {
			Discount = discount;
		}
		
		
	}
	
	@DatabaseTable(tableName="Suppliers")
	public static class Supplier{
		@DatabaseField(id=true)
		private int SupplierID;
		@DatabaseField(canBeNull=false)
		private String CompanyName;
		@DatabaseField(canBeNull=true)
		private String ContactName;
		@DatabaseField(canBeNull=true)
		private String ContactTitle;
		@DatabaseField(canBeNull=true)
		private String Address;
		@DatabaseField(canBeNull=true)
		private String City;
		@DatabaseField(canBeNull=true)
		private String Region;
		@DatabaseField(canBeNull=true)
		private String PostalCode;
		@DatabaseField(canBeNull=true)
		private String Country;
		@DatabaseField(canBeNull=true)
		private String Phone;
		@DatabaseField(canBeNull=true)
		private String Fax;
		@DatabaseField(canBeNull=true)
		private String HomePage;
		
		public Supplier() {
			
		}

		public int getSupplierID() {
			return SupplierID;
		}

		public void setSupplierID(int supplierID) {
			SupplierID = supplierID;
		}

		public String getCompanyName() {
			return CompanyName;
		}

		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}

		public String getContactName() {
			return ContactName;
		}

		public void setContactName(String contactName) {
			ContactName = contactName;
		}

		public String getContactTitle() {
			return ContactTitle;
		}

		public void setContactTitle(String contactTitle) {
			ContactTitle = contactTitle;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getRegion() {
			return Region;
		}

		public void setRegion(String region) {
			Region = region;
		}

		public String getPostalCode() {
			return PostalCode;
		}

		public void setPostalCode(String postalCode) {
			PostalCode = postalCode;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}

		public String getFax() {
			return Fax;
		}

		public void setFax(String fax) {
			Fax = fax;
		}

		public String getHomePage() {
			return HomePage;
		}

		public void setHomePage(String homePage) {
			HomePage = homePage;
		}
		
		
	}
}
