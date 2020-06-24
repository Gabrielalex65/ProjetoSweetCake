package model;

public class Administrador {
	private String Nome;
	private String Senha;
	public Administrador() {
		this.Nome = null;
		this.Senha = null;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
	

}

