package studyHard;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonAssocicateWordRepository {

	public List<String> getAssocicateWords(String name) {
		SQLiteConnector connector = new SQLiteConnector();
		Connection conn = connector.getConnection();	

		List<String> associatedWords = new ArrayList<String>();
		try {
			Statement statement = conn.createStatement();
			String query = "select name, word from person_associcate_word where name='" + name + "'";
			ResultSet res = statement.executeQuery(query);

			while(res.next()){					
				associatedWords.add(res.getString("word"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try{
				if(conn != null)
					conn.close();
			} catch(SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}

		return associatedWords;
	}
}
