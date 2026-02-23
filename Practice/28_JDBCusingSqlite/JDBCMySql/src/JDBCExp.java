import java.sql.*; 
 
public class JDBCExp { 
    public static void main(String[] args) { 
        String url = "jdbc:mysql://localhost:3306/classroom"; 
        String username = "root"; 
        String password = "password"; 
 
        Connection connection = null; 
        Statement statement = null; 
        ResultSet resultSet = null; 
        try { 
            System.out.println("Database Connectivity using JDBC\n"); 
 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            System.out.println("Driver registered successfully."); 
 
            connection = DriverManager.getConnection(url, username, password); 
            System.out.println("Database connection established successfully.\n"); 
 
            statement = connection.createStatement(); 
            String query = "SELECT * FROM students"; 
            System.out.println("Executing query: " + query + ";\n"); 
 
            resultSet = statement.executeQuery(query); 
 
            System.out.printf("%-5s %-20s %-5s %-15s\n", "ID", "Name", "Age", "Department"); 
            System.out.println("------------------------------------------------"); 
 
            while (resultSet.next()) { 
                int id = resultSet.getInt("id"); 
                String name = resultSet.getString("name"); 
                int age = resultSet.getInt("age"); 
                String dept = resultSet.getString("department"); 
                System.out.printf("%-5d %-20s %-5d %-15s\n", id, name, age, dept); 
            } 
 
            System.out.println("\nQuery executed successfully."); 
 
        } catch (ClassNotFoundException e) { 
            System.out.println("JDBC Driver not found."); 
            e.printStackTrace(); 
        } catch (SQLException e) { 
            System.out.println("Database error occurred."); 
            e.printStackTrace(); 
        } finally { 
            try { 
                if (resultSet != null) { 
                    resultSet.close(); 
                    System.out.println("ResultSet closed."); 
                } 
                if (statement != null) { 
                    statement.close(); 
                    System.out.println("Statement closed."); 
                } 
                if (connection != null) { 
                    connection.close(); 
                    System.out.println("Connection closed."); 
                } 
            } catch (SQLException e) { 
                e.printStackTrace(); 
            } 
        } 
 
        System.out.println("\nDatabase connectivity demonstration completed successfully."); 
    } 
} 
 


// javac -cp ../mysql-connector-j-9.4.0.jar JDBCExp.java
// java -cp .;../mysql-connector-j-9.4.0.jar JDBCExp
