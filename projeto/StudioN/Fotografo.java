package StudioN;

import java.util.ArrayList;

public class Fotografo extends Pessoa {

	private int CodFotografo;
	private ArrayList<String> Modalidades;
	private int HistoricoProjetos;
	private int HorasTrabalhadas;
	private ArrayList<String> DiasDaSemanaDisponiveis;
	private double PrecoFoto;
	private double PrecoHora;
	private Produto produto;

	public Fotografo() {
		super();
	}

	public Fotografo(Produto produto, int codFoto, ArrayList<String> modalidades, int projetos, int horas, ArrayList<String> dias) {
		this.setCodFotografo(codFoto);
		this.setModalidades(modalidades);
		this.setHistoricoProjetos(projetos);
		this.setHorasTrabalhadas(horas);
		this.setDiasDaSemanaDisponiveis(dias);
		this.setProduto(produto);
	}

	public ArrayList<String> getDiasDaSemanaDisponiveis() {
		return this.DiasDaSemanaDisponiveis;
	}

	public void setDiasDaSemanaDisponiveis(ArrayList<String> diasDaSemanaDisponiveis) {
		this.DiasDaSemanaDisponiveis = diasDaSemanaDisponiveis;
	}

	public int getCodFotografo() {
		return this.CodFotografo;
	}

	public void setCodFotografo(int codFoto) {
		this.CodFotografo = codFoto;
	}

	public ArrayList<String> getModalidades() {
		return this.Modalidades;
	}

	public void setModalidades(ArrayList<String> modalidades) {
		this.Modalidades = modalidades;
	}

	public int getHistoricoProjetos() {
		return this.HistoricoProjetos;
	}

	public void setHistoricoProjetos(int historicoProjetos) {
		this.HistoricoProjetos = historicoProjetos;
	}

	public int getHorasTrabalhadas() {
		return this.HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.HorasTrabalhadas = horasTrabalhadas;
	}
	public double getPrecoFoto() {
		return this.PrecoFoto;
	}

	public void setPrecoFoto(double precoFoto) {
		this.PrecoFoto = precoFoto;
	}

	public double getPrecoHora() {
		return this.PrecoHora;
	}

	public void setPrecoHora(double precoHora) {
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
