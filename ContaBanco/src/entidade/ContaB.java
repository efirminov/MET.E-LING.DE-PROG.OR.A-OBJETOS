package entidade;

import java.util.ArrayList;

public class ContaB {
	
	private String BancoBase;
	private ArrayList<Conta> lista = new ArrayList<Conta>();
	
	public ContaB() {	
	}
	public ContaB(String BTD, ArrayList<Conta> cont) {
		this.BancoBase = BTD;
		this.lista = cont;
	}
	public String getBancoBase() {
		return BancoBase;
	}
	public void setBancoBase(String BancoBase) {
		BancoBase = BancoBase;
	}
	public ArrayList<Conta> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Conta> lista) {
		this.lista = lista;
	}
	
	
	public String toString() {
		return "BancoBase :" + BancoBase + ", lista :" + lista;
	}
	public void addnovaconta(String nome, int numero, double saldo) {
		lista.add(new Conta(nome, numero, saldo));
	}
	public String maiorsaldo() {
		double tempsaldo = lista.get(0).getSaldo();
		 String temp = "";
				for(Conta s :lista) {
					if(tempsaldo <= s.getSaldo()) {
						temp = "a conta com maior saldo é : " + "BancoBase" + s;
						tempsaldo = s.getSaldo();
					}
				}
				return temp;
		
	}
}
