package StudioN;

import java.util.ArrayList;

public class Fotografo extends Pessoa {

	private String CodFotografo;
	private ArrayList <String> Modalidades;
	private String HistoricoProjetos;
	private String HorasTrabalhadas;
	private String DiasDaSemanaDisponiveis;
	
	public Fotografo () {
		super();
	}
	
	public Fotografo (String codFoto, ArrayList <String> modalidades, String projetos, String horas, String dias) {
		this.setCodFotografo(codFoto);
		this.setModalidades(modalidades);
		this.setHistoricoProjetos(projetos);
		this.setHorasTrabalhadas(horas);
		this.setDiasDaSemanaDisponiveis(dias);
	}

	public String getDiasDaSemanaDisponiveis() {
		return this.DiasDaSemanaDisponiveis;
	}

	public void setDiasDaSemanaDisponiveis(String diasDaSemanaDisponiveis) {
		this.DiasDaSemanaDisponiveis = diasDaSemanaDisponiveis;
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

	public String getHistoricoProjetos() {
		return this.HistoricoProjetos;
	}

	public void setHistoricoProjetos(String historicoProjetos) {
		this.HistoricoProjetos = historicoProjetos;
	}

	public String getHorasTrabalhadas() {
		return this.HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.HorasTrabalhadas = horasTrabalhadas;
	}

	public void ExibirDadosFotografo () {
		
	}
}
