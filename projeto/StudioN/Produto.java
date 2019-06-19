package StudioN;

public class Produto extends Fotografo {

	private String PrecoFinal;
	private String QuantFotos;
	private String Horas;
	
	public Produto () {
		super();
	}
	
	public Produto (String precoFinal, String quantFotos, String horas) {
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
	
	public void ExibirDadosProduto () {
		System.out.println("Quantidade de fotos: " + this.QuantFotos);
		System.out.println("Horas usadas: " + this.Horas);
	}
	
	public double CalcularPrecoFinal (double precoFoto, double precoHora, double quantFotos, int horas) {
		double precoFinal = (precoFoto * quantFotos) + (precoHora * horas);	
		return precoFinal;
	}
	
	public void ExibirPrecoFinal () {
		System.out.println("PREÇO FINAL -----> " + this.PrecoFinal);
	}
	
}
