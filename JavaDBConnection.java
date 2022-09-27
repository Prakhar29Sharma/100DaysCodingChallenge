/* importing java.sql package */
import java.sql.*;
import java.util.Scanner;

/* 
 * Database Name : jdbc 
 * Table Name : people 
 * Attribute 1 : id (PK)
 * Attribute 2 : name 
*/

public class MyJDBC {

    /* Establishing Connection */
    static String url = "jdbc:mysql://localhost:3306/jdbc";
    static String user = "sqluser"; // username 
    static String password = "123"; // password
    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /* Method for validating id since it must be unique (To avoid error when inserting)*/
    static int validate(int id) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from people");
        while(resultSet.next()) {
            int ID = resultSet.getInt("id");
            if(ID==id){
                return 0;
            }
        }
        return 1;
    }

    /* Method for inserting data into database */
    static void insertData() throws SQLException {
        int id;
        int validity = 0;
        String name;
        String query;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter person id : ");
        id = in.nextInt();
        try {
            validity = validate(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(validity == 0)
        {
            System.out.println("ID already exist!");
            return;
        }
        System.out.println("Enter person name : ");
        name = in.next();
        query = "INSERT INTO people VALUES ("+id+", '"+name+"')";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int status = preparedStatement.executeUpdate();
        if (status!=0){
            System.out.println("Inserted data!");
        }
    }
    public static void main(String args[]) throws SQLException {

        int choice;
        Scanner in = new Scanner(System.in);

        /* Inserting data into Database */
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO people VALUES (23, 'user_name');");
        int status = preparedStatement.executeUpdate();
        if (status!=0){
            System.out.println("Inserted data!");
        }

        /* Reading data from Database */
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from people");
        while(resultSet.next()) {
            String data = resultSet.getString("name");
            System.out.println(data);
        }

        System.out.println("Do you want to insert 1 more record ? (Enter 1 to do so ) : ");
        choice = in.nextInt();
        if(choice == 1){
            insertData();
        } else {
            System.out.println("Thank You!");
        }

    }
}

