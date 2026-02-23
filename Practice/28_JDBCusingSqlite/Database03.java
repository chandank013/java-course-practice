import java.lang.*;   // (run through cmd)
 
import java.sql.*;
import java.util.*;


public class Database03
{
	public static void main(String args[]) throws Exception
	{
	Class.forName("org.sqlite.JDBC");

	Connection con=DriverManager.getConnection("jdbc:sqlite:D://GitHub//Java//Practice//28_JDBCusingSqlite//univ.db");

	PreparedStatement stm=con.prepareStatement("select * from Students where deptno=?");

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the department number :");
    int dno = sc.nextInt();

    stm.setInt(1, dno);

	ResultSet rs=stm.executeQuery();
	

	while(rs.next())
	{
	System.out.print(rs.getInt("rollno")+" ");
	System.out.print(rs.getString("name")+" ");
	System.out.print(rs.getString("city")+" ");
	System.out.println(rs.getInt(4)+" ");

	}
    stm.close();
    con.close();
    }
}



// Four step important 

//01  Class.forName("org.sqlite.JDBC");

//02  Connection con=DriverManager.getConnection("jdbc:sqlite:D://GitHub//Java//Practice//28_JDBCusingSqlite//univ.db");

//03  Statement stm=con.prepareStatement();

//04  ResultSet rs=stm.executeQuery("select * from dept");