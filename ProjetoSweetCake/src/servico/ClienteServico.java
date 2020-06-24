package servico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.ClienteLogin;

public class ClienteServico {

	private static final String NOME_ARQUIVO = "ArquivoCliente.txt";
	
	public static void cadastro() throws IOException {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
		
		String login = JOptionPane.showInputDialog("Digite o login do funcionário: ");
		
		String senha = JOptionPane.showInputDialog("Digite a senha do funcionário: ");
		
		ClienteLogin funcionario = new ClienteLogin(nome, login, senha);
		
		cadastro(funcionario);
	}
	
	public static void cadastro(ClienteLogin funcionario) throws IOException {
	
		File Arquivo = new File(NOME_ARQUIVO);
		
		if (Arquivo.exists()) {

			FileWriter writer = new FileWriter(NOME_ARQUIVO, true);
			int quantLinhas = contarLinhas(Arquivo);

			funcionario.setId(quantLinhas + 1);
			
			String registro = funcionario.getId() + ", " + funcionario.getNome() + ", " + funcionario.getLogin() + ", " + funcionario.getSenha();
			
			writer.write("\n" + registro);
			writer.close();
		} else {
			BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
			funcionario.setId(1);
			String registro = funcionario.getId() + ", " + funcionario.getNome() + ", " + funcionario.getLogin() + ", " + funcionario.getSenha();
			writer.write(registro);
			writer.close();
		}
	}
	
	public static ClienteLogin logar(String login, String senha) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
		
		String linha;
		
		while ((linha = reader.readLine()) != null) {
			
			String[] funcSplit = linha.split(",");
			
			if (login.equals(funcSplit[2].trim()) && senha.equals(funcSplit[3].trim())) {
				return new ClienteLogin(Integer.parseInt(funcSplit[0]), funcSplit[1], funcSplit[2], funcSplit[3]);
			}
		}
		
		reader.close();
		
		return null;
	}
	
	public static int contarLinhas(String nomeArquivo) throws IOException {
		return contarLinhas(new File(nomeArquivo));
	}
	
	public static int contarLinhas(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		int quantLinhas = 0;
		
		while (reader.readLine() != null) quantLinhas++;
		
		reader.close();
		
		return quantLinhas;
	}
	
	public static String buscar(String busca, int index, int indexRetorno) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
		
		String linha;
		
		while ((linha = reader.readLine()) != null) {

			String split[] = linha.split(",");
			
			if (busca.equals(split[index].trim())) {
				return split[indexRetorno];
			}
		}
		
		reader.close();
		
		return "";
	}
	
}