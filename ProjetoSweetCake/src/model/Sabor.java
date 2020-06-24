package model;

public class Sabor {
	//Composicao do diagrama de classe
	//Recheio
	private Double PrecoRecheio;
	private String Recheio;
	//Cobertura
	private Double PrecoCobertura;
	private String Cobertura;
public Sabor() {
	this.PrecoRecheio = null;
	this.Recheio = null;
	this.PrecoCobertura = null;
	this.Cobertura =  null;
	}
public String getRecheio() {
	return Recheio;
}

public void setRecheio(String Recheio) {
	this.Recheio = Recheio;
}

public Double getPrecoRecheio() {
	return PrecoRecheio;
}

public void setPrecoRecheio(Double PrecoRecheio) {
	this.PrecoRecheio = PrecoRecheio;
}

public String getCobertura() {
	return Cobertura;
}

public void setCobertura(String Cobertura) {
	this.Cobertura = Cobertura;
}
public Double getPrecoCobertura() {
	return PrecoCobertura;
}

public void setPrecoCobertura(Double PrecoCobertura) {
	this.PrecoCobertura = PrecoCobertura;
}

}
