import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MockupMainWindowFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MockupMainWindowFrame frame = new MockupMainWindowFrame();
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
	public MockupMainWindowFrame() {
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setTitle("Team Yellow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel OrdersPanel =  new JPanel();
		tabbedPane.addTab("Orders", null, OrdersPanel, null);
		SpringLayout sl_OrdersPanel = new SpringLayout();
		OrdersPanel.setLayout(sl_OrdersPanel);
		
		JLabel lblActiveOrders = new JLabel("Active Orders");
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, lblActiveOrders, 10, SpringLayout.NORTH, OrdersPanel);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, lblActiveOrders, 10, SpringLayout.WEST, OrdersPanel);
		OrdersPanel.add(lblActiveOrders);
		
		
		DefaultTableModel tModel = new DefaultTableModel();
		String[] columnnames = {"orderID","Shipping Company","Employee","Customer","Freight","Order Date","Required Date"};
		Object[][] data = {
				
		{"11008", "Federal Shipping", "Robert King", "Roland Mendel", "79.46", "Apr  8 1998 12:00AM", "May  6 1998 12:00AM"},
		{"11019", "Federal Shipping", "Michael Suyama", "Sergio Gutiérrez", "3.17", "Apr 13 1998 12:00AM", "May 11 1998 12:00AM"},
		{"11039", "United Package", "Nancy Davolio", "Felipe Izquierdo", "65.00", "Apr 21 1998 12:00AM", "May 19 1998 12:00AM"},
		{"11040", "Federal Shipping", "Margaret Peacock", "Howard Snyder", "18.84", "Apr 22 1998 12:00AM", "May 20 1998 12:00AM"},
		{"11045", "United Package", "Michael Suyama", "Elizabeth Lincoln", "70.58", "Apr 23 1998 12:00AM", "May 21 1998 12:00AM"},
		{"11051", "Federal Shipping", "Robert King", "Annette Roulet", "2.79", "Apr 27 1998 12:00AM", "May 25 1998 12:00AM"},
		{"11054", "Speedy Express", "Laura Callahan", "Patricio Simpson", "0.33", "Apr 28 1998 12:00AM", "May 26 1998 12:00AM"},
		{"11058", "Federal Shipping", "Anne Dodsworth", "Hanna Moos", "31.14", "Apr 29 1998 12:00AM", "May 27 1998 12:00AM"},
		{"11059", "United Package", "Andrew Fuller", "Janete Limeira", "85.80", "Apr 29 1998 12:00AM", "Jun 10 1998 12:00AM"},
		{"11061", "Federal Shipping", "Margaret Peacock", "Howard Snyder", "14.01", "Apr 30 1998 12:00AM", "Jun 11 1998 12:00AM"},
		{"11062", "United Package", "Margaret Peacock", "Maurizio Moroni", "29.93", "Apr 30 1998 12:00AM", "May 28 1998 12:00AM"},
		{"11065", "Speedy Express", "Laura Callahan", "Carlos González", "12.91", "May  1 1998 12:00AM", "May 29 1998 12:00AM"},
		{"11068", "United Package", "Laura Callahan", "Lúcia Carvalho", "81.75", "May  4 1998 12:00AM", "Jun  1 1998 12:00AM"},
		{"11070", "Speedy Express", "Andrew Fuller", "Renate Messner", "136.00", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11071", "Speedy Express", "Nancy Davolio", "Carlos González", "0.93", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11072", "United Package", "Margaret Peacock", "Roland Mendel", "258.64", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11073", "United Package", "Andrew Fuller", "Guillermo Fernández", "24.95", "May  5 1998 12:00AM", "Jun  2 1998 12:00AM"},
		{"11074", "United Package", "Robert King", "Jytte Petersen", "18.44", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"},
		{"11075", "United Package", "Laura Callahan", "Michael Holz", "6.19", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"},
		{"11076", "United Package", "Margaret Peacock", "Laurence Lebihan", "38.28", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"},
		{"11077", "United Package", "Nancy Davolio", "Paula Wilson", "8.53", "May  6 1998 12:00AM", "Jun  3 1998 12:00AM"}
		};
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MockupOrderWindowDialog ow = new MockupOrderWindowDialog();
				ow.setVisible(true);
			}
		});
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, btnNewOrder, 0, SpringLayout.WEST, lblActiveOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, btnNewOrder, -10, SpringLayout.SOUTH, OrdersPanel);
		OrdersPanel.add(btnNewOrder);
		
		JButton btnDeleteSelectedOrders = new JButton("Manage Selected Orders");
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, btnDeleteSelectedOrders, 0, SpringLayout.NORTH, btnNewOrder);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, btnDeleteSelectedOrders, 6, SpringLayout.EAST, btnNewOrder);
		OrdersPanel.add(btnDeleteSelectedOrders);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, lblActiveOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, OrdersPanel);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, scrollPane, -6, SpringLayout.NORTH, btnNewOrder);
		sl_OrdersPanel.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, OrdersPanel);
		OrdersPanel.add(scrollPane);
		table = new JTable(data, columnnames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		
		sl_OrdersPanel.putConstraint(SpringLayout.NORTH, table, 6, SpringLayout.SOUTH, lblActiveOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, table, 282, SpringLayout.WEST, OrdersPanel);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, table, -6, SpringLayout.NORTH, btnDeleteSelectedOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.EAST, table, -10, SpringLayout.EAST, OrdersPanel);
		
		JButton btnFindOrder = new JButton("Find Order...");
		sl_OrdersPanel.putConstraint(SpringLayout.WEST, btnFindOrder, 6, SpringLayout.EAST, btnDeleteSelectedOrders);
		sl_OrdersPanel.putConstraint(SpringLayout.SOUTH, btnFindOrder, 0, SpringLayout.SOUTH, btnNewOrder);
		OrdersPanel.add(btnFindOrder);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		OrdersPanel.add(scrollPane_3);
		
		
		JPanel CustomerPanel = new JPanel();
		tabbedPane.addTab("Customers", null, CustomerPanel, null);
		SpringLayout sl_CustomerPanel = new SpringLayout();
		CustomerPanel.setLayout(sl_CustomerPanel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		sl_CustomerPanel.putConstraint(SpringLayout.NORTH, scrollPane_2, 5, SpringLayout.NORTH, CustomerPanel);
		sl_CustomerPanel.putConstraint(SpringLayout.WEST, scrollPane_2, 301, SpringLayout.WEST, CustomerPanel);
		CustomerPanel.add(scrollPane_2);
		
		table_1 = new JTable();
		sl_CustomerPanel.putConstraint(SpringLayout.NORTH, table_1, 6, SpringLayout.NORTH, CustomerPanel);
		sl_CustomerPanel.putConstraint(SpringLayout.WEST, table_1, 308, SpringLayout.WEST, CustomerPanel);
		CustomerPanel.add(table_1);
		
		JPanel ProductsPanel = new JPanel();
		tabbedPane.addTab("Products", null, ProductsPanel, null);
		SpringLayout sl_ProductsPanel = new SpringLayout();
		ProductsPanel.setLayout(sl_ProductsPanel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		sl_ProductsPanel.putConstraint(SpringLayout.NORTH, scrollPane_1, 5, SpringLayout.NORTH, ProductsPanel);
		sl_ProductsPanel.putConstraint(SpringLayout.WEST, scrollPane_1, 270, SpringLayout.WEST, ProductsPanel);
		ProductsPanel.add(scrollPane_1);
		
		JPanel ShipmentsPanel = new JPanel();
		tabbedPane.addTab("Shipments", null, ShipmentsPanel, null);
		ShipmentsPanel.setLayout(new SpringLayout());
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("1	Chai	1	1	10 boxes x 20 bags	18.00	39	0	10	0");
		
		listModel.addElement("Product 2");
		
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, OrdersPanel, CustomerPanel}));
	}
}
