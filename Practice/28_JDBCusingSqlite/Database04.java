import java.lang.*;   // (run through cmd)
 
import java.sql.*;
import java.util.*;


public class Database04
{
	public static void main(String args[]) throws Exception
	{
	Class.forName("org.sqlite.JDBC");

	Connection con=DriverManager.getConnection("jdbc:sqlite:D://GitHub//Java//Practice//28_JDBCusingSqlite//univ.db");

	Statement stm=con.createStatement();

    // for manupulation of the data
	// stm.executeUpdate("insert into dept values(70, 'Chem')");
	// stm.executeUpdate("delete from dept where deptno>50");
	// stm.executeUpdate("update dept set dname='Mech' where deptno=50");

    // for creating a table
	// stm.executeUpdate("create table Temp(a integer, b float)");

    // deleteing a table
    stm.executeUpdate("drop table Temp");
	

    stm.close();
    con.close();
    }
}



// Four step important 

//01  Class.forName("org.sqlite.JDBC");

//02  Connection con=DriverManager.getConnection("jdbc:sqlite:D://GitHub//Java//Practice//28_JDBCusingSqlite//univ.db");

//03  Statement stm=con.prepareStatement();

//04  ResultSet rs=stm.executeQuery("select * from dept");