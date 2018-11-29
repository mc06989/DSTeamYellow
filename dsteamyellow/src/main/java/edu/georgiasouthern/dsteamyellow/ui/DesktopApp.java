package edu.georgiasouthern.dsteamyellow.ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import edu.georgiasouthern.dsteamyellow.db.DBConnection;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DesktopApp implements OrderPanel.OnOrderListener{
	
	public static DesktopApp _desktopapp;
	
	public static DesktopApp getDesktop() {
		if(_desktopapp!=null) {
			return _desktopapp;
		}
		else {
			_desktopapp = new DesktopApp();
			return _desktopapp;
		}
	}
	
	public JFrame frame;
	public JDesktopPane desktopPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesktopApp window = new DesktopApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DesktopApp() {
		_desktopapp=this;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		frame =  new JFrame();
		frame.setBounds(100, 100, 956, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		desktopPane.setDragMode(desktopPane.OUTLINE_DRAG_MODE);
		
		OrderPanel orderPanel = new OrderPanel();
		orderPanel.setBounds(157, 175, 600, 600);
		desktopPane.add(orderPanel);
		
		System.err.println(orderPanel.getLocation());
		
		JMenuBar menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu mnOpen = new JMenu("Open...");
		mnOpen.setIcon(null);
		menuBar.add(mnOpen);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Orders");
		mnOpen.add(mntmNewMenuItem);
		desktopPane.setVisible(true);
		
	}

	@Override
	public void orderDetail(OrderDetailPanel nof) {
		nof.setBounds(462, 68, 468, 359);
		nof.setVisible(true);
		desktopPane.add(nof);
		nof.toFront();
	}
}
