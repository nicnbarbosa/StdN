package StudioN;

import java.util.Scanner;

public class Cliente extends Pessoa {

	private int CodCliente;

	public Cliente() {
		super();
	}

	public Cliente(int codCliente) {
		this.setCodCliente(codCliente);
	}

	public int getCodCliente() {
		return this.CodCliente;
	}

	public void setCodCliente(int codCliente) {
		this.CodCliente = codCliente;
	}

	public void ExibirDadosCliente() {
		System.out.println();
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("CPF: " + this.getCPF());
		System.out.println("Código: " + this.getCodCliente());
		System.out.println();
	}

	public void CadastroCliente() {
		Scanner dado = new Scanner(System.in);
		String nomeC;
		String telC;
		String emailC;
		String cpfC;
		int codC;

		System.out.println("|============================================|");
		System.out.println("|            CADASTRO CLIENTE                |");
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu nome: ");
		System.out.println("|--------------------------------------------|");
		nomeC = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu telefone: ");
		System.out.println("|--------------------------------------------|");
		telC = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu email: ");
		System.out.println("|--------------------------------------------|");
		emailC = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu CPF: ");
		System.out.println("|--------------------------------------------|");
		cpfC = dado.nextLine();
		System.out.println();
		System.out.println("|--------------------------------------------|");
		System.out.println("| Informe seu código: ");
		System.out.println("|--------------------------------------------|");
		codC = dado.nextInt();
		System.out.println();
		System.out.println("|============================================|");
		System.out.println();
		
		this.setNome(nomeC);
		this.setTelefone(telC);
		this.setEmail(emailC);
		this.setCPF(cpfC);
		this.setCodCliente(codC);
	}

}
