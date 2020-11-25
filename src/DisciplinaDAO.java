import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAO {
	
	

		public void inserir(Disciplina c) {
			Connection conexao = Conexao.getConnection();
			String sql = "insert into disciplina(titular,numero,agencia,limite,saldo) values (?,?,?,?,?)";
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);

				stmt.setString(1, c.getNome());
				stmt.setString(2, c.getProfessor());
				stmt.setInt(3, c.getPeriodo());
				stmt.setString(4, c.getCodigo_sala());

				stmt.execute();

				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		public List<Disciplina> todos() {
			List<Disciplina> lista = new ArrayList<Disciplina>();
			Connection conexao = Conexao.getConnection();
			String sql = "select * from disciplina;";
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);

				ResultSet retorno = stmt.executeQuery();
				while(retorno.next()) {
					int id = retorno.getInt("id");
					String nome = retorno.getString("nome");
					String prof = retorno.getString("professor");
					int periodo = retorno.getInt("periodo");
					String codigo_sala = retorno.getString("codigo_sala_classroom");

					Disciplina disciplina = new Disciplina(id,nome,prof,periodo,codigo_sala);
					lista.add(disciplina);
				}
				retorno.close();
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}


			return lista;
		}
	}

