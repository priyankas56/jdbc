package microsoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Company {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		String inQuery="insert into product_table values (1,'laptop','dell',50000)"
				+ ",(2,'grinder','prestige',5000),(3,'mobile','real me',23000),"
				+ "(4,'fan','bajaj',2000),(5,'computer','hp',60000),"
				+ "(6,'telivision','onida',45000),(7,'miosurizer','dove',56700),"
				+ "(8,'clock','vision',7000),(9,'apple','fruit',90000),"
				+ "(10,'shapoo','dove',500),(11,'conditioner','chiko',7600),"
				+ "(12,'face wash','nim',500),(13,'bodynotion','nivi',700),"
				+ "(14,'hair oil','cocunut',600),(15,'lip balm','pink',200),"
				+ "(16,'toothpaste','colgate',100),(17,'face mask','brand a',50),"
				+ "(18,'scrub','lotion',450),(19,'toner','prime',500),(20,'eye cream','kajal',600)";
	
				
			 try {
				Connection connection=DriverManager.getConnection(url,userName,password);
				Statement statement=connection.createStatement();
				int value=statement.executeUpdate(password);
				if(value>0)
				{
					System.out.println("this is saved");
				}else {
					System.out.println("this is not saved");
				}
						}
			 catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
