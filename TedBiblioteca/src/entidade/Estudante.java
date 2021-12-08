package entidade;

public class Estudante {
	
	private String nome;
	private String inscrição;
	private String curso;
	private String status;
	
	private Livros Livros;
	
	public Estudante(String nome, String inscrição, String curso, String status, Livros Livros) {
		this.nome = nome;
		this.inscrição = inscrição;
		this.curso = curso;
		this.status = status;
		this.Livros = Livros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = nome;
	}

	public String getInscrição() {
		return inscrição;
	}

	public void setInscrição(String enrollment) {
		this.inscrição = inscrição;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String course) {
		this.curso = curso;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Livros getLivros() {
		return Livros;
	}

	public void setLivros(Livros Livros) {
		this.Livros = Livros;
	}

	@Override
	public String toString() {
		return "\n" + "\nNome: " + this.nome 
				+ ", Inscrição: " + this.inscrição 
				+ ", Curso: " + this.curso
				+ ", Status: " + this.status
				+ "\nLivros " + this.Livros;
	}
	
	
	
	

}
