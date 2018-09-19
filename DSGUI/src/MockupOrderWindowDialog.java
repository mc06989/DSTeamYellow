import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

import com.github.lgooddatepicker.*;
import com.github.lgooddatepicker.components.DateTimePicker;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import java.awt.Color;
import java.awt.Dimension;

public class MockupOrderWindowDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtShippingAmount;
	private JTextField txtTaxAmount;
	private JLabel lblEmployee;
	private JLabel label_2;
	private JLabel lblTaxAmount;
	private JLabel label;
	private JLabel lblCustomer;
	private JTextField txtRobertKing;
	private JLabel lblProducts;
	private JTable table;
	private JButton removeButton;
	private JButton addButton;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MockupOrderWindowDialog dialog = new MockupOrderWindowDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MockupOrderWindowDialog() {
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("New Order");
		setBounds(100, 100, 342, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		{
			lblEmployee = new JLabel("Employee");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblEmployee, 5, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblEmployee, 10, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblEmployee);
		}
		{
			txtShippingAmount = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.EAST, txtShippingAmount, -10, SpringLayout.EAST, contentPanel);
			contentPanel.add(txtShippingAmount);
			txtShippingAmount.setText("20.53");
			txtShippingAmount.setColumns(10);
		}
		{
			label_2 = new JLabel("OrderDate");
			sl_contentPanel.putConstraint(SpringLayout.WEST, label_2, 10, SpringLayout.WEST, contentPanel);
			contentPanel.add(label_2);
		}
		{
			label = new JLabel("Shipping Amount");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.SOUTH, lblEmployee);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, label_2, 10, SpringLayout.SOUTH, label);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, txtShippingAmount, -3, SpringLayout.NORTH, label);
			sl_contentPanel.putConstraint(SpringLayout.WEST, txtShippingAmount, 10, SpringLayout.EAST, label);
			sl_contentPanel.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, contentPanel);
			contentPanel.add(label);
		}
		{
			lblTaxAmount = new JLabel("Tax Amount");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblTaxAmount, 10, SpringLayout.SOUTH, label_2);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblTaxAmount, 0, SpringLayout.WEST, lblEmployee);
			contentPanel.add(lblTaxAmount);
		}
		{
			txtTaxAmount = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, txtTaxAmount, -3, SpringLayout.NORTH, lblTaxAmount);
			sl_contentPanel.putConstraint(SpringLayout.WEST, txtTaxAmount, 13, SpringLayout.EAST, lblTaxAmount);
			sl_contentPanel.putConstraint(SpringLayout.EAST, txtTaxAmount, -10, SpringLayout.EAST, contentPanel);
			contentPanel.add(txtTaxAmount);
			txtTaxAmount.setText("10.22");
			txtTaxAmount.setColumns(10);
		}
		{
			lblCustomer = new JLabel("Customer");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblCustomer, 10, SpringLayout.SOUTH, lblTaxAmount);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblCustomer, 0, SpringLayout.WEST, lblEmployee);
			contentPanel.add(lblCustomer);
		}
		{
			txtRobertKing = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, txtRobertKing, -3, SpringLayout.NORTH, lblCustomer);
			sl_contentPanel.putConstraint(SpringLayout.WEST, txtRobertKing, 10, SpringLayout.EAST, lblCustomer);
			sl_contentPanel.putConstraint(SpringLayout.EAST, txtRobertKing, 0, SpringLayout.EAST, txtShippingAmount);
			txtRobertKing.setText("Robert King");
			txtRobertKing.setColumns(10);
			contentPanel.add(txtRobertKing);
		}
		
		JComboBox comboBox = new JComboBox();
		
		sl_contentPanel.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblEmployee);
		sl_contentPanel.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.EAST, lblEmployee);
		sl_contentPanel.putConstraint(SpringLayout.EAST, comboBox, -10, SpringLayout.EAST, contentPanel);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nancy Davolio", "Andrew Fuller", "Janet Leverling", "Margaret Peacock", "Steven Buchanan", "Michael Suyama", "Robert King", "Laura Callahan", "Anne Dodsworth"}));
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(200);
		comboBox.addItem("Employee 1");
		comboBox.addItem("Employee 2");
		comboBox.addItem("Employee 3");
		comboBox.addItem("Employee 4");
		comboBox.addItem("Employee 5");
		comboBox.addItem("Employee 6");
		comboBox.addItem("Employee 7");
		comboBox.addItem("Employee 8");
		contentPanel.add(comboBox);
		{
			lblProducts = new JLabel("Products");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblProducts, 10, SpringLayout.SOUTH, lblCustomer);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblProducts, 0, SpringLayout.WEST, lblEmployee);
			contentPanel.add(lblProducts);
		}
		
		DateTimePicker dateTimePicker = new DateTimePicker();
		sl_contentPanel.putConstraint(SpringLayout.NORTH, dateTimePicker, -3, SpringLayout.NORTH, label_2);
		sl_contentPanel.putConstraint(SpringLayout.WEST, dateTimePicker, 10, SpringLayout.EAST, label_2);
		sl_contentPanel.putConstraint(SpringLayout.EAST, dateTimePicker, -10, SpringLayout.EAST, contentPanel);
		contentPanel.add(dateTimePicker);
		
		{
			removeButton = new JButton("Remove Products(s)");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, removeButton, -4, SpringLayout.NORTH, lblProducts);
			sl_contentPanel.putConstraint(SpringLayout.EAST, removeButton, 0, SpringLayout.EAST, txtShippingAmount);
			contentPanel.add(removeButton);
		}
		{
			addButton = new JButton("Add Products");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, addButton, 0, SpringLayout.NORTH, removeButton);
			sl_contentPanel.putConstraint(SpringLayout.WEST, addButton, -119, SpringLayout.WEST, removeButton);
			sl_contentPanel.putConstraint(SpringLayout.EAST, addButton, -5, SpringLayout.WEST, removeButton);
			contentPanel.add(addButton);
		}
		{
			String[] columnnames = {"Name", "Unit Price", "Quantity/Unit", "Category"};
			Object[][] data = {
					{"Chai", "18.00", "10 boxes x 20 bags", "Beverages"}, 
					{"Chang", "19.00", "24 - 12 oz bottles", "Beverages"}, 
					{"Aniseed Syrup", "10.00", "12 - 550 ml bottles", "Condiments"}, 
					{"Chef Anton's Cajun Seasoning", "22.00", "48 - 6 oz jars", "Condiments"}, 
					{"Grandma's Boysenberry Spread", "25.00", "12 - 8 oz jars", "Condiments"}, 
					{"Uncle Bob's Organic Dried Pears", "30.00", "12 - 1 lb pkgs.", "Produce"}, 
					{"Northwoods Cranberry Sauce", "40.00", "12 - 12 oz jars", "Condiments"}, 
					{"Ikura", "31.00", "12 - 200 ml jars", "Seafood"}, 
					{"Queso Cabrales", "21.00", "1 kg pkg.", "Dairy Products"}, 
					{"Queso Manchego La Pastora", "38.00", "10 - 500 g pkgs.", "Dairy Products"}, 
					{"Konbu", "6.00", "2 kg box", "Seafood"}, 
					{"Tofu", "23.25", "40 - 100 g pkgs.", "Produce"}, 
					{"Genen Shouyu", "15.50", "24 - 250 ml bottles", "Condiments"}, 
					{"Pavlova", "17.45", "32 - 500 g boxes", "Confections"}, 
					{"Carnarvon Tigers", "62.50", "16 kg pkg.", "Seafood"}, 
					{"Teatime Chocolate Biscuits", "9.20", "10 boxes x 12 pieces", "Confections"}, 
					{"Sir Rodney's Marmalade", "81.00", "30 gift boxes", "Confections"}, 
					{"Sir Rodney's Scones", "10.00", "24 pkgs. x 4 pieces", "Confections"}, 
					{"Gustaf's Knäckebröd", "21.00", "24 - 500 g pkgs.", "Grains/Cereals"}, 
					{"Tunnbröd", "9.00", "12 - 250 g pkgs.", "Grains/Cereals"}, 
					{"NuNuCa Nuß-Nougat-Creme", "14.00", "20 - 450 g glasses", "Confections"}, 
					{"Gumbär Gummibärchen", "31.23", "100 - 250 g bags", "Confections"}, 
					{"Schoggi Schokolade", "43.90", "100 - 100 g pieces", "Confections"}, 
					{"Nord-Ost Matjeshering", "25.89", "10 - 200 g glasses", "Seafood"}, 
					{"Gorgonzola Telino", "12.50", "12 - 100 g pkgs", "Dairy Products"}, 
					{"Mascarpone Fabioli", "32.00", "24 - 200 g pkgs.", "Dairy Products"}, 
					{"Geitost", "2.50", "500 g", "Dairy Products"}, 
					{"Sasquatch Ale", "14.00", "24 - 12 oz bottles", "Beverages"}, 
					{"Steeleye Stout", "18.00", "24 - 12 oz bottles", "Beverages"}, 
					{"Inlagd Sill", "19.00", "24 - 250 g  jars", "Seafood"}, 
					{"Gravad lax", "26.00", "12 - 500 g pkgs.", "Seafood"}, 
					{"Côte de Blaye", "263.50", "12 - 75 cl bottles", "Beverages"}, 
					{"Chartreuse verte", "18.00", "750 cc per bottle", "Beverages"}, 
					{"Boston Crab Meat", "18.40", "24 - 4 oz tins", "Seafood"}, 
					{"Jack's New England Clam Chowder", "9.65", "12 - 12 oz cans", "Seafood"}, 
					{"Ipoh Coffee", "46.00", "16 - 500 g tins", "Beverages"}, 
					{"Gula Malacca", "19.45", "20 - 2 kg bags", "Condiments"}, 
					{"Rogede sild", "9.50", "1k pkg.", "Seafood"}, 
					{"Spegesild", "12.00", "4 - 450 g glasses", "Seafood"}, 
					{"Zaanse koeken", "9.50", "10 - 4 oz boxes", "Confections"}, 
					{"Chocolade", "12.75", "10 pkgs.", "Confections"}, 
					{"Maxilaku", "20.00", "24 - 50 g pkgs.", "Confections"}, 
					{"Valkoinen suklaa", "16.25", "12 - 100 g bars", "Confections"}, 
					{"Manjimup Dried Apples", "53.00", "50 - 300 g pkgs.", "Produce"}, 
					{"Filo Mix", "7.00", "16 - 2 kg boxes", "Grains/Cereals"}, 
					{"Tourtière", "7.45", "16 pies", "Meat/Poultry"}, 
					{"Pâté chinois", "24.00", "24 boxes x 2 pies", "Meat/Poultry"}, 
					{"Gnocchi di nonna Alice", "38.00", "24 - 250 g pkgs.", "Grains/Cereals"}, 
					{"Ravioli Angelo", "19.50", "24 - 250 g pkgs.", "Grains/Cereals"}, 
					{"Escargots de Bourgogne", "13.25", "24 pieces", "Seafood"}, 
					{"Raclette Courdavault", "55.00", "5 kg pkg.", "Dairy Products"}, 
					{"Camembert Pierrot", "34.00", "15 - 300 g rounds", "Dairy Products"}, 
					{"Sirop d'érable", "28.50", "24 - 500 ml bottles", "Condiments"}, 
					{"Tarte au sucre", "49.30", "48 pies", "Confections"}, 
					{"Vegie-spread", "43.90", "15 - 625 g jars", "Condiments"}, 
					{"Wimmers gute Semmelknödel", "33.25", "20 bags x 4 pieces", "Grains/Cereals"}, 
					{"Louisiana Fiery Hot Pepper Sauce", "21.05", "32 - 8 oz bottles", "Condiments"}, 
					{"Louisiana Hot Spiced Okra", "17.00", "24 - 8 oz jars", "Condiments"}, 
					{"Laughing Lumberjack Lager", "14.00", "24 - 12 oz bottles", "Beverages"}, 
					{"Scottish Longbreads", "12.50", "10 boxes x 8 pieces", "Confections"}, 
					{"Gudbrandsdalsost", "36.00", "10 kg pkg.", "Dairy Products"}, 
					{"Outback Lager", "15.00", "24 - 355 ml bottles", "Beverages"}, 
					{"Flotemysost", "21.50", "10 - 500 g pkgs.", "Dairy Products"}, 
					{"Mozzarella di Giovanni", "34.80", "24 - 200 g pkgs.", "Dairy Products"}, 
					{"Röd Kaviar", "15.00", "24 - 150 g jars", "Seafood"}, 
					{"Longlife Tofu", "10.00", "5 kg pkg.", "Produce"}, 
					{"Rhönbräu Klosterbier", "7.75", "24 - 0.5 l bottles", "Beverages"}, 
					{"Lakkalikööri", "18.00", "500 ml", "Beverages"}, 
					{"Original Frankfurter grüne Soße", "13.00", "12 boxes", "Condiments"} 
					
			};
			scrollPane = new JScrollPane();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, scrollPane, 16, SpringLayout.SOUTH, lblProducts);
			sl_contentPanel.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, lblEmployee);
			sl_contentPanel.putConstraint(SpringLayout.SOUTH, scrollPane, -15, SpringLayout.SOUTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.EAST, scrollPane, -5, SpringLayout.EAST, contentPanel);
			contentPanel.add(scrollPane);
			table = new JTable(data, columnnames);
			scrollPane.setViewportView(table);
		}
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
