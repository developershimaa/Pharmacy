package com.shimaa.pharma.file.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;

public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setEnabled(false);
		frame.setBounds(100, 100, 733, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setEnabled(false);
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnFile);
		
		JMenuItem mntmLogIn = new JMenuItem("Log In");
		mnFile.add(mntmLogIn);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mnFile.add(mntmLogOut);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmBackUp = new JMenuItem("Back Up");
		mntmBackUp.setEnabled(false);
		mnFile.add(mntmBackUp);
		
		JMenuItem mntmRestore = new JMenuItem("Restore");
		mntmRestore.setEnabled(false);
		mnFile.add(mntmRestore);
		
		JMenu mnProducts = new JMenu("Products");
		mnProducts.setEnabled(false);
		mnProducts.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnProducts);
		
		JMenuItem mntmProductManagement = new JMenuItem("Product Management");
		mnProducts.add(mntmProductManagement);
		
		JMenuItem mntmAddNewProduct = new JMenuItem("Add New Product");
		mnProducts.add(mntmAddNewProduct);
		
		JSeparator separator_1 = new JSeparator();
		mnProducts.add(separator_1);
		
		JMenuItem mntmCategoryManagement = new JMenuItem("Category Management");
		mnProducts.add(mntmCategoryManagement);
		
		JMenuItem mntmAddNewCategory = new JMenuItem("Add New Category");
		mnProducts.add(mntmAddNewCategory);
		
		JMenu mnCustomers = new JMenu("Customers");
		mnCustomers.setEnabled(false);
		mnCustomers.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnCustomers);
		
		JMenuItem mntmCustomersManagement = new JMenuItem("Customers Management");
		mnCustomers.add(mntmCustomersManagement);
		
		JMenuItem mntmAddNewCustomer = new JMenuItem("Add New Customer");
		mnCustomers.add(mntmAddNewCustomer);
		
		JSeparator separator_2 = new JSeparator();
		mnCustomers.add(separator_2);
		
		JMenuItem mntmSalesManagement = new JMenuItem("Sales Management");
		mnCustomers.add(mntmSalesManagement);
		
		JMenuItem mntmNewSaleProcess = new JMenuItem("New Sale Process");
		mnCustomers.add(mntmNewSaleProcess);
		
		JMenu mnSuppliers = new JMenu("Suppliers");
		mnSuppliers.setEnabled(false);
		mnSuppliers.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnSuppliers);
		
		JMenuItem mntmSuppliersManagement = new JMenuItem("Suppliers Management");
		mnSuppliers.add(mntmSuppliersManagement);
		
		JMenuItem mntmAddNewSupplier = new JMenuItem("Add new Supplier");
		mnSuppliers.add(mntmAddNewSupplier);
		
		JSeparator separator_3 = new JSeparator();
		mnSuppliers.add(separator_3);
		
		JMenuItem mntmPurchasesManagement = new JMenuItem("Purchases Management");
		mnSuppliers.add(mntmPurchasesManagement);
		
		JMenuItem mntmNewPurchaseProcess = new JMenuItem("New Purchase Process");
		mnSuppliers.add(mntmNewPurchaseProcess);
		
		JMenu mnUsers = new JMenu("Users");
		mnUsers.setEnabled(false);
		mnUsers.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnUsers);
		
		JMenuItem mntmUsersManagement = new JMenuItem("Users Management");
		mnUsers.add(mntmUsersManagement);
		
		JMenuItem mntmAddNewUser = new JMenuItem("Add New User");
		mnUsers.add(mntmAddNewUser);
	}
}
