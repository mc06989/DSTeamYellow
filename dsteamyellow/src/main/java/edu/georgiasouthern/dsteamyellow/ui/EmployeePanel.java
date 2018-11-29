package edu.georgiasouthern.dsteamyellow.ui;

import javax.swing.JPanel;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class EmployeePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3368552272681143210L;
	private JTable table;
	EmployeeDetailPanel employeeDetailPanel;
	
	
	public EmployeePanel() {
		
		//Object[][] data = DBConnection.getInstance().getEmployeeViewList();
		String[] columnnames = {"ID",
								"Employee Name",
								"Title",
								"Full Address",
								"Home Phone",
								"Reports To"};
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -222, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, this);
		add(scrollPane);

		/*table = new JTable(data, columnnames){

			private static final long serialVersionUID = -28468731866341660L;

			@Override
		      public boolean isCellEditable(int row, int column){  
		          return false;  
		      }
		};*/
		table = new JTable();
		scrollPane.setViewportView(table);

		/*table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent mouseEvent) {
				JTable mytable = (JTable)mouseEvent.getSource();
				Point point = mouseEvent.getPoint();
				int row = mytable.rowAtPoint(point);
				
				if (mouseEvent.getClickCount()==2&&mytable.getSelectedRow()!=-1) {
					employeeDetailPanel.setEmployee((int) mytable.getValueAt(row, 0));
				}
			}
		});*/
		
		JLabel lblEmployees = new JLabel("Employees");
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, lblEmployees);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployees, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployees, 10, SpringLayout.NORTH, this);
		add(lblEmployees);
		
		JLabel lblEmployeeinfo = new JLabel("Employee Info");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployeeinfo, 6, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployeeinfo, 0, SpringLayout.WEST, scrollPane);
		add(lblEmployeeinfo);
		
		employeeDetailPanel = new EmployeeDetailPanel();
		springLayout.putConstraint(SpringLayout.NORTH, employeeDetailPanel, 6, SpringLayout.SOUTH, lblEmployeeinfo);
		springLayout.putConstraint(SpringLayout.WEST, employeeDetailPanel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, employeeDetailPanel, 192, SpringLayout.SOUTH, lblEmployeeinfo);
		springLayout.putConstraint(SpringLayout.EAST, employeeDetailPanel, 0, SpringLayout.EAST, scrollPane);
		add(employeeDetailPanel);
		
	}
}
