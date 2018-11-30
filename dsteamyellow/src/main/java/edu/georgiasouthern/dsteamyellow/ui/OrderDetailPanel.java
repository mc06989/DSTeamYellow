package edu.georgiasouthern.dsteamyellow.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Employee;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Order;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.OrderDetail;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.OrderDetailsView;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Product;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

import org.jdesktop.swingx.autocomplete.AutoCompleteComboBoxEditor;
import javax.swing.ComboBoxEditor;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import org.jdesktop.swingx.JXComboBox;

public class OrderDetailPanel extends JInternalFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderDetailPanel frame = new OrderDetailPanel(0);
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
	public OrderDetailPanel(final int oid) {
		super("Order Details", true, true,true,true);
		//OrderDetailsView odv = DBConnection.getInstance().getOrderDetailsView(oid);
		System.out.println(oid);
		final Order odv = DBConnection.getInstance().getOrder(oid);
		setBounds(100, 100, 678, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		SpringLayout sl_contentPane = new SpringLayout();
		setContentPane(contentPane);
		contentPane.setLayout(sl_contentPane);
		List<Product> products = DBConnection.getInstance().getProductsOnOrder(oid);
		List<OrderDetail> orderDetails = DBConnection.getInstance().getOrderDetails(oid);
		int sum = 0;
		for (OrderDetail o: orderDetails) {
			sum+= o.getQuantity() * (o.getUnitPrice()-o.getDiscount());
		}
		
		//Order order = DBConnection.getInstance().getOrder(oid);
		System.out.println(odv.getOrderID());
		Employee employee = odv.getEmployeeID();
		
		
		
		
		Object[][] data = DBConnection.getInstance().getProductsOnOrderTable(oid);
		String[] columnnames = {"ProductID",
				"ProductName",
				"SupplierID",
				"CategoryID",
				"QuantityPerUnit",
				"UnitPrice",
				"UnitsInStock",
				"UnitsOnOrder",
				"ReorderLevel",
				};
		JScrollPane scrollPane = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, contentPane);
		contentPane.add(scrollPane);
		table = new JTable(data, columnnames);
		//table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.EAST, panel_1);
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
		lblCustomername = new JLabel(odv.getShipName());
		panel_1.add(lblCustomername, "4, 2");
		JLabel lblNewLabel_4 = new JLabel("192.10");
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		panel_1.add(lblTotalPrice, "2, 6");
		lblNewLabel_4 = new JLabel(Integer.toString(sum));
		panel_1.add(lblNewLabel_4, "4, 6, left, default");
		
		JLabel lblAdress = new JLabel("Adress:");
		panel_1.add(lblAdress, "2, 8");
		
		JLabel lblAddressdata = new JLabel(odv.getShipAddress());
		lblAddressdata.setText(odv.getShipAddress());
		panel_1.add(lblAddressdata, "2, 10, 3, 1");
		
		JLabel lblPostal = new JLabel("Postal:");
		panel_1.add(lblPostal, "2, 12");
		
		JLabel lblPostaldata = new JLabel(odv.getShipPostalCode());
		lblPostaldata.setText(odv.getShipPostalCode());
		panel_1.add(lblPostaldata, "4, 12");
		
		JLabel lblCity = new JLabel();
		panel_1.add(lblCity, "2, 14");
		
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, -50, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.SOUTH, scrollPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 195, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -15, SpringLayout.WEST, panel);
		contentPane.add(panel);
		
		final JXComboBox productComboBox = new JXComboBox();
		panel.add(productComboBox);
		List<Product> allProducts = DBConnection.getInstance().getProducts();
		for(Product p: allProducts)
			productComboBox.addItem(p);
		
		
		JButton btnAddProduct = new JButton("Add Product");
		panel.add(btnAddProduct);
		
		JButton btnUpdateOrderInfo = new JButton("Update Order Info");
		panel.add(btnUpdateOrderInfo);
		
		JLabel lblProducts = new JLabel("Products");
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 11, SpringLayout.SOUTH, lblProducts);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblProducts, 20, SpringLayout.EAST, panel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblProducts, 0, SpringLayout.NORTH, panel_1);
		contentPane.add(lblProducts);
		
		
		btnUpdateOrderInfo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DesktopApp.getDesktop().OrderPanelRefresh(oid);
				dispose();
			}
		});
		
		btnAddProduct.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				OrderDetail od = new OrderDetail();
				Product p = ((Product)productComboBox.getSelectedItem());
				od.setOrderID(odv.getOrderID());
				od.setDiscount(0);
				od.setProductID(p.getProductID());
				od.setQuantity((short) 1);
				od.setUnitPrice(p.getUnitPrice());
				DBConnection.getInstance().updateOrCreateOrder(od);
				
			}
		});
	}
	
	public interface OnOrderPanelRefreshListener {
		public void OrderPanelRefresh(int oid);

		void orderDetail(OrderDetailPanel nof);

		void orderRefresh();
	}
}
