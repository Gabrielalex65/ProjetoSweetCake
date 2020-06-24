package model;

public class Bolo {
	private String Massa;
	private Double Peso;
	private int QuantPessoas;
	

public Bolo() {
	this.setMassa(null);
	this.setPeso(null);
	this.setQuantPessoas(0);
}


public String getMassa() {
	return Massa;
}


public void setMassa(String massa) {
	Massa = massa;
}


public Double getPeso() {
	return Peso;
}


public void setPeso(Double peso) {
	Peso = peso;
}


public int getQuantPessoas() {
	return QuantPessoas;
}


public void setQuantPessoas(int quantPessoas) {
	QuantPessoas = quantPessoas;
}
}
