package entidade;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
	
	
	public biblioteca() {
		
	}
	private List<Livros> livro = new ArrayList<>() {
		{
			add(new Livros("The Lord of the Rings", "12311-58-10-5"));
			add(new Livros("JAVA - The Best", "45622-58-10-4"));
			add(new Livros("Python - For All", "78933-58-10-3"));
			add(new Livros("COVID 19 - The Cure", "96344-58-10-2"));
			add(new Livros("Architecture in a Week", "85255-58-10-1"));
			add(new Livros("Virtual reality", "75356-58-10-1"));
			add(new Livros("The Internet of Things", "48277-58-10-1"));
			add(new Livros("Big Data", "88888-58-10-1"));
			add(new Livros("The dilemma of innovation", "75399-58-10-1"));
		}
	};

	private List<Estudante> list = new ArrayList<>() {
		{
			add(new Estudante("Evandro", "2019100", "SPI", "Pending", livro.get(0)));
			add(new Estudante("Evandro", "2019100", "SPI", "Pending", livro.get(8)));
			add(new Estudante("Vamberto", "2019200", "SPI", "Delivered", livro.get(1)));
			add(new Estudante("Vamberto", "2019200", "SPI", "Pending", livro.get(6)));
			add(new Estudante("Matheus", "2019300", "SPI", "Pending", livro.get(4)));
			add(new Estudante("Josefa", "2019400", "SPI", "Pending", livro.get(2)));
			add(new Estudante("Josefa", "2019400", "SPI", "Pending", livro.get(5)));
			add(new Estudante("Debora", "2019400", "SPI", "Pending", livro.get(7)));
			add(new Estudante("Debora", "2019500", "SPI", "Delivered", livro.get(3)));
		}
	};

	public List<Livros> getBook() {
		return livro;
	}
	
	public void setBook(List<Livros> book) {
		this.livro = livro;
	}
	
	public List<Estudante> getList() {
		return list;
	}
	
	public void setList(List<Estudante> list) {
		this.list = list;
	}
	
	public String showPending() {
		String temp = "";
		int i = 0;
		for(Estudante x : list) {
			if(temp.contains(x.getNome()) && x.getStatus() == "Pending") {
				i++;
				temp += list.get(i).getLivros();
			}else if(x.getStatus() == "Pending"){
				temp += x ;
				i++;
			}
		}
		return temp;
	}
}
