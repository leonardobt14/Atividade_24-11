import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/disciplinas?serverTimezone=UTC", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		Conexao.getConnection();
		System.out.println("ok");
	}

}