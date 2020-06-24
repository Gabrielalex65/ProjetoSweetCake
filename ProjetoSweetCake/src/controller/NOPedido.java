package controller;

import model.Pedido;

public class NOPedido {
	private Pedido status;
	private Pedido valorPedido;
	private Pedido dataEntrega;
	public NOPedido prox;
	public NOPedido anterior;
	
	public NOPedido (Pedido status, Pedido valorPedido, Pedido dataEntrega) {
		this.status = status;
		this.valorPedido = valorPedido;
		this.dataEntrega = dataEntrega;
		this.prox = null;
		this.anterior = null;
	}
	
	public Pedido getStatus() {
		return status;
	}
	
	public void setStatus(Pedido status) {
		this.status = status;
	}
	
	public Pedido getValorPedido() {
		return valorPedido;
	}
	
	public void setValorPedido(Pedido valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	public Pedido getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Pedido dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}