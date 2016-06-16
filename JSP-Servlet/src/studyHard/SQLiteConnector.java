package studyHard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector {
	public Connection getConnection(){	 
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC를 찾을 수 없습니다");
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/최희영/JSP-Servlet/JSP-Servlet/database/person-db.sqlite3");
			System.out.println("DB에 연결되었습니다.");
		} catch (SQLException e) {
			System.out.println("DB에 연결할 수 없습니다");
			e.printStackTrace();
		}

		return connection;
	}
}
