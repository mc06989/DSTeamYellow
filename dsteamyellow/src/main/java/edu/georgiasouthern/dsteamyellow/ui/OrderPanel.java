package edu.georgiasouthern.dsteamyellow.ui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.db.NorthwindTableDefinitions.OrderView;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

public class OrderPanel extends JPanel {
	private JTable table;

	public OrderPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new JPanel();
		
		
		JLabel activeOrdersLabel = new JLabel("Active Orders");
		springLayout.putConstraint(SpringLayout.NORTH, activeOrdersLabel,10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, activeOrdersLabel,10, SpringLayout.WEST, this);
		add(activeOrdersLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.SOUTH, activeOrdersLabel);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		add(scrollPane);
		
		
		
		
		Object[][] OrderViewData = DBConnection.getInstance().getOrderViewList();

		String[] columnnames= {"OrderID", "Contact Name", "Shipping Company", "Required Date"};
		
		

		//table = new JTable();
		
		table = new JTable(OrderViewData,columnnames) {
			  @Override
		      public boolean isCellEditable(int row, int column){  
		          return false;  
		      }
		};
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent mouseEvent) {
				JTable mytable = (JTable)mouseEvent.getSource();
				Point point = mouseEvent.getPoint();
				int row = table.rowAtPoint(point);
				if (mouseEvent.getClickCount()==2&&mytable.getSelectedRow()!=-1) {
					OrderDetailFrame odf = new OrderDetailFrame((Integer) mytable.getValueAt(mytable.getSelectedRow(),  0));
					odf.setVisible(true);
				}
			}
		});
		scrollPane.setViewportView(table);
		
		
		
		
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, this);
		add(panel);
		
		JButton btnNewOrder = new JButton("New Order");
		panel.add(btnNewOrder);
		btnNewOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OrderDetailFrame odf = new OrderDetailFrame(10423);
				odf.setVisible(true);
			}
			
		});

	}
}
