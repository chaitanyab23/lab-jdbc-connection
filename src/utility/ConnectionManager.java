package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}

	public static Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		Properties p=loadPropertiesFile();
		Connection con=null;
		con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
		
		return con;
	}

}
