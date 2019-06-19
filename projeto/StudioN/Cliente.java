package StudioN;

public class Cliente extends Pessoa {

	private int CodCliente;

	public Cliente() {
		super();
	}

	public Cliente(int codCliente) {
		this.setCodCliente(codCliente);
	}

	public int getCodCliente() {
		return this.CodCliente;
	}

	public void setCodCliente(int codCliente) {
		this.CodCliente = codCliente;
	}

	public void ExibirDadosCliente() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("CPF: " + this.getCPF());
		System.out.println("Código: " + this.getCodCliente());
		System.out.println();
	}

}
