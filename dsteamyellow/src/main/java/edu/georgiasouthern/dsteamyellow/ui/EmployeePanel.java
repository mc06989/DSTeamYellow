package edu.georgiasouthern.dsteamyellow.ui;

import javax.swing.JPanel;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextPane;

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
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -222, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, this);
		add(scrollPane);

		//table = new JTable(data, columnnames);
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblEmployees = new JLabel("Employees");
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, lblEmployees);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployees, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployees, 10, SpringLayout.NORTH, this);
		add(lblEmployees);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 643, SpringLayout.WEST, this);
		add(panel);
		
		JLabel lblEmployeeinfo = new JLabel("Employee Info");
		springLayout.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH, lblEmployeeinfo);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel lblId = new JLabel("ID:");
		panel.add(lblId, "2, 2");
		
		JLabel label = new JLabel("0");
		panel.add(label, "4, 2");
		
		JLabel lblBirthDate = new JLabel("Birth Date:");
		panel.add(lblBirthDate, "8, 2");
		
		JLabel lblLongdategoeshere = new JLabel("LONGDATEGOESHERE");
		panel.add(lblLongdategoeshere, "10, 2");
		
		JLabel lblNotes = new JLabel("Notes");
		panel.add(lblNotes, "12, 2");
		
		JLabel lblFirstName = new JLabel("First Name:");
		panel.add(lblFirstName, "2, 4");
		
		JLabel lblEmployee = new JLabel("Employee");
		panel.add(lblEmployee, "4, 4");
		
		JLabel lblHireDate = new JLabel("Hire Date:");
		panel.add(lblHireDate, "8, 4");
		
		JLabel lblLongdategoeshere_1 = new JLabel("LONGDATEGOESHERE");
		panel.add(lblLongdategoeshere_1, "10, 4");
		
		JLabel lblLastName = new JLabel("Last Name:");
		panel.add(lblLastName, "2, 6");
		
		JLabel lblName = new JLabel("Name");
		panel.add(lblName, "4, 6");
		
		JLabel lblAddress = new JLabel("Address:");
		panel.add(lblAddress, "8, 6");
		
		JLabel lblTitle = new JLabel("Title:");
		panel.add(lblTitle, "2, 8");
		
		JLabel lblNone = new JLabel("None");
		panel.add(lblNone, "4, 8");
		
		JLabel lblCity = new JLabel("City:");
		panel.add(lblCity, "8, 8");
		
		JLabel lblToc = new JLabel("ToC:");
		panel.add(lblToc, "2, 10");
		
		JLabel lblRegion = new JLabel("Region:");
		panel.add(lblRegion, "8, 10");
		
		JLabel lblHomePhone = new JLabel("Home Phone:");
		panel.add(lblHomePhone, "2, 12");
		
		JLabel lblPostalCode = new JLabel("Postal Code:");
		panel.add(lblPostalCode, "8, 12");
		
		JLabel lblExtension = new JLabel("Extension:");
		panel.add(lblExtension, "2, 14");
		
		JLabel lblCountry = new JLabel("Country:");
		panel.add(lblCountry, "8, 14");
		
		JTextPane textPane = new JTextPane();
		panel.add(textPane, "12, 4, 1, 11, fill, fill");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployeeinfo, 6, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployeeinfo, 0, SpringLayout.WEST, scrollPane);
		add(lblEmployeeinfo);
		
	}
}
