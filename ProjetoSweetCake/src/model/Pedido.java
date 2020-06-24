package model;

import java.util.Date;

public class Pedido {
	private String status;
	private Double valorPedido;
	private Date dataEntrega;
	
	public Pedido(String status, Double valorPedido, Date dataEntrega) {
		this.status = "";
		this.valorPedido = null;
		this.dataEntrega = null;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getValorPedido() {
		return valorPedido;
	}
	
	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
			
}