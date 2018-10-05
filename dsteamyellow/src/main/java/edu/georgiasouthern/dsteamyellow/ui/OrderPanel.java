package edu.georgiasouthern.dsteamyellow.ui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class OrderPanel extends JPanel {
	private JTable table;

	public OrderPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 47, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 564, SpringLayout.WEST, this);
		add(scrollPane);
		
		Object[][] data= {{'1','2'},{'3','4'}};
		String[] columnnames= {"Test column 1", "Test column 2"};
		
		table = new JTable(data,columnnames);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 365, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -24, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -6, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, this);
		add(panel);
		
		JButton btnNewOrder = new JButton("New Order");
		panel.add(btnNewOrder);

	}
}
