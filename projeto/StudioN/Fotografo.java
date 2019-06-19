package StudioN;

import java.util.ArrayList;

public class Fotografo extends Pessoa {

	private String CodFotografo;
	private ArrayList<String> Modalidades;
	private String HistoricoProjetos;
	private String HorasTrabalhadas;
	private ArrayList<String> DiasDaSemanaDisponiveis;
	private String PrecoFoto;
	private String PrecoHora;

	public Fotografo() {
		super();
	}

	public Fotografo(String codFoto, ArrayList<String> modalidades, String projetos, String horas, ArrayList<String> dias) {
		this.setCodFotografo(codFoto);
		this.setModalidades(modalidades);
		this.setHistoricoProjetos(projetos);
		this.setHorasTrabalhadas(horas);
		this.setDiasDaSemanaDisponiveis(dias);
	}

	public ArrayList<String> getDiasDaSemanaDisponiveis() {
		return this.DiasDaSemanaDisponiveis;
	}

	public void setDiasDaSemanaDisponiveis(ArrayList<String> diasDaSemanaDisponiveis) {
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

	public void ExibirDadosFotografo() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Código: " + this.getCodFotografo());
		System.out.println("Modalidades: " + this.getModalidades());
		System.out.println("Histórico de Projetos: " + this.getHistoricoProjetos());
		System.out.println("Horas Trabalhadas: " + this.getHorasTrabalhadas());
		System.out.println("Dias da semana disponíveis: " + this.getDiasDaSemanaDisponiveis());
		System.out.println();
		
	}

}
