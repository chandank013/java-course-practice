import java.lang.*;   // (run through cmd)
 
import java.sql.*;
import java.util.*;


public class Database05
{
	public static void main(String args[]) throws Exception
	{
	Class.forName("org.sqlite.JDBC");

	Connection con=DriverManager.getConnection("jdbc:sqlite:D://GitHub//Java//Practice//28_JDBCusingSqlite//univ.db");

	PreparedStatement stm=con.prepareStatement("insert into Students values(?, ?, ?, ?)");

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Student datre :");
    int r = sc.nextInt();
    String name = sc.next();
    String city = sc.next();
    int dno = sc.nextInt();

    stm.setInt(1, r);
    stm.setString(2, name);
    stm.setString(3, city);
    stm.setInt(4, dno);

	stm.executeUpdate();
	
    stm.close();
    con.close();
    }
}


