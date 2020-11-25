public class Disciplina {

	private String nome, professor, codigo_sala;
	private int id, periodo;

	public Disciplina(int id, String nome, String professor, int periodo, String codigo_sala) {
		super();
		this.nome = nome;
		this.id = id;
		this.periodo = periodo;
		this.professor = professor;
		this.codigo_sala = codigo_sala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getCodigo_sala() {
		return codigo_sala;
	}

	public void setCodigo_sala(String codigo_sala) {
		this.codigo_sala = codigo_sala;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
}
