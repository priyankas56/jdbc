package microsoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

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

       String updateQuery1="update product_table set product_name='smartwatch' where id=1";
       String updateQuery2="update product_table set product_name='gaming console' where id=2";
       String updateQuery3="update product_table set product_name='dslr camara' where id=3";
       String updateQuery4="update product_table set product_name='bluetooth' where id=4";
       String updateQuery5="update product_table set product_name='mouse' where id=5";
       String updateQuery6="update product_table set product_name='smartphone' where id=6";
       String updateQuery7="update product_table set product_name='tablet' where id=7";
       String updateQuery8="update product_table set product_name='laptop pro 15' where id=8";
       String updateQuery9="update product_table set product_name='desktop tracker' where id=9";
       String updateQuery10="update product_table set product_name='tv ultra' where id=10";
       
       String deleteQuery1="delete from product_table where product_brand='dell'";
       String deleteQuery2="delete from product_table where product_brand='nim'";
       String deleteQuery3="delete from product_table where product_brand='nivi'";
       String deleteQuery4="delete from product_table where product_brand='cocunut'";
       String deleteQuery5="delete from product_table where product_brand='pink'";
       String deleteQuery6="delete from product_table where product_brand='colgate'";
       String deleteQuery7="delete from product_table where id=17";
       String deleteQuery8="delete from product_table where id=18";
       String deleteQuery9="delete from product_table where id=19";
       String deleteQuery10="delete from product_table where id=20";
	try {
		Connection connection=DriverManager.getConnection(url, userName, password);
		Statement statement=connection.createStatement();
		int value=statement.executeUpdate(deleteQuery10);
		if(value>0)
		{
			System.out.println("this is saved");
		}else {
			System.out.println("this is not saved");
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	}
}
