package model;

import java.util.Date;

import javax.swing.JOptionPane;

public class Pedido {
	String status;
	Double valorPedido;
	Date dataEntrega;
	
	public Pedido(String status, Double valorPedido, Date dataEntrega) {
		this.status = status;
		this.valorPedido = valorPedido;
		this.dataEntrega = dataEntrega;
	}
		
}
