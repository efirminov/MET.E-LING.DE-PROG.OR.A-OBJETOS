package entidade;

public class Livros {
	
	private String title;
	private String isbn;
	
	public Livros() {
	}

	public Livros(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "\nTitle: " + title + " - ISBN: " + isbn;
	}
	
	

}
