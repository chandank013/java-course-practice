import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/classroom"; 
        String username = "root";      
        String password = "password";   

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Register JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver registered successfully.");

            // Step 2: Create Database Connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established successfully.\n");

            // Step 3: Create Statement
            statement = connection.createStatement();

            // CREATE (INSERT) 
            System.out.println("Performing INSERT operation...");
            String insertQuery = "INSERT INTO students VALUES (4, 'Riya Sharma', 23, 'IT')";
            statement.executeUpdate(insertQuery);
            displayTable(statement);

            // UPDATE 
            System.out.println("\nPerforming UPDATE operation...");
            String updateQuery = "UPDATE students SET age = 24 WHERE id = 4";
            statement.executeUpdate(updateQuery);
            displayTable(statement);

            //  DELETE 
            System.out.println("\nPerforming DELETE operation...");
            String deleteQuery = "DELETE FROM students WHERE id = 4";
            statement.executeUpdate(deleteQuery);
            displayTable(statement);

            System.out.println("\nCRUD operations executed successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        } finally {
            // Step 5: Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
                System.out.println("\nAll database resources closed successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Helper method to display table content
    private static void displayTable(Statement statement) throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT * FROM students");
        System.out.println("Current table data:");
        System.out.printf("%-5s %-20s %-5s %-15s\n", "ID", "Name", "Age", "Department");
        System.out.println("-----------------------------------------------------");
        while (rs.next()) {
            System.out.printf("%-5d %-20s %-5d %-15s\n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("department"));
        }
        rs.close();
    }
}



// javac -cp ../mysql-connector-j-9.4.0.jar JDBCExample.java
// java -cp .;../mysql-connector-j-9.4.0.jar JDBCExample