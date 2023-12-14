import java.util.LinkedList;

class Cliente {
    int idCliente;
    String nomeCliente;
    String endereco;
    double saldoAPagar;

    public Cliente(int idCliente, String nomeCliente, String endereco, double saldoAPagar) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.saldoAPagar = saldoAPagar;
    }

    @Override
    public String toString() {
        return "ID: " + idCliente + ", Nome: " + nomeCliente + ", Endereço: " + endereco + ", Saldo a Pagar: " + saldoAPagar;
    }
}

class CadastroClientes {
    private LinkedList<Cliente> listaClientes;

    public CadastroClientes() {
        this.listaClientes = new LinkedList<>();
    }

    public void inserirCliente(Cliente cliente) {
        // Verificar se o idCliente já existe na lista
        if (!listaClientes.isEmpty()) {
            for (Cliente c : listaClientes) {
                if (c.idCliente == cliente.idCliente) {
                    System.out.println("Cliente com ID " + cliente.idCliente + " já existe. Inserção cancelada.");
                    return;
                }
            }
        }

        // Encontrar a posição correta para manter a lista ordenada por idCliente
        int posicaoInsercao = 0;
        while (posicaoInsercao < listaClientes.size() && listaClientes.get(posicaoInsercao).idCliente < cliente.idCliente) {
            posicaoInsercao++;
        }

        // Inserir na posição correta
        listaClientes.add(posicaoInsercao, cliente);
        System.out.println("Cliente inserido com sucesso!");
    }

    public void alterarCliente(int idCliente, double novoSaldo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.idCliente == idCliente) {
                cliente.saldoAPagar = novoSaldo;
                System.out.println("Saldo do cliente ID " + idCliente + " alterado com sucesso!");
                return;
            }
        }

        System.out.println("Cliente com ID " + idCliente + " não encontrado.");
    }

    public void excluirCliente(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.idCliente == idCliente) {
                listaClientes.remove(cliente);
                System.out.println("Cliente ID " + idCliente + " removido com sucesso!");
                return;
            }
        }

        System.out.println("Cliente com ID " + idCliente + " não encontrado.");
    }

    public void buscarCliente(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.idCliente == idCliente) {
                System.out.println("Cliente encontrado:\n" + cliente);
                return;
            }
        }

        System.out.println("Cliente com ID " + idCliente + " não encontrado.");
    }

    public void listarTodosClientes() {
        System.out.println("Listagem de todos os clientes cadastrados:");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public void listarClientesComSaldo() {
        System.out.println("Listagem dos clientes com saldo a pagar:");
        for (Cliente cliente : listaClientes) {
            if (cliente.saldoAPagar > 0) {
                System.out.println(cliente);
            }
        }
    }

    public void listarClientesSemSaldo() {
        System.out.println("Listagem dos clientes sem saldo a pagar:");
        for (Cliente cliente : listaClientes) {
            if (cliente.saldoAPagar == 0) {
                System.out.println(cliente);
            }
        }
    }
}

public class TesteAPI {
    public static void main(String[] args) {
        CadastroClientes cadastro = new CadastroClientes();

        cadastro.inserirCliente(new Cliente(1, "Cliente A", "Rua A", 100.0));
        cadastro.inserirCliente(new Cliente(3, "Cliente C", "Rua C", 0.0));
        cadastro.inserirCliente(new Cliente(2, "Cliente B", "Rua B", 50.0));

        cadastro.listarTodosClientes();

        cadastro.alterarCliente(1, 200.0);

        cadastro.listarClientesComSaldo();

        cadastro.excluirCliente(3);

        cadastro.listarClientesSemSaldo();

        cadastro.buscarCliente(2);
        cadastro.buscarCliente(4);
    }
}
