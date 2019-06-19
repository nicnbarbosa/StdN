package StudioN;

public class Produto extends Fotografo {

	private double PrecoFinal;
	private int QuantFotos;
	private int Horas;
	
	public Produto () {
		super();
	}
	
	public Produto (double precoFinal, int quantFotos, int horas) {
		this.setPrecoFinal(precoFinal);
		this.setQuantFotos(quantFotos);
		this.setHoras(horas);
	}

	public double getPrecoFinal() {
		return this.PrecoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.PrecoFinal = precoFinal;
	}

	public int getQuantFotos() {
		return this.QuantFotos;
	}

	public void setQuantFotos(int quantFotos) {
		this.QuantFotos = quantFotos;
	}

	public int getHoras() {
		return this.Horas;
	}

	public void setHoras(int horas) {
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
		System.out.println("PRE�O FINAL -----> " + this.PrecoFinal);
	}
	
}
