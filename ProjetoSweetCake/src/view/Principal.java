package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ManterCliente;
import model.Cliente;
import model.ClienteLogin;
import servico.ClienteServico;

public class Principal {
	static ClienteLogin Cliente = null;
	public static void main(String[] args) throws IOException {
		ManterCliente cliente = new ManterCliente();
		int opc = 0;
		 Cliente x;
		while(opc != 99) {
			  x = new Cliente ();
			opc = Integer.parseInt(JOptionPane.showInputDialog("1-Fazer login \n 2- Criar conta \n 3-Administrador \n 99-Sair do app"));
			switch(opc) {
			case 1:
				while (Cliente == null) {
					String login = JOptionPane.showInputDialog("Login:");
					String senha = JOptionPane.showInputDialog("Senha:");
					
					Cliente = ClienteServico.logar(login, senha);
				}
				break;
			case 2:
	              x.setNome(JOptionPane.showInputDialog("Nome:"));
	                x.setSenha(JOptionPane.showInputDialog("Crie uma senha:"));
	                x.setEmail(JOptionPane.showInputDialog("E-mail:"));
	                x.setCpf(JOptionPane.showInputDialog("CPF:"));
	                x.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Telefone:")));
	                x.setEndereco(JOptionPane.showInputDialog("Endereço:"));
	                cliente.AdicionarCliente(x);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Clientes: " + cliente.Mostra());
				break;
			}
		}
	}

}
