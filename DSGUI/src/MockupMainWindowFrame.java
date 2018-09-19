import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.Color;

public class MockupMainWindowFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MockupMainWindowFrame frame = new MockupMainWindowFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MockupMainWindowFrame() {
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setTitle("Team Yellow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setForeground(Color.BLACK);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel OrdersPanel =  new JPanel();
		tabbedPane.addTab("Orders", null, OrdersPanel, null);
		SpringLayout sl_OrdersPanel = new SpringLayout();
		OrdersPanel.setLayout(sl_OrdersPanel);
		
		JLabel lblActiveOrders = new JLabel("Active Orders");
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, lblActiveOrders, 10, SpringLayout.NORTH, OrdersPanel);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, lblActiveOrders, 10, SpringLayout.WEST, OrdersPanel);
		OrdersPanel.add(lblActiveOrders);
		
		
		DefaultTableModel tModel = new DefaultTableModel();
		String[] columnnames = {"orderID","Shipping Company","Employee","Customer","Freight","Order Date","Required Date"};
		Object[][] data = {
				
		{"11008", "Federal Shipping", "Robert King", "Roland Mendel", "79.46", "Apr  8 1998 12:00AM", "May  6 1998 12:00AM"},
		{"11019", "Federal Shipping", "Michael Suyama", "Sergio Gutiérrez", "3.17", "Apr 13 1998 12:00AM", "May 11 1998 12:00AM"},
		{"11039", "United Package", "Nancy Davolio", "Felipe Izquierdo", "65.00", "Apr 21 1998 12:00AM", "May 19 1998 12:00AM"},
		{"11040", "Federal Shipping", "Margaret Peacock", "Howard Snyder", "18.84", "Apr 22 1998 12:00AM", "May 20 1998 12:00AM"},
		{"11045", "United Package", "Michael Suyama", "Elizabeth Lincoln", "70.58", "Apr 23 1998 12:00AM", "May 21 1998 12:00AM"},
		{"11051", "Federal Shipping", "Robert King", "Annette Roulet", "2.79", "Apr 27 1998 12:00AM", "May 25 1998 12:00AM"},
		{"11054", "Speedy Express", "Laura Callahan", "Patricio Simpson", "0.33", "Apr 28 1998 12:00AM", "May 26 1998 12:00AM"},
		{"11058", "Federal Shipping", "Anne Dodsworth", "Hanna Moos", "31.14", "Apr 29 1998 12:00AM", "May 27 1998 12:00AM"},
		{"11059", "United Package", "Andrew Fuller", "Janete Limeira", "85.80", "Apr 29 1998 12:00AM", "Jun 10 1998 12:00AM"},
		{"11061", "Federal Shipping", "Margaret Peacock", "Howard Snyder", "14.01", "Apr 30 1998 12:00AM", "Jun 11 1998 12:00AM"},
		{"11062", "United Package", "Margaret Peacock", "Maurizio Moroni", "29.93", "Apr 30 1998 12:00AM", "May 28 1998 12:00AM"},
		{"11065", "Speedy Express", "Laura Callahan", "Carlos González", "12.91", "May  1 1998 12:00AM", "May 29 1998 12:00AM"},
		{"11068", "United Package", "Laura Callahan", "Lúcia Carvalho", "81.75", "May  4 1998 12:00AM", "Jun  1 1998 12:00AM"},
		{"11070", "Speedy Express", "Andrew Fuller", "Renate Messner", "136.00", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11071", "Speedy Express", "Nancy Davolio", "Carlos González", "0.93", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11072", "United Package", "Margaret Peacock", "Roland Mendel", "258.64", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11073", "United Package", "Andrew Fuller", "Guillermo Fernández", "24.95", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11074", "United Package", "Robert King", "Jytte Petersen", "18.44", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"},
		{"11075", "United Package", "Laura Callahan", "Michael Holz", "6.19", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"},
		{"11076", "United Package", "Margaret Peacock", "Laurence Lebihan", "38.28", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"},
		{"11077", "United Package", "Nancy Davolio", "Paula Wilson", "8.53", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"}
		};
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MockupOrderWindowDialog ow = new MockupOrderWindowDialog();
				ow.setVisible(true);
			}
		});
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, btnNewOrder, 0, SpringLayout.WEST, lblActiveOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, btnNewOrder, -10, SpringLayout.SOUTH, OrdersPanel);
		OrdersPanel.add(btnNewOrder);
		
		JButton btnDeleteSelectedOrders = new JButton("Manage Selected Orders");
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, btnDeleteSelectedOrders, 0, SpringLayout.NORTH, btnNewOrder);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, btnDeleteSelectedOrders, 6, SpringLayout.EAST, btnNewOrder);
		OrdersPanel.add(btnDeleteSelectedOrders);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, lblActiveOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, OrdersPanel);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, scrollPane, -6, SpringLayout.NORTH, btnNewOrder);
		sl_OrdersPanel.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, OrdersPanel);
		OrdersPanel.add(scrollPane);
		table = new JTable(data, columnnames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, table, 6, SpringLayout.SOUTH, lblActiveOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, table, 282, SpringLayout.WEST, OrdersPanel);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, table, -6, SpringLayout.NORTH, btnDeleteSelectedOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.EAST, table, -10, SpringLayout.EAST, OrdersPanel);
		
		JButton btnFindOrder = new JButton("Find Order...");
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, btnFindOrder, 6, SpringLayout.EAST, btnDeleteSelectedOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, btnFindOrder, 0, SpringLayout.SOUTH, btnNewOrder);
		OrdersPanel.add(btnFindOrder);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		OrdersPanel.add(scrollPane_3);
		
		
		JPanel CustomerPanel = new JPanel();
		tabbedPane.addTab("Customers", null, CustomerPanel, null);
		SpringLayout sl_CustomerPanel = new SpringLayout();
		CustomerPanel.setLayout(sl_CustomerPanel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		sl_CustomerPanel.putConstraint(SpringLayout.NORTH, scrollPane_2, 5, SpringLayout.NORTH, CustomerPanel);
		sl_CustomerPanel.putConstraint(SpringLayout.WEST, scrollPane_2, 301, SpringLayout.WEST, CustomerPanel);
		CustomerPanel.add(scrollPane_2);
		
		table_1 = new JTable();
		sl_CustomerPanel.putConstraint(SpringLayout.NORTH, table_1, 6, SpringLayout.NORTH, CustomerPanel);
		sl_CustomerPanel.putConstraint(SpringLayout.WEST, table_1, 308, SpringLayout.WEST, CustomerPanel);
		CustomerPanel.add(table_1);
		
		JPanel ProductsPanel = new JPanel();
		tabbedPane.addTab("Products", null, ProductsPanel, null);
		SpringLayout sl_ProductsPanel = new SpringLayout();
		ProductsPanel.setLayout(sl_ProductsPanel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		sl_ProductsPanel.putConstraint(SpringLayout.WEST, scrollPane_1, 0, SpringLayout.WEST, ProductsPanel);
		sl_ProductsPanel.putConstraint(SpringLayout.SOUTH, scrollPane_1, 367, SpringLayout.NORTH, ProductsPanel);
		sl_ProductsPanel.putConstraint(SpringLayout.EAST, scrollPane_1, 609, SpringLayout.WEST, ProductsPanel);
		ProductsPanel.add(scrollPane_1);
		
		
		String[] columnnames_4 = {"ProductID",
				"ProductName",
				"SupplierID",
				"CategoryID",
				"QuantityPerUnit",
				"UnitPrice",
				"UnitsInStock",
				"UnitsOnOrder",
				"ReorderLevel",
				"Discontinued",};
		Object[][] data_4 = {
				{"1", "Chai", "1", "1", "10 boxes x 20 bags", "18.00", "39", "0", "10", "0"},
				{"2", "Chang", "1", "1", "24 - 12 oz bottles", "19.00", "17", "40", "25", "0"},
				{"3", "Aniseed Syrup", "1", "2", "12 - 550 ml bottles", "10.00", "13", "70", "25", "0"},
				{"4", "Chef Anton's Cajun Seasoning", "2", "2", "48 - 6 oz jars", "22.00", "53", "0", "0", "0"},
				{"5", "Chef Anton's Gumbo Mix", "2", "2", "36 boxes", "21.35", "0", "0", "0", "1"},
				{"6", "Grandma's Boysenberry Spread", "3", "2", "12 - 8 oz jars", "25.00", "120", "0", "25", "0"},
				{"7", "Uncle Bob's Organic Dried Pears", "3", "7", "12 - 1 lb pkgs.", "30.00", "15", "0", "10", "0"},
				{"8", "Northwoods Cranberry Sauce", "3", "2", "12 - 12 oz jars", "40.00", "6", "0", "0", "0"},
				{"9", "Mishi Kobe Niku", "4", "6", "18 - 500 g pkgs.", "97.00", "29", "0", "0", "1"},
				{"10", "Ikura", "4", "8", "12 - 200 ml jars", "31.00", "31", "0", "0", "0"},
				{"11", "Queso Cabrales", "5", "4", "1 kg pkg.", "21.00", "22", "30", "30", "0"},
				{"12", "Queso Manchego La Pastora", "5", "4", "10 - 500 g pkgs.", "38.00", "86", "0", "0", "0"},
				{"13", "Konbu", "6", "8", "2 kg box", "6.00", "24", "0", "5", "0"},
				{"14", "Tofu", "6", "7", "40 - 100 g pkgs.", "23.25", "35", "0", "0", "0"},
				{"15", "Genen Shouyu", "6", "2", "24 - 250 ml bottles", "15.50", "39", "0", "5", "0"},
				{"16", "Pavlova", "7", "3", "32 - 500 g boxes", "17.45", "29", "0", "10", "0"},
				{"17", "Alice Mutton", "7", "6", "20 - 1 kg tins", "39.00", "0", "0", "0", "1"},
				{"18", "Carnarvon Tigers", "7", "8", "16 kg pkg.", "62.50", "42", "0", "0", "0"},
				{"19", "Teatime Chocolate Biscuits", "8", "3", "10 boxes x 12 pieces", "9.20", "25", "0", "5", "0"},
				{"20", "Sir Rodney's Marmalade", "8", "3", "30 gift boxes", "81.00", "40", "0", "0", "0"},
				{"21", "Sir Rodney's Scones", "8", "3", "24 pkgs. x 4 pieces", "10.00", "3", "40", "5", "0"},
				{"22", "Gustaf's Knäckebröd", "9", "5", "24 - 500 g pkgs.", "21.00", "104", "0", "25", "0"},
				{"23", "Tunnbröd", "9", "5", "12 - 250 g pkgs.", "9.00", "61", "0", "25", "0"},
				{"24", "Guaraná Fantástica", "10", "1", "12 - 355 ml cans", "4.50", "20", "0", "0", "1"},
				{"25", "NuNuCa Nuß-Nougat-Creme", "11", "3", "20 - 450 g glasses", "14.00", "76", "0", "30", "0"},
				{"26", "Gumbär Gummibärchen", "11", "3", "100 - 250 g bags", "31.23", "15", "0", "0", "0"},
				{"27", "Schoggi Schokolade", "11", "3", "100 - 100 g pieces", "43.90", "49", "0", "30", "0"},
				{"28", "Rössle Sauerkraut", "12", "7", "25 - 825 g cans", "45.60", "26", "0", "0", "1"},
				{"29", "Thüringer Rostbratwurst", "12", "6", "50 bags x 30 sausgs.", "123.79", "0", "0", "0", "1"},
				{"30", "Nord-Ost Matjeshering", "13", "8", "10 - 200 g glasses", "25.89", "10", "0", "15", "0"},
				{"31", "Gorgonzola Telino", "14", "4", "12 - 100 g pkgs", "12.50", "0", "70", "20", "0"},
				{"32", "Mascarpone Fabioli", "14", "4", "24 - 200 g pkgs.", "32.00", "9", "40", "25", "0"},
				{"33", "Geitost", "15", "4", "500 g", "2.50", "112", "0", "20", "0"},
				{"34", "Sasquatch Ale", "16", "1", "24 - 12 oz bottles", "14.00", "111", "0", "15", "0"},
				{"35", "Steeleye Stout", "16", "1", "24 - 12 oz bottles", "18.00", "20", "0", "15", "0"},
				{"36", "Inlagd Sill", "17", "8", "24 - 250 g  jars", "19.00", "112", "0", "20", "0"},
				{"37", "Gravad lax", "17", "8", "12 - 500 g pkgs.", "26.00", "11", "50", "25", "0"},
				{"38", "Côte de Blaye", "18", "1", "12 - 75 cl bottles", "263.50", "17", "0", "15", "0"},
				{"39", "Chartreuse verte", "18", "1", "750 cc per bottle", "18.00", "69", "0", "5", "0"},
				{"40", "Boston Crab Meat", "19", "8", "24 - 4 oz tins", "18.40", "123", "0", "30", "0"},
				{"41", "Jack's New England Clam Chowder", "19", "8", "12 - 12 oz cans", "9.65", "85", "0", "10", "0"},
				{"42", "Singaporean Hokkien Fried Mee", "20", "5", "32 - 1 kg pkgs.", "14.00", "26", "0", "0", "1"},
				{"43", "Ipoh Coffee", "20", "1", "16 - 500 g tins", "46.00", "17", "10", "25", "0"},
				{"44", "Gula Malacca", "20", "2", "20 - 2 kg bags", "19.45", "27", "0", "15", "0"},
				{"45", "Rogede sild", "21", "8", "1k pkg.", "9.50", "5", "70", "15", "0"},
				{"46", "Spegesild", "21", "8", "4 - 450 g glasses", "12.00", "95", "0", "0", "0"},
				{"47", "Zaanse koeken", "22", "3", "10 - 4 oz boxes", "9.50", "36", "0", "0", "0"},
				{"48", "Chocolade", "22", "3", "10 pkgs.", "12.75", "15", "70", "25", "0"},
				{"49", "Maxilaku", "23", "3", "24 - 50 g pkgs.", "20.00", "10", "60", "15", "0"},
				{"50", "Valkoinen suklaa", "23", "3", "12 - 100 g bars", "16.25", "65", "0", "30", "0"},
				{"51", "Manjimup Dried Apples", "24", "7", "50 - 300 g pkgs.", "53.00", "20", "0", "10", "0"},
				{"52", "Filo Mix", "24", "5", "16 - 2 kg boxes", "7.00", "38", "0", "25", "0"},
				{"53", "Perth Pasties", "24", "6", "48 pieces", "32.80", "0", "0", "0", "1"},
				{"54", "Tourtière", "25", "6", "16 pies", "7.45", "21", "0", "10", "0"},
				{"55", "Pâté chinois", "25", "6", "24 boxes x 2 pies", "24.00", "115", "0", "20", "0"},
				{"56", "Gnocchi di nonna Alice", "26", "5", "24 - 250 g pkgs.", "38.00", "21", "10", "30", "0"},
				{"57", "Ravioli Angelo", "26", "5", "24 - 250 g pkgs.", "19.50", "36", "0", "20", "0"},
				{"58", "Escargots de Bourgogne", "27", "8", "24 pieces", "13.25", "62", "0", "20", "0"},
				{"59", "Raclette Courdavault", "28", "4", "5 kg pkg.", "55.00", "79", "0", "0", "0"},
				{"60", "Camembert Pierrot", "28", "4", "15 - 300 g rounds", "34.00", "19", "0", "0", "0"},
				{"61", "Sirop d'érable", "29", "2", "24 - 500 ml bottles", "28.50", "113", "0", "25", "0"},
				{"62", "Tarte au sucre", "29", "3", "48 pies", "49.30", "17", "0", "0", "0"},
				{"63", "Vegie-spread", "7", "2", "15 - 625 g jars", "43.90", "24", "0", "5", "0"},
				{"64", "Wimmers gute Semmelknödel", "12", "5", "20 bags x 4 pieces", "33.25", "22", "80", "30", "0"},
				{"65", "Louisiana Fiery Hot Pepper Sauce", "2", "2", "32 - 8 oz bottles", "21.05", "76", "0", "0", "0"},
				{"66", "Louisiana Hot Spiced Okra", "2", "2", "24 - 8 oz jars", "17.00", "4", "100", "20", "0"},
				{"67", "Laughing Lumberjack Lager", "16", "1", "24 - 12 oz bottles", "14.00", "52", "0", "10", "0"},
				{"68", "Scottish Longbreads", "8", "3", "10 boxes x 8 pieces", "12.50", "6", "10", "15", "0"},
				{"69", "Gudbrandsdalsost", "15", "4", "10 kg pkg.", "36.00", "26", "0", "15", "0"},
				{"70", "Outback Lager", "7", "1", "24 - 355 ml bottles", "15.00", "15", "10", "30", "0"},
				{"71", "Flotemysost", "15", "4", "10 - 500 g pkgs.", "21.50", "26", "0", "0", "0"},
				{"72", "Mozzarella di Giovanni", "14", "4", "24 - 200 g pkgs.", "34.80", "14", "0", "0", "0"},
				{"73", "Röd Kaviar", "17", "8", "24 - 150 g jars", "15.00", "101", "0", "5", "0"},
				{"74", "Longlife Tofu", "4", "7", "5 kg pkg.", "10.00", "4", "20", "5", "0"},
				{"75", "Rhönbräu Klosterbier", "12", "1", "24 - 0.5 l bottles", "7.75", "125", "0", "25", "0"},
				{"76", "Lakkalikööri", "23", "1", "500 ml", "18.00", "57", "0", "20", "0"},
				{"77", "Original Frankfurter grüne Soße", "12", "2", "12 boxes", "13.00", "32", "0", "15", "0"}
		};
		table_4 = new JTable(data_4, columnnames_4);
		table_4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_1.setViewportView(table_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		sl_ProductsPanel.putConstraint(SpringLayout.NORTH, scrollPane_1, 6, SpringLayout.SOUTH, lblNewLabel_2);
		sl_ProductsPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 10, SpringLayout.WEST, ProductsPanel);
		sl_ProductsPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 10, SpringLayout.NORTH, ProductsPanel);
		ProductsPanel.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		sl_ProductsPanel.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.SOUTH, scrollPane_1);
		sl_ProductsPanel.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, ProductsPanel);
		sl_ProductsPanel.putConstraint(SpringLayout.SOUTH, panel, 13, SpringLayout.SOUTH, ProductsPanel);
		sl_ProductsPanel.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, ProductsPanel);
		ProductsPanel.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnNewProduct = new JButton("New Product");
		panel.add(btnNewProduct);
		
		JButton btnManageProducts = new JButton("Manage Product(s)");
		panel.add(btnManageProducts);
		
		JButton btnFindProducts = new JButton("Find Product(s)");
		panel.add(btnFindProducts);
		
		JPanel ShipmentsPanel = new JPanel();
		tabbedPane.addTab("Shipments", null, ShipmentsPanel, null);
		SpringLayout sl_ShipmentsPanel = new SpringLayout();
		ShipmentsPanel.setLayout(sl_ShipmentsPanel);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		sl_ShipmentsPanel.putConstraint(SpringLayout.WEST, scrollPane_4, 10, SpringLayout.WEST, ShipmentsPanel);
		sl_ShipmentsPanel.putConstraint(SpringLayout.SOUTH, scrollPane_4, -210, SpringLayout.SOUTH, ShipmentsPanel);
		sl_ShipmentsPanel.putConstraint(SpringLayout.EAST, scrollPane_4, -10, SpringLayout.EAST, ShipmentsPanel);
		ShipmentsPanel.add(scrollPane_4);
		scrollPane_4.setMinimumSize(new Dimension(20,20));
		
		table_2 = new JTable();
		scrollPane_4.setViewportView(table_2);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		sl_ShipmentsPanel.putConstraint(SpringLayout.WEST, scrollPane_5, 10, SpringLayout.WEST, ShipmentsPanel);
		sl_ShipmentsPanel.putConstraint(SpringLayout.SOUTH, scrollPane_5, -10, SpringLayout.SOUTH, ShipmentsPanel);
		sl_ShipmentsPanel.putConstraint(SpringLayout.EAST, scrollPane_5, -10, SpringLayout.EAST, ShipmentsPanel);
		ShipmentsPanel.add(scrollPane_5);
		
		table_3 = new JTable();
		scrollPane_5.setViewportView(table_3);
		
		JLabel lblNewLabel = new JLabel("Incoming");
		sl_ShipmentsPanel.putConstraint(SpringLayout.NORTH, scrollPane_4, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_ShipmentsPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, ShipmentsPanel);
		sl_ShipmentsPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, ShipmentsPanel);
		ShipmentsPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Outgoing");
		sl_ShipmentsPanel.putConstraint(SpringLayout.NORTH, scrollPane_5, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_ShipmentsPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, scrollPane_4);
		sl_ShipmentsPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, scrollPane_4);
		ShipmentsPanel.add(lblNewLabel_1);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("1	Chai	1	1	10 boxes x 20 bags	18.00	39	0	10	0");
		
		listModel.addElement("Product 2");
		
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, OrdersPanel, CustomerPanel}));
	}
}
