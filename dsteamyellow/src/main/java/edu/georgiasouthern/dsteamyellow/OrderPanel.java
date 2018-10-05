package edu.georgiasouthern.dsteamyellow;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class OrderPanel extends JPanel {

	public OrderPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, -74, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -188, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 564, SpringLayout.WEST, this);
		add(panel);

	}
}
