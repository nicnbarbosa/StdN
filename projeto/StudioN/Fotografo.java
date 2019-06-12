package StudioN;

import java.util.ArrayList;

public class Fotografo extends Pessoa {

	private String CodFotografo;
	private ArrayList <String> Modalidades;
	private String Historico;
	
	public Fotografo () {
		super();
	}
	
	public Fotografo (String codFoto, ArrayList <String> modalidades, String historico) {
		this.setCodFotografo(codFoto);
		this.setModalidades(modalidades);
		this.setHistorico(historico);
	}

	public String getCodFotografo() {
		return this.CodFotografo;
	}

	public void setCodFotografo(String codFoto) {
		this.CodFotografo = codFoto;
	}

	public ArrayList<String> getModalidades() {
		return this.Modalidades;
	}

	public void setModalidades(ArrayList<String> modalidades) {
		this.Modalidades = modalidades;
	}

	public String getHistorico() {
		return this.Historico;
	}

	public void setHistorico(String historico) {
		this.Historico = historico;
	}
}
