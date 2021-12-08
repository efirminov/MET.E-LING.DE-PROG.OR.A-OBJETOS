package entidade;

public class Estudante {
	
	private String nome;
	private String inscri��o;
	private String curso;
	private String status;
	
	private Livros Livros;
	
	public Estudante(String nome, String inscri��o, String curso, String status, Livros Livros) {
		this.nome = nome;
		this.inscri��o = inscri��o;
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

	public String getInscri��o() {
		return inscri��o;
	}

	public void setInscri��o(String enrollment) {
		this.inscri��o = inscri��o;
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
				+ ", Inscri��o: " + this.inscri��o 
				+ ", Curso: " + this.curso
				+ ", Status: " + this.status
				+ "\nLivros " + this.Livros;
	}
	
	
	
	

}
