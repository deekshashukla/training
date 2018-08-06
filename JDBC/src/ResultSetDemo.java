
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
	public static void main(String[] args) {
		Connection con = null;
		String sql = "Select deptno,dname from dept";

		try {
			con = JdbcUtil.getConnection();
			//ResultSet rs = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery(sql);
			

			ResultSet rs = con.createStatement(
		                                      ResultSet.TYPE_SCROLL_INSENSITIVE,
		                                      ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			for(int c=1;c<=meta.getColumnCount();c++)
				System.out.print(meta.getColumnName(c)+"\t");
			System.out.println();
			
			while (rs.next())
				System.out.printf("%5d\t%-15s\n",rs.getInt(1),rs.getString("dname"));
			
			rs.absolute(3); 
//		       rs.updateString("DNAME", "MARKETING");
//		        
//		       rs.updateRow(); 
		       
		       while (rs.next())
					System.out.printf("%5d\t%-15s\n",rs.getInt(1),rs.getString("dname"));
		       
//		       rs.moveToInsertRow(); 
//		       rs.updateInt(1, 50); 
//		        
//		       rs.updateString(2,"DEVELOPMENT"); 
//		       rs.insertRow();
//		       rs.moveToCurrentRow();
		       
		       
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}
}
