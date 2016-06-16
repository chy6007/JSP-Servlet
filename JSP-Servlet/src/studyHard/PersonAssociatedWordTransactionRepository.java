package studyHard;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonAssociatedWordTransactionRepository{

	private PersonAssociatedWordTransactionRepository(){}

	private static PersonAssociatedWordTransactionRepository instance = null;

	public static synchronized PersonAssociatedWordTransactionRepository getInstance() {
		if(instance == null){
			instance = new PersonAssociatedWordTransactionRepository();
		}		
		return instance;
	}

	public void setAssocicateWords(String name, String word1, String word2) throws SQLException {
		SQLiteConnector connector = new SQLiteConnector();
		Connection conn = connector.getConnection();	

		Statement stmt = null;
		
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "insert into person_associcate_word (name, word)" + "values('"+name+"','"+word1+"')";
			String sql2 = "insert into person_associcate_word (name, word)" + "values('"+name+"','"+word2+"')";

			stmt.executeUpdate(sql);			
			stmt.executeUpdate(sql2);
			conn.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			if(conn != null) {
				try {
					conn.rollback();
				} catch(SQLException e1){
					e1.printStackTrace();
				}
			}			
			throw e;
			
		} finally{
			try{
				if(conn != null)
					conn.close();
			} catch(SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
	}

}
