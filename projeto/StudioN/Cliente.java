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
		return CodCliente;
	}

	public void setCodCliente(String codCliente) {
		CodCliente = codCliente;
	}

	public void ExibirDadosCliente () {
		
	}
	
	
}
