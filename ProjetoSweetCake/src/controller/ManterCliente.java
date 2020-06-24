package controller;

import model.Cliente;

public class ManterCliente {
        private NoCliente inicio;

        public ManterCliente() {
            this.inicio = null;
        }

        // modulos de funcionamento

        public void AdicionarCliente(Cliente data) {
            if (this.inicio == null) {
                NoCliente n = new NoCliente(data);
                this.inicio = n;
            } else {
                NoCliente aux = this.inicio;
                NoCliente n = new NoCliente(data);
                n.setNext(aux);
                this.inicio = n;
            }
        }

        public String Mostra() {
            String mostrar = "";
            if (this.inicio == null) {
                mostrar = "Não há clientes";
            } else {
                StringBuffer buffer = new StringBuffer("Lista de clientes: \n" );
                NoCliente aux = this.inicio;
                while (aux != null) {
                    buffer.append(
                            "Nome: " + aux.getData().getNome() + " Telefone" + aux.getData().getTelefone() + " E-mail: " +aux.getData().getEmail() + " Endereço: " +aux.getData().getEndereco() + "\n");
                    aux = aux.getNext();
                }
                mostrar = buffer.toString();
            }

            return mostrar;
        }
}