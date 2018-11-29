package edu.georgiasouthern.dsteamyellow.ui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import edu.georgiasouthern.dsteamyellow.db.TableDefinitions.OrderView;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import org.jdesktop.swingx.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteComboBoxEditor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ComboBoxEditor;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

public class OrderPanel extends JInternalFrame {
	private JTable table;
	
	public OrderPanel() {
		
		super("Orders", true,true,true,true);
		
		
		SpringLayout springLayout = new SpringLayout();
		
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 402, SpringLayout.EAST, this);
		
		
		
		JLabel activeOrdersLabel = new JLabel("Active Orders");
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, activeOrdersLabel);
		springLayout.putConstraint(SpringLayout.NORTH, activeOrdersLabel,10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, activeOrdersLabel,10, SpringLayout.WEST, this);
		getContentPane().add(activeOrdersLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.SOUTH, activeOrdersLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -24, SpringLayout.NORTH, activeOrdersLabel);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		getContentPane().add(scrollPane);
		


		
		Object[][] OrderViewData = DBConnection.getInstance().getOrderViewList();

		String[] columnnames= {"OrderID", "Contact Name", "Shipping Company", "Required Date"};
		
		

		//table = new JTable();
		
		table = 
				new JTable(OrderViewData,columnnames) {
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
					OrderDetailPanel odf = new OrderDetailPanel((Integer) mytable.getValueAt(mytable.getSelectedRow(),  0));
					DesktopApp.getDesktop().orderDetail(odf);
				}
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewOrder = new JButton("New Order");
		panel.add(btnNewOrder);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.NORTH, panel);
		getContentPane().add(panel);
		
		
		btnNewOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				NewOrderDialog nod = new NewOrderDialog();
				nod.setVisible(true);
			}
			
		});
		
		setVisible(true);
	}
	
	public interface OnOrderListener{
		public void orderDetail(OrderDetailPanel nod);
	}
}
