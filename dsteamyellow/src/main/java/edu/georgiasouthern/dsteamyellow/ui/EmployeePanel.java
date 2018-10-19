package edu.georgiasouthern.dsteamyellow.ui;

import javax.swing.JPanel;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EmployeePanel extends JPanel {
	private JTable table;


	public EmployeePanel() {
		
		Object[][] data = DBConnection.getInstance().getEmployeeViewList();
		String[] columnnames = {"ID",
								"Employee Name",
								"Title",
								"Full Address",
								"Home Phone",
								"Reports To"};
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, this);
		add(scrollPane);

		table = new JTable(data, columnnames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		//table = new JTable();
		scrollPane.setViewportView(table);
		
	}
}
