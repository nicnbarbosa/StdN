package StudioN;

public class Produto extends Fotografo {

	private String PrecoFoto;
	private String PrecoHora;
	private String PrecoFinal;
	private String QuantFotos;
	private String Horas;
	
	public Produto () {
		super();
	}
	
	public Produto (String precoFoto, String precoHora, String precoFinal, String quantFotos, String horas) {
		this.setPrecoFoto(precoFoto);
		this.setPrecoHora(precoHora);
		this.setPrecoFinal(precoFinal);
		this.setQuantFotos(quantFotos);
		this.setHoras(horas);
	}

	public String getPrecoFinal() {
		return this.PrecoFinal;
	}

	public void setPrecoFinal(String precoFinal) {
		this.PrecoFinal = precoFinal;
	}

	public String getPrecoFoto() {
		return this.PrecoFoto;
	}

	public void setPrecoFoto(String precoFoto) {
		this.PrecoFoto = precoFoto;
	}

	public String getPrecoHora() {
		return this.PrecoHora;
	}

	public void setPrecoHora(String precoHora) {
		this.PrecoHora = precoHora;
	}
	public String getQuantFotos() {
		return this.QuantFotos;
	}

	public void setQuantFotos(String quantFotos) {
		this.QuantFotos = quantFotos;
	}

	public String getHoras() {
		return this.Horas;
	}

	public void setHoras(String horas) {
		this.Horas = horas;
	}
	
	public void ExibirDadosIniciai
	public void CalcularPrecoFinal () {
		
	}
}
