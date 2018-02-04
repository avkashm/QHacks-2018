package medicalDatabase;

import java.sql.*;

public class dbAccess {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement st = null;
        String sqlQuery = null;
        ResultSet rs = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:ucanaccess://.\\inventory.mdb");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
