package StudioN;

public class Cliente extends Pessoa {

	private String CodCliente;
	
	public Cliente () {
		super();
	}
	
	public Cliente (String codCliente) {
		this.setCodCliente(codCliente);
	}

	public String getCodCliente() {
		return this.CodCliente;
	}

	public void setCodCliente(String codCliente) {
		this.CodCliente = codCliente;
	}

	public void ExibirDadosCliente() {
		System.out.println("========================================");
		System.out.println("CLIENTE");
		System.out.println("----------------------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("CPF: " + this.getCPF());
		System.out.println("Código: " + this.getCodCliente());
		System.out.println("========================================");
	}
	
	public void a () {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
