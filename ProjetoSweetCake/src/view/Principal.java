package view;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opc = 0;
		while(opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1-Fazer login \n 2- Criar conta \n 3-Administrador \n 99-Sair do app"));
			switch(opc) {
			case 1:
			}
		}
	}

}
