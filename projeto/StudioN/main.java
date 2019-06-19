package StudioN;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

	static Fotografo fotografo;
	static Cliente cliente;
	static Produto produto;
	static Contrato contrato;
	static Date data;
	static Scanner dado = new Scanner(System.in);
	static ArrayList<Fotografo> fotografos;
	static ArrayList<Cliente> clientes;
	static ArrayList<Produto> produtos;
	static ArrayList<Contrato> contratos;
	static ArrayList<String> contratos2;

	static FileWriter arquivofisico;
	static PrintWriter arquivologico;
	static FileReader arqLeiFisico;
	static BufferedReader arqLeiLogico;

	private static int op;

	public static void main(String[] args) throws IOException {

		contratos2 = new ArrayList<String>();

		FileReader arqLeiFisico = new FileReader("arquivo.txt");
		BufferedReader arqLeiLogico = new BufferedReader(arqLeiFisico);

		String linha;
		linha = arqLeiLogico.readLine();
		while (linha != null) {
			linha = arqLeiLogico.readLine();
		}

		fotografos = new ArrayList<Fotografo>();
		clientes = new ArrayList<Cliente>();
		contratos = new ArrayList<Contrato>();

		produto = new Produto();
		contrato = new Contrato();
		data = new Date();
		System.out.println("|===============================|");
		System.out.println("|             MENU              |");
		System.out.println("|===============================|");
		System.out.println("|1. Cadastrar Fotógrafo         |");
		System.out.println("|2. Cadastrar Cliente           |");
		System.out.println("|3. Efetuar Compra do Pacote    |");
		System.out.println("|4. Mostrar contrato            |");
		System.out.println("|===============================|");
		System.out.println();
		op = dado.nextInt();
		while (op != 0) {
			if (op == 1) {
				fotografo = new Fotografo();
				fotografo.CadastroFotografo();
				fotografos.add(fotografo);
			} else if (op == 2) {
				cliente = new Cliente();
				cliente.CadastroCliente();
				clientes.add(cliente);
			} else if (op == 3) {
				EfetuarCompra();
			} else if (op == 4) {
				MostrarContrato();
			}

			System.out.println("|===============================|");
			System.out.println("|             MENU              |");
			System.out.println("|===============================|");
			System.out.println("|1. Cadastrar Fotógrafo         |");
			System.out.println("|2. Cadastrar Cliente           |");
			System.out.println("|3. Efetuar Compra do Pacote    |");
			System.out.println("|4. Mostrar contrato            |");
			System.out.println("|===============================|");
			op = dado.nextInt();
		}
		System.out.println();

	}

	// ===================================================================================================================================//

	public static void EfetuarCompra() {

		int quantFotos;
		int horasUsadas;

		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe o código do cliente escolhido:     |");
		System.out.println("|--------------------------------------------|");
		int codC = dado.nextInt();
		int p = 0;

		for (int j = 0; j < clientes.size(); j++) {
			if (clientes.get(j).getCodCliente() == codC) {
				p = j;
			}

			for (int i = 0; i < fotografos.size(); i++) {
				fotografos.get(i).ExibirDadosFotografo();
			}

			System.out.println();
			System.out.println("|------------------------------------------------------|");
			System.out.println("| Informe o código do fotógrafo escolhido:             |");
			System.out.println("|------------------------------------------------------|");
			int codF = dado.nextInt();

			for (int i = 0; i < fotografos.size(); i++) {
				if (fotografos.get(i).getCodFotografo() == codF) {
					System.out.println();
					System.out.println("|------------------------------------------------------|");
					System.out.println("| DADOS PARA A COMPRA DO PACOTE                        |");
					System.out.println();
					System.out.println("|------------------------------------------------------|");
					System.out.println("|Informe a quantidade de fotos:                        |");
					System.out.println("|------------------------------------------------------|");
					quantFotos = dado.nextInt();
					System.out.println();
					System.out.println("|------------------------------------------------------|");
					System.out.println("|Informe as horas usadas na sessão de fotos:           |");
					System.out.println("|------------------------------------------------------|");
					horasUsadas = dado.nextInt();

					produto = new Produto();
					produto.setQuantFotos(quantFotos);
					produto.setHoras(horasUsadas);

					Contrato contrato = new Contrato();
					contrato.setFotografo(fotografos.get(i));
					contrato.setCliente(clientes.get(p));
					contrato.setProduto(produto);
					contratos.add(contrato);
				}
			}
		}

	}

	// ===================================================================================================================================//

	public static void MostrarContrato() throws IOException {

		arquivofisico = new FileWriter("arquivo.txt");
		arquivologico = new PrintWriter(arquivofisico);

		String aux;
		aux = String.format("%23s %-20s %-27s %18s %18s %19s %15s %22s %22s", "| Código do fotógrafo |", "| Modalidades |",
				"| Dia da semana disponível |", "| Preço por foto |", "| Preço por hora |", "| Código do cliente |", "| Preço final |",
				"| Quantidade de fotos |", "| Quantidade de horas |");
		contratos2.add(aux);
		for (int i = 0; i < contratos.size(); i++) {
			aux = String.format("%23s %-20s %-30s %18s %18s %19s %15s %22s %22s",
					contratos.get(i).getFotografo().getCodFotografo(), contratos.get(i).getFotografo().getModalidades(),
					contratos.get(i).getFotografo().getDiasDaSemanaDisponiveis(),
					contratos.get(i).getFotografo().getPrecoFoto(), contratos.get(i).getFotografo().getPrecoHora(),
					contratos.get(i).getCliente().getCodCliente(), contratos.get(i).getProduto().getPrecoFinal(),
					contratos.get(i).getProduto().getQuantFotos(), contratos.get(i).getProduto().getHoras());
			contratos2.add(aux);
		}
		for (int i = 0; i < contratos2.size(); i++) {
			arquivologico.println(contratos2.get(i));
		}
		arquivologico.close();

		for (int i = 0; i < contratos.size(); i++) {
			System.out.println(
					"|========================================================================================================|");
			System.out.println(
					"|                                              CONTRATO                                                  |");
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Código do fotógrafo: " + contratos.get(i).getFotografo().getCodFotografo());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Modalidades: " + contratos.get(i).getFotografo().getModalidades());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println(
					"| Dia da semana disponíveis: " + contratos.get(i).getFotografo().getDiasDaSemanaDisponiveis());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Preço por foto: " + contratos.get(i).getFotografo().getPrecoFoto());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Preço por hora: " + contratos.get(i).getFotografo().getPrecoHora());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Código do cliente: " + contratos.get(i).getCliente().getCodCliente());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Preço final: " + contratos.get(i).getProduto().getPrecoFinal());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Quantidade de fotos: " + contratos.get(i).getProduto().getQuantFotos());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println("| Quantidade de horas: " + contratos.get(i).getProduto().getHoras());
			System.out.println(
					"|--------------------------------------------------------------------------------------------------------|");
			System.out.println(
					"|========================================================================================================|");
			
		}
	}

}
