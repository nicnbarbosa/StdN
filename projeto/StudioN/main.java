package StudioN;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class main {


	static Fotografo fotografo;
	static Cliente cliente;
	static Produto produto;
	static Contrato contrato;
	static Date data;
    static Scanner dado = new Scanner(System.in);
	
	public static void main(String[] args) {

		fotografo = new Fotografo();
		cliente = new Cliente();
		produto = new Produto();
		contrato = new Contrato();
		data = new Date();
		
		CadastroCliente();
		CadastroFotografo();
		Contrato(contrato, fotografo, cliente, produto, data);
	}
	
	private static String nomeC;
	private static String telC;
	private static String emailC;
	private static String cpfC;
	private static String codC;

	public static void CadastroCliente() {

		// Tela de Cadastro
		System.out.println("============================================");
		System.out.println("             CADASTRO CLIENTE               ");
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu nome: ");
		nomeC = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu telefone: ");
		telC = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu email: ");
		emailC = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu CPF: ");
		cpfC = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu código: ");
		codC = dado.nextLine();
		System.out.println();
		System.out.println("============================================");

		cliente = new Cliente();
		cliente.setNome(nomeC);
		cliente.setTelefone(telC);
		cliente.setEmail(emailC);
		cliente.setCPF(cpfC);
		cliente.setCodCliente(codC);

		// Exibição dos Dados Cadastrados

		System.out.println();
		System.out.println();
		System.out.println("DADOS CADASTRADOS");
		System.out.println();
		System.out.println("- Nome: " + cliente.getNome());
		System.out.println("- Telefone: " + cliente.getTelefone());
		System.out.println("- Email: " + cliente.getEmail());
		System.out.println("- CPF: " + cliente.getCPF());
		System.out.println("- Código: " + cliente.getCodCliente());

	
	}

	// ===================================================================================================================================//
	private static String nomeF;
	private static String telF;
	private static String emailF;
	private static String cpfF;
	private static String codF;
	private static ArrayList<String> modalidades = new ArrayList<String>();
	private static ArrayList<String> diasDisponiveis = new ArrayList<String>();
	private static String historicoProjetos;
	private static String horasTrabalhadas;
	private static String precoFoto;
	private static String precoHora;
	

	public static void CadastroFotografo() {

		int n, d;
		String mod, dia;

		// Tela de Cadastro
		System.out.println("============================================");
		System.out.println("           CADASTRO FOTÓGRAFO               ");
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu nome: ");
		nomeF = dado.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu telefone: ");
		telF = dado.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu email: ");
		emailF = dado.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu CPF: ");
		cpfF = dado.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu código: ");
		codF = dado.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe quantas são as suas especializações:");
		n = Integer.parseInt(dado.nextLine());
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Informe quais são as suas especializações:  ");
			mod = dado.nextLine();
			modalidades.add(mod);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe quantos dias está disponível:");
		d = Integer.parseInt(dado.nextLine());
		System.out.println();
		for (int i = 0; i < d; i++) {
			System.out.println("Informe os dias em que está disponível:");
			dia = dado.nextLine();
			diasDisponiveis.add(dia);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe o preço por foto cobrado: ");
		precoFoto = dado.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe o preço por hora cobrado: ");
		precoHora = dado.nextLine();
		System.out.println();
		System.out.println("============================================");

		fotografo = new Fotografo();
		fotografo.setNome(nomeF);
		fotografo.setTelefone(telF);
		fotografo.setEmail(emailF);
		fotografo.setCPF(cpfF);
		fotografo.setCodFotografo(codF);
		fotografo.setModalidades(modalidades);
		fotografo.setDiasDaSemanaDisponiveis(diasDisponiveis);
		fotografo.setPrecoFoto(precoFoto);
		fotografo.setPrecoHora(precoHora);

		// Exibição dos dados cadastrados
		System.out.println();
		System.out.println();
		System.out.println("DADOS CADASTRADOS");
		System.out.println();
		System.out.println("- Nome: " + fotografo.getNome());
		System.out.println("- Telefone: " + fotografo.getTelefone());
		System.out.println("- Email: " + fotografo.getTelefone());
		System.out.println("- CPF:" + fotografo.getCPF());
		System.out.println("- Código: " + fotografo.getCodFotografo());
		System.out.println("- Modalidades" + fotografo.getModalidades());
		System.out.println("- Dias disponíveis: " + fotografo.getDiasDaSemanaDisponiveis());
		System.out.println("- Preço por foto: " + fotografo.getPrecoFoto());
		System.out.println("- Preço por hora: " + fotografo.getPrecoHora());
	}

	// ===================================================================================================================================//
	private static String quantFotos;
	private static String horasUsadas;
	
	public static void DadosProduto () {
		
		System.out.println("Dados para o pacote");
		System.out.println();
		System.out.println("- Quantidade de fotos: ");
		quantFotos = dado.nextLine();
		System.out.println("- Horas usadas para a sessão: ");
		horasUsadas = dado.nextLine();
		
		produto = new Produto();
		produto.setQuantFotos(quantFotos);
		produto.setHoras(horasUsadas);
		
		System.out.println("DADOS CADASTRADOS");
		System.out.println();
		System.out.println("- Quantidade de fotos: " + produto.getQuantFotos());
		System.out.println("- Horas usadas para a sessão: " + produto.getHoras());
	}
	
	// ===================================================================================================================================//
	

	public static void Contrato(Contrato cn, Fotografo f, Cliente cl, Produto p, Date d) {
		
		cn.DadosContrato(f, cl, p, d);
	}
	
}
