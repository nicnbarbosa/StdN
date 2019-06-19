package StudioN;

import java.util.ArrayList;
import java.util.Scanner;

public class Fotografo extends Pessoa {

	private int CodFotografo;
	private String Modalidades;
	private String DiasDaSemanaDisponiveis;
	private double PrecoFoto;
	private double PrecoHora;

	public Fotografo() {
		super();
	}

	public Fotografo(Produto produto, int codFoto, String modalidades, String dias) {

		this.setCodFotografo(codFoto);
		this.setModalidades(modalidades);
		this.setDiasDaSemanaDisponiveis(dias);
	}

	public String getDiasDaSemanaDisponiveis() {
		return this.DiasDaSemanaDisponiveis;
	}

	public void setDiasDaSemanaDisponiveis(String diasDaSemanaDisponiveis) {
		this.DiasDaSemanaDisponiveis = diasDaSemanaDisponiveis;
	}

	public int getCodFotografo() {
		return this.CodFotografo;
	}

	public void setCodFotografo(int codFoto) {
		this.CodFotografo = codFoto;
	}

	public String getModalidades() {
		return this.Modalidades;
	}

	public void setModalidades(String modalidades) {
		this.Modalidades = modalidades;
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
		System.out.println("Dias da semana disponíveis: " + this.getDiasDaSemanaDisponiveis());
		System.out.println("Preço por foto: R$ " + this.getPrecoFoto());
		System.out.println("Preço por hora: R$ " + this.getPrecoHora());
		System.out.println();

	}

	public void CadastroFotografo() {
		Scanner dado = new Scanner(System.in);
		int n, d;
		String mod, dia;
		String nomeF;
		String telF;
		String emailF;
		String cpfF;
		int codF;
		String modalidade;
		String diasDisponiveis;
		int historicoProjetos;
		int horasTrabalhadas;
		double precoFoto;
		double precoHora;

		// Tela de Cadastro
		System.out.println("|============================================|");
		System.out.println("|           CADASTRO FOTÓGRAFO               |");
		System.out.println("|                                            |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu nome:                          |");
		System.out.println("|--------------------------------------------|");
		nomeF = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu telefone:                      | ");
		System.out.println("|--------------------------------------------|");
		telF = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu email:                         |");
		System.out.println("|--------------------------------------------|");
		emailF = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------");
		System.out.println("| Informe seu CPF:                           |");
		System.out.println("|--------------------------------------------|");
		cpfF = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("|Informe seu código:                         |");
		System.out.println("|--------------------------------------------|");
		codF = Integer.parseInt(dado.nextLine());
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("|Informe quais são as suas especializações:  |");
		System.out.println("|---------------------------------------- ---|");
		modalidade = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe o dia disponível:                  |");
		System.out.println("|--------------------------------------------|");
		diasDisponiveis = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe o preço por foto cobrado:          |");
		System.out.println("|--------------------------------------------|");
		precoFoto = dado.nextDouble();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe o preço por hora cobrado:          |");
		System.out.println("|--------------------------------------------|");
		precoHora = dado.nextDouble();
		System.out.println("|============================================|");
		System.out.println();
		this.setNome(nomeF);
		this.setTelefone(telF);
		this.setEmail(emailF);
		this.setCPF(cpfF);
		this.setCodFotografo(codF);
		this.setModalidades(modalidade);
		this.setDiasDaSemanaDisponiveis(diasDisponiveis);
		this.setPrecoFoto(precoFoto);
		this.setPrecoHora(precoHora);

	}

}
