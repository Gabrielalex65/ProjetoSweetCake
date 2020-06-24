package controller;

import model.Cliente;

public class NoCliente {
	private Cliente data;
	private NoCliente next;

	public NoCliente(Cliente data) {
		this.data = data;
		this.next = null;
	}

	public Cliente getData() {
		return data;
	}

	public void setData(Cliente data) {
		this.data = data;
	}

	public NoCliente getNext() {
		return next;
	}

	public void setNext(NoCliente next) {
		this.next = next;
	}

}
