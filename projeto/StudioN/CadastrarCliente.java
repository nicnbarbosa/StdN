package StudioN;

import java.util.Scanner;

public class CadastrarCliente {

	private static Scanner dado;
	private static String nome;
	private static String tel;
	private static String email;
	private static String cpf;
	private static String cod;

	public static void main(String[] args) {

		dado = new Scanner(System.in);

		// Tela de Cadastro
		System.out.println("============================================");
		System.out.println("             CADASTRO CLIENTE               ");
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Informe seu nome: ");
		nome = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu telefone: ");
		tel = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu email: ");
		email = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu CPF: ");
		cpf = dado.nextLine();
		System.out.println();
		System.out.println("Informe seu código: ");
		cod = dado.nextLine();
		System.out.println();
		System.out.println("============================================");

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setTelefone(tel);
		cliente.setEmail(email);
		cliente.setCPF(cpf);
		cliente.setCodCliente(cod);

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

}
