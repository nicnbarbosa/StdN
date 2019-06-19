package StudioN;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class main {

	static Fotografo fotografo;

	static Cliente cliente;
	static Produto produto;
	static Contrato contrato;
	static Date data;
	static Scanner dado = new Scanner(System.in);

	private static int op;

	public static void main(String[] args) {

		fotografo = new Fotografo();
		cliente = new Cliente();
		produto = new Produto();
		contrato = new Contrato();
		data = new Date();
		System.out.println("===============================+");
		System.out.println("1. Cadastrar Fot�grafo         +");
		System.out.println("2. Cadastrar Cliente           +");
		System.out.println("3. Efetuar Compra do Pacote    +");
		System.out.println("4. Mostrar contrato            +");
		System.out.println("===============================+");

		op = dado.nextInt();
		System.out.println();

		if (op == 1) {
			CadastroFotografo();
		} else if (op == 2) {
			CadastroCliente();
		} else if (op == 3) {
			EfetuarCompra();
		}
		CadastroCliente();
		CadastroFotografo();
		Contrato(contrato, fotografo, cliente, produto, data);
	}

	// ===================================================================================================================================//
	private static String nomeC;
	private static String telC;
	private static String emailC;
	private static String cpfC;
	private static int codC;

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
		System.out.println("Informe seu c�digo: ");
		codC = dado.nextInt();
		System.out.println();
		System.out.println("============================================");

		cliente = new Cliente();
		cliente.setNome(nomeC);
		cliente.setTelefone(telC);
		cliente.setEmail(emailC);
		cliente.setCPF(cpfC);
		cliente.setCodCliente(codC);

		// Exibi��o dos Dados Cadastrados

		System.out.println();
		System.out.println();
		System.out.println("DADOS CADASTRADOS");
		System.out.println();
		System.out.println("- Nome: " + cliente.getNome());
		System.out.println("- Telefone: " + cliente.getTelefone());
		System.out.println("- Email: " + cliente.getEmail());
		System.out.println("- CPF: " + cliente.getCPF());
		System.out.println("- C�digo: " + cliente.getCodCliente());

	}

	// ===================================================================================================================================//
	private static String nomeF;
	private static String telF;
	private static String emailF;
	private static String cpfF;
	private static int codF;
	private static ArrayList<String> modalidades = new ArrayList<String>();
	private static ArrayList<String> diasDisponiveis = new ArrayList<String>();
	private static int historicoProjetos;
	private static int horasTrabalhadas;
	private static double precoFoto;
	private static double precoHora;

	public static void CadastroFotografo() {

		int n, d;
		String mod, dia;

		// Tela de Cadastro
		System.out.println("============================================");
		System.out.println("           CADASTRO FOT�GRAFO               ");
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
		System.out.println("Informe seu c�digo: ");
		codF = dado.nextInt();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe quantas s�o as suas especializa��es:");
		n = Integer.parseInt(dado.nextLine());
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Informe quais s�o as suas especializa��es:  ");
			mod = dado.nextLine();
			modalidades.add(mod);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe quantos dias est� dispon�vel:");
		d = Integer.parseInt(dado.nextLine());
		System.out.println();
		for (int i = 0; i < d; i++) {
			System.out.println("Informe os dias em que est� dispon�vel:");
			dia = dado.nextLine();
			diasDisponiveis.add(dia);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe o pre�o por foto cobrado: ");
		precoFoto = dado.nextDouble();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe o pre�o por hora cobrado: ");
		precoHora = dado.nextDouble();
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

		// Exibi��o dos dados cadastrados
		System.out.println();
		System.out.println();
		System.out.println("DADOS CADASTRADOS");
		System.out.println();
		System.out.println("- Nome: " + fotografo.getNome());
		System.out.println("- Telefone: " + fotografo.getTelefone());
		System.out.println("- Email: " + fotografo.getTelefone());
		System.out.println("- CPF:" + fotografo.getCPF());
		System.out.println("- C�digo: " + fotografo.getCodFotografo());
		System.out.println("- Modalidades" + fotografo.getModalidades());
		System.out.println("- Dias dispon�veis: " + fotografo.getDiasDaSemanaDisponiveis());
		System.out.println("- Pre�o por foto: " + fotografo.getPrecoFoto());
		System.out.println("- Pre�o por hora: " + fotografo.getPrecoHora());
	}

	// ===================================================================================================================================//
	private static int quantFotos;
	private static int horasUsadas;

	public static void EfetuarCompra() {

		int op;
		System.out.println();
		System.out.println("Informe os dados para efetuar a compra do pacote: ");
		System.out.println();
		System.out.println("- Quantidade de fotos: ");
		quantFotos = dado.nextInt();
		System.out.println("- Horas usadas para a sess�o: ");
		horasUsadas = dado.nextInt();

		produto = new Produto();
		produto.setQuantFotos(quantFotos);
		produto.setHoras(horasUsadas);

		System.out.println("DADOS CADASTRADOS");
		System.out.println();
		System.out.println("- Quantidade de fotos: " + produto.getQuantFotos());
		System.out.println("- Horas usadas para a sess�o: " + produto.getHoras());
		
		System.out.println("Gostaria de efetuar a compra do pacote? ");
		System.out.println("1. Sim");
		System.out.println("2. N�o");
		if (op == 1) {
			
		}
		else if (op == 2) {
			
		}
		System.out.println();
	}

	// ===================================================================================================================================//

	public static void Contrato(Contrato cn, Fotografo f, Cliente cl, Produto p, Date d) {

		cn.DadosContrato(f, cl, p, d);
	}

	static FileWriter arquivofisico;
	static PrintWriter arquivologico;
	static FileReader arqLeiFisico;
	static BufferedReader arqLeiLogico;

	public static void ArquivoTxtContrato () throws Exception {
		FileReader arqLeiFisico = new FileReader("arquivo.txt");
		BufferedReader arqLeiLogico = new BufferedReader (arqLeiFisico);
		
		String linha;
		linha = arqLeiLogico.readLine();
		while (!linha.trim().isEmpty()){
		     System.out.println(linha);
		     linha = arqLeiLogico.readLine();
		}
		
		for (int i = 0, i <  ; i++) {
			
		}
		
		
		FileWriter arquivofisico = new FileWriter ("arquivo.txt");
		PrintWriter arquivologico = new PrintWriter(arquivofisico);
		
		
	}

}
