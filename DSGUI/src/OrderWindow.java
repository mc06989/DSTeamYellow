import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
public class OrderWindow extends JFrame {
	
	private SpringLayout layout;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			OrderWindow mw = new OrderWindow();
			mw.setVisible(true);
			mw.setDefaultCloseOperation(EXIT_ON_CLOSE);
		});
	}
	
	public OrderWindow() {
		initUI();
	}
	
	/*private void springLeftRight(Component c1, Component c2) {
		layout.putConstraint(SpringLayout.EAST, c1, pad, e2, c2);
	}*/
	
	private void initUI() {
		layout = new SpringLayout();
		JPanel pane = new JPanel();
		pane.setLayout(layout);
		setContentPane(pane);
		//Customer ID
		JLabel customerIDLabel = new JLabel("Customer ID");
		JTextField customerIDField = new JTextField();
		pane.add(customerIDLabel);
		pane.add(customerIDField);
		layout.putConstraint(SpringLayout.NORTH,customerIDLabel , 5, SpringLayout.NORTH, pane);
		//Order Date
		JLabel orderDateLabel = new JLabel("Order Date");
		JTextField orderDateField = new JTextField();
		pane.add(orderDateLabel);
		pane.add(orderDateField);
		//ShipAmt
		//TaxAmt
		//ShipAddressID
		//CardType
		JLabel cardTypeLabel = new JLabel("Card Type");
		JTextField cardTypeField = new JTextField();
		pane.add(cardTypeLabel);
		pane.add(cardTypeField);
		layout.putConstraint(SpringLayout.SOUTH,cardTypeLabel , 5, SpringLayout.NORTH, customerIDLabel);
		//CardNumber
		//CardExpires
		//BillingAddressID
		setTitle("Create New Order");
		setSize(480,480);
		setLocationRelativeTo(null);
	}

}
