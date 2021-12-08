package entidade;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	
	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
				
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + "]";
	}


	

	
	

}
