package edu.georgiasouthern.dsteamyellow.ui;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import edu.georgiasouthern.dsteamyellow.Launcher;

import javax.swing.LookAndFeel;
import java.awt.BorderLayout;

public class App {

	public JFrame frame;

	public static void main(String[] args) {
		
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public App() {
		initialize();
	}

	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		OrderPanel orderPanel = new OrderPanel();
		tabbedPane.addTab("Orders", null, orderPanel, null);
		EmployeePanel employeePanel = new EmployeePanel();
		tabbedPane.addTab("Employees", null, employeePanel, null);
		
		frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                Launcher.OnClose();
            }
        });
	}
}
