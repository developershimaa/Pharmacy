package com.shimaa.pharma.product.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;

public class ProductManagement {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductManagement window = new ProductManagement();
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
	public ProductManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 748, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 732, 373);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(172, 10, 398, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(21, 15, 89, 23);
		panel.add(btnSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(null, "Product Information", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(0, 54, 732, 164);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(562, 145, -554, -122);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product Code", "Category", "Product Name", "Scientific Name", "Active Material", "Buy Price", "Sale Price", "Quantity", "BarCode", "Description"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(86);
		table.getColumnModel().getColumn(3).setPreferredWidth(94);
		table.getColumnModel().getColumn(4).setPreferredWidth(92);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new TitledBorder(null, "processes on products", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_2.setBounds(0, 221, 732, 152);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnShowAllProducts = new JButton("Show ALL Products");
		btnShowAllProducts.setBackground(SystemColor.activeCaption);
		btnShowAllProducts.setBounds(571, 33, 151, 23);
		panel_2.add(btnShowAllProducts);
		
		JButton btnUpdate = new JButton("Edit Selected Product");
		btnUpdate.setBackground(SystemColor.activeCaption);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUpdate.setBounds(224, 33, 151, 23);
		panel_2.add(btnUpdate);
		
		JButton btnPrintProducts = new JButton("Print All  Products");
		btnPrintProducts.setBackground(SystemColor.activeCaption);
		btnPrintProducts.setBounds(101, 72, 151, 23);
		panel_2.add(btnPrintProducts);
		
		JButton btnDeleteSelectedRow = new JButton("Delete Selected Product");
		btnDeleteSelectedRow.setBackground(SystemColor.activeCaption);
		btnDeleteSelectedRow.setBounds(35, 33, 160, 23);
		panel_2.add(btnDeleteSelectedRow);
		
		JButton btnAddNewProduct = new JButton("Add New Product");
		btnAddNewProduct.setBounds(398, 33, 151, 23);
		panel_2.add(btnAddNewProduct);
		
		JButton btnShowProductImage = new JButton("Show Product Image");
		btnShowProductImage.setBounds(294, 72, 141, 23);
		panel_2.add(btnShowProductImage);
		
		JButton btnSaveProductsIn = new JButton("Save products in Excel File");
		btnSaveProductsIn.setBounds(355, 106, 177, 23);
		panel_2.add(btnSaveProductsIn);
		
		JButton btnPrintselectedProduct = new JButton("Print Selected Product");
		btnPrintselectedProduct.setBounds(476, 72, 141, 23);
		panel_2.add(btnPrintselectedProduct);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(193, 106, 89, 23);
		panel_2.add(btnLogOut);
	}
}
