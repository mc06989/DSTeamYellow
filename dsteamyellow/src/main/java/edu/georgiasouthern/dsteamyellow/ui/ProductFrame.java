package edu.georgiasouthern.dsteamyellow.ui;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;

import org.jdesktop.swingx.JXTable;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.Product;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;

public class ProductFrame extends JInternalFrame {
	private JXTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductFrame frame = new ProductFrame();
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
	public ProductFrame() {
		super("Products",true,true,true,true);
		
		
		setBounds(100, 100, 570, 349);
		
		List<Product> products = DBConnection.getInstance().getProducts();
		
		Vector<Vector<Object>> data = new Vector<Vector<Object>>();
		for (Product p :products) {
			Vector<Object> internal = new Vector<Object>();
			internal.add(p.getProductName());
			internal.add(p.getCategoryID().getCategoryName());
			internal.add(p.getQuantityPerUnit());
		}
		
		Vector<String> columnnames = new Vector<String>();
		columnnames.add("ProductName");
		columnnames.add("Category");
		columnnames.add("QuantityPerUnit");
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 260, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 544, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		table = new JXTable(data, columnnames);
		scrollPane.setViewportView(table);

		
		setVisible(true);
	}

}
