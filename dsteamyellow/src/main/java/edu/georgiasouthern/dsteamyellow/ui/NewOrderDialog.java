package edu.georgiasouthern.dsteamyellow.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Customer;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Employee;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Order;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Region;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Shipper;

import org.jdesktop.swingx.JXDatePicker;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import org.jdesktop.swingx.JXComboBox;
import javax.swing.JTextField;

public class NewOrderDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NewOrderDialog dialog = new NewOrderDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewOrderDialog() {
		final Order o = new Order();
		o.setShipName("TEST");
		setTitle("New Order");
		setBounds(100, 100, 575, 427);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		{
			JLabel lblOrderdate = new JLabel("OrderDate");
			contentPanel.add(lblOrderdate, "2, 2, right, default");
			
			final JXDatePicker datePicker = new JXDatePicker();
			contentPanel.add(datePicker, "4, 2");
		
		
			JLabel lblRequiredDate = new JLabel("Required Date");
			contentPanel.add(lblRequiredDate, "2, 4, right, default");
			
			final JXDatePicker datePicker_1 = new JXDatePicker();
			contentPanel.add(datePicker_1, "4, 4");
		
		
			JLabel lblShippedDate = new JLabel("Shipped Date");
			contentPanel.add(lblShippedDate, "2, 6, right, default");
			
			final JXDatePicker datePicker_2 = new JXDatePicker();
			contentPanel.add(datePicker_2, "4, 6");
		
		
			JLabel lblFreight = new JLabel("Freight");
			contentPanel.add(lblFreight, "2, 8, right, default");
		
		
			textField_3 = new JTextField();
			contentPanel.add(textField_3, "4, 8, fill, default");
			textField_3.setColumns(10);
		
		
			JLabel lblShipname = new JLabel("ShipName");
			contentPanel.add(lblShipname, "2, 10, right, default");
		
		
			textField_4 = new JTextField();
			contentPanel.add(textField_4, "4, 10, fill, default");
			textField_4.setColumns(10);
		
		
			JLabel lblShpaddress = new JLabel("ShpAddress");
			contentPanel.add(lblShpaddress, "2, 12, right, default");
		
		
			textField_5 = new JTextField();
			contentPanel.add(textField_5, "4, 12, fill, default");
			textField_5.setColumns(10);
		
		
			JLabel lblShipCity = new JLabel("Ship City");
			contentPanel.add(lblShipCity, "2, 14, right, default");
		
		
			textField_6 = new JTextField();
			contentPanel.add(textField_6, "4, 14, fill, default");
			textField_6.setColumns(10);
		
		
			JLabel lblShpregion = new JLabel("ShpRegion");
			contentPanel.add(lblShpregion, "2, 16, right, center");
		
		
			JXComboBox regionComboBox = new JXComboBox();
			contentPanel.add(regionComboBox, "4, 16, fill, default");
			List<Region> rarr = DBConnection.getInstance().getRegions();
			for (Region r : rarr)
				regionComboBox.addItem(r);
		
			JLabel lblPostalCode = new JLabel("Postal Code");
			contentPanel.add(lblPostalCode, "2, 18, right, default");
		
		
			textField_7 = new JTextField();
			contentPanel.add(textField_7, "4, 18, fill, default");
			textField_7.setColumns(10);
		
		
			JLabel lblCountry = new JLabel("Country");
			contentPanel.add(lblCountry, "2, 20, right, default");
		
		
			JLabel lblCustomer = new JLabel("Customer");
			contentPanel.add(lblCustomer, "2, 22, right, default");
		
		
			final JXComboBox customerComboBox = new JXComboBox();
			contentPanel.add(customerComboBox, "4, 22, fill, default");
			List<Customer> carr = DBConnection.getInstance().getCustomers();
			for (Customer c : carr)
				customerComboBox.addItem(c);
		
			JLabel lblShipper = new JLabel("Shipper");
			contentPanel.add(lblShipper, "2, 24, right, default");
		
			final JXComboBox shipperComboBox = new JXComboBox();
			contentPanel.add(shipperComboBox, "4, 24, fill, default");
			List<Shipper> sarr = DBConnection.getInstance().getShippers();
			for (Shipper s : sarr)
				shipperComboBox.addItem(s);
			
			
			JLabel lblEmployee = new JLabel("Employee");
			contentPanel.add(lblEmployee, "2, 26, right, default");
		
			final JXComboBox employeeComboBox = new JXComboBox();
			contentPanel.add(employeeComboBox, "4, 26, fill, default");
			//Vector<Employee> employees = new Vector<Employee>(); 
			List<Employee> earr = DBConnection.getInstance().getEmployees();
			for (Employee e : earr)
				employeeComboBox.addItem(e);
		
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						o.setCustomerID((Customer)customerComboBox.getSelectedItem());
						o.setOrderDate(datePicker.getDate());
						o.setRequiredDate(datePicker_1.getDate());
						o.setShippedDate(datePicker_2.getDate());
						o.setFreight(Float.parseFloat(textField_3.getText().toString()));
						o.setShipName(textField_4.getText());
						System.out.println(o.getShipName());
						o.setEmployeeID((Employee)employeeComboBox.getSelectedItem());
						o.setShipperID((Shipper)shipperComboBox.getSelectedItem());
						o.setShipCity(textField_6.getText().toString());
						System.out.println(o.getCustomerID());
						DBConnection.getInstance().updateOrCreateOrder(o);
						System.out.println(o.getOrderID());
						dispose();
					}
				});
			
			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dispose();
				}
			});
			
			
			
			
		}
	}

}
