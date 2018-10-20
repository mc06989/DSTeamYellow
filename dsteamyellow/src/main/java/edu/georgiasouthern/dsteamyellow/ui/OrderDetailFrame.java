package edu.georgiasouthern.dsteamyellow.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.OrderDetailsView;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class OrderDetailFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderDetailFrame frame = new OrderDetailFrame(0);
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
	public OrderDetailFrame(int oid) {
		
		OrderDetailsView odv = DBConnection.getInstance().getOrderDetails(oid);
		setTitle("Order "+oid);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 678, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		Object[][] data = DBConnection.getInstance().getOrderViewList();
		String[] columnnames = {"EmployeeID","EmployeeID","EmployeeID","EmployeeID","EmployeeID","EmployeeID","EmployeeID"};
		JScrollPane scrollPane = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, contentPane);
		contentPane.add(scrollPane);
		table = new JTable(data, columnnames);
		
		//table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel_3 = new JLabel("Customer:");
		panel_1.add(lblNewLabel_3, "2, 2");
		
		JLabel lblCustomername = new JLabel("CustomerName");
		lblCustomername = new JLabel(odv.ContactName);
		panel_1.add(lblCustomername, "4, 2");
		JLabel lblNewLabel_4 = new JLabel("192.10");
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		panel_1.add(lblTotalPrice, "2, 6");
		lblNewLabel_4 = new JLabel("priceData");
		panel_1.add(lblNewLabel_4, "4, 6");
		
		JLabel lblAdress = new JLabel("Adress:");
		panel_1.add(lblAdress, "2, 8");
		
		JLabel lblAddressdata = new JLabel("AddressData");
		panel_1.add(lblAddressdata, "2, 10, 3, 1");
		
		JLabel lblPostal = new JLabel("Postal:");
		panel_1.add(lblPostal, "2, 12");
		
		JLabel lblPostaldata = new JLabel("PostalData");
		panel_1.add(lblPostaldata, "4, 12");
		
		JLabel lblCity = new JLabel("City");
		panel_1.add(lblCity, "2, 14");
		
		JLabel lblCitydata = new JLabel("CityData");
		panel_1.add(lblCitydata, "4, 14");
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, -6, SpringLayout.NORTH, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 302, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 195, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -15, SpringLayout.WEST, panel);
		contentPane.add(panel);
		
		JButton btnAddProduct = new JButton("Add Product");
		panel.add(btnAddProduct);
		
		JButton btnUpdateOrderInfo = new JButton("Update Order Info");
		panel.add(btnUpdateOrderInfo);
		
		JLabel lblProducts = new JLabel("Products");
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 11, SpringLayout.SOUTH, lblProducts);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblProducts, 20, SpringLayout.EAST, panel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblProducts, 0, SpringLayout.NORTH, panel_1);
		contentPane.add(lblProducts);
	}
}
