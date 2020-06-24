package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import model.ClienteLogin;
import servico.ClienteServico;

public class Principal {
	static ClienteLogin funcionario = null;
	public static void main(String[] args) throws IOException {
		int opc = 0;
		
		while(opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1-Fazer login \n 2- Criar conta \n 3-Administrador \n 99-Sair do app"));
			switch(opc) {
			case 1:
				while (funcionario == null) {
					String login = JOptionPane.showInputDialog("Login:");
					String senha = JOptionPane.showInputDialog("Senha:");
					
					funcionario = ClienteServico.logar(login, senha);
				}
				break;
			case 2:
				break;
			case 3:
				break;
			}
		}
	}

}
