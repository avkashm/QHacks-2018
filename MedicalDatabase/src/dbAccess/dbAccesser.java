package dbAccess;
import java.sql.*;
import java.text.SimpleDateFormat;

public class dbAccesser {
	public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement st = null;
        String sqlQuery = null;
        ResultSet rs = null;
        try {
        	conn = DriverManager.getConnection("jdbc:ucanaccess://.\\InventoryDB.mdb");
        	st = conn.createStatement();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        checkOut(conn,"IV Pump","01","101","Nurse");
        
        try {
        	conn.close();
        } catch(SQLException se) {
        	se.printStackTrace();
        }
        
    }
	
	public static void checkOut(Connection conn,String iName, String iID, String uID, String uType) {
		
		PreparedStatement pstmtIN = null;
		PreparedStatement pstmtOUT = null;
		String dbOutName = "In-Stock";
		String dbInName = "In-Use";
		
		String itemName = iName;
		String itemID = iID;
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0, 0, 0));
		String userID = uID;
		String userType = uType;
		
		try {
			Statement stmt = conn.createStatement();
			String queryIN = "INSERT INTO "+dbInName+" (Item Name, Item ID, Time Taken, User ID, User Type) values (?,?,?,?,?)";
			pstmtIN = conn.prepareStatement(queryIN);
			
			pstmtIN.setString(1, iName);
			pstmtIN.setString(2, iID);
			pstmtIN.setString(3, timeStamp);
			pstmtIN.setString(4, uID);
			pstmtIN.setString(5, uType);
			pstmtIN.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
