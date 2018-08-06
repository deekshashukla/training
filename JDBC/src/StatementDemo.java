import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class StatementDemo {

	public static void main(String[] args) {
		String sql="insert into product values(124,'marker',25)";
		Connection conn=null;
		try {
		conn=JdbcUtil.getConnection();
		Statement stmt=conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Record Inserted");
	}
	catch(SQLException e) {
		e.printStackTrace();

	}
	finally {
		try {
			if(conn!=null)
				conn.close();
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
}
