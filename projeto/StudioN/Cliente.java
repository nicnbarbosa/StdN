package StudioN;

public class Cliente extends Pessoa {

	private String CodCliente;
	private String QuantFotos;
	private String Horas;
	
	public Cliente () {
		super();
	}
	
	public Cliente (String codCliente, String qFotos, String horas) {
		this.setCodCliente(codCliente);
		this.setQuantFotos(qFotos);
		this.setHoras(horas);
	}

	public String getCodCliente() {
		return CodCliente;
	}

	public void setCodCliente(String codCliente) {
		CodCliente = codCliente;
	}

	public String getQuantFotos() {
		return QuantFotos;
	}

	public void setQuantFotos(String quantFotos) {
		QuantFotos = quantFotos;
	}

	public String getHoras() {
		return Horas;
	}

	public void setHoras(String horas) {
		Horas = horas;
	}
	
	
}
