package Day12;

import java.sql.*;

public class JDBC_Example {
    public static void main(String[] args) {
        try{
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/Student","root","0000");
            Statement stm1=connection.createStatement();
//          Insert the value to the table
            String query="INSERT INTO Student_Details(id,name,mark) VALUES (101,\"adams\",91)";
            int rs=stm1.executeUpdate(query);
            System.out.println("Affected rows : "+rs);

            query="INSERT INTO Student_Details(id,name,mark) VALUES (102,\"shan\",87)";
            rs=stm1.executeUpdate(query);
            System.out.println("Affected rows : "+rs);

            query="INSERT INTO Student_Details(id,name,mark) VALUES (103,\"ram\",88)";
            rs=stm1.executeUpdate(query);
            System.out.println("Affected rows : "+rs);

//            display the student details
            ResultSet resultSet=stm1.executeQuery("SELECT * FROM Student_Details");
            while (resultSet.next()){
                System.out.println("ID : "+resultSet.getInt(1));
                System.out.println("Name : "+resultSet.getString(2));
                System.out.println("Mark : "+resultSet.getInt(3));
                System.out.println();
            }

            stm1.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
