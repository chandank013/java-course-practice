import java.lang.*;   // (run through cmd)
 
import java.sql.*;


public class Database
{
	public static void main(String args[]) throws Exception
	{
	Class.forName("org.sqlite.JDBC");

	Connection con=DriverManager.getConnection("jdbc:sqlite:D://GitHub//Java//Practice//28_JDBCusingSqlite//univ.db");
	Statement stm=con.createStatement();

	ResultSet rs=stm.executeQuery("select * from dept");
	
	int dno;
	String dname;


	while(rs.next())
	{
	dno=rs.getInt("deptno");
	dname=rs.getString("dname");
	
	System.out.println(dno+ " "+dname);
	}

	}
}