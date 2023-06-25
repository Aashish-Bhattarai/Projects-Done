package controller.dao;

import java.lang.reflect.InvocationTargetException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	private  static final String dbUrl="jdbc:mysql://localhost:3306/mydb";
	private   static final String dbUsername="root";
	private   static final String dbPassword="";
	private static Connection connection;
	
	public DatabaseConnectivity()
	{
		
	}
	public static  Connection getDatabaseConeection()
	{ 
		
		
				try {
					
					if(connection==null)
					{
						synchronized (DatabaseConnectivity.class) {
							if(connection==null)
							{
							Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
							connection=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
							}
							
						}
					}
					return connection;
					
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException
						| ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		return connection;
	}
	

}
