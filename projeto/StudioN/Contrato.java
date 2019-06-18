package StudioN;

public class Contrato {

	private String PrecoFinal;
	
	public Contrato () {
		
	}
	
	public Contrato (String precoFinal) {
		this.setPrecoFinal(precoFinal);
	}

	public String getPrecoFinal() {
		return this.PrecoFinal;
	}

	public void setPrecoFinal(String precoFinal) {
		this.PrecoFinal = precoFinal;
	}
	
}
