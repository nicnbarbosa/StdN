package StudioN;

public class Produto {

	private String PrecoFoto;
	private String PrecoHora;
	private String 
	
	public Produto () {
		
	}
	
	public Produto (String precoFoto, String precoHora) {
		this.setPrecoFoto(precoFoto);
		this.setPrecoHora(precoHora);
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
}
