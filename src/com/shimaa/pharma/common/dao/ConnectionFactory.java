package com.shimaa.pharma.common.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
	 private static String driverClass;
	    private static String url;
	    private static String username;
	    private static String password;

	    static{
	        System.out.println("from static block..........");
	        ResourceBundle bundle = ResourceBundle.getBundle("com.shimaa.pharma.common.dao.jdbc");
	        driverClass = bundle.getString("driverClass");
	        url = bundle.getString("url");
	        username = bundle.getString("username");
	        password = bundle.getString("password");
	    }
	    
	    public static Connection createConnection() throws SQLException, ClassNotFoundException{
	    	 Class.forName(driverClass);
	        return DriverManager.getConnection(url, username, password);
	    }

}
