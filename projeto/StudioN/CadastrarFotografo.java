package StudioN;

import java.util.Scanner;
import java.util.ArrayList;
public class CadastrarFotografo {

	private static Scanner dado;
	private static String nome; 
	private static String tel;
	private static String email;
	private static String cpf;
	private static String cod;
	private static ArrayList <String> modalidades;
	private static String historicoProjetos;
	private static String horasTrabalhadas;
	private static String diasDisponiveis;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dado = new Scanner(System.in);
		int n;
		String mod;
		int dias;
		
		// Tela de Cadastro
				System.out.println("============================================");
				System.out.println("           CADASTRO FOT�GRAFO               ");
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe seu nome: ");
				nome = dado.nextLine();
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe seu telefone: ");
				tel = dado.nextLine();
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe seu email: ");
				email = dado.nextLine();
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe seu CPF: ");
				cpf = dado.nextLine();
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe seu c�digo: ");
				cod = dado.nextLine();
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe quantas s�o as suas especializa��es:");
				n = dado.nextInt();
				System.out.println();
				System.out.println("Informe quais s�o as suas especializa��es:  ");
				mod = dado.nextLine();
				for (int i = 0; i < n; i++) {
					modalidades.add(mod);
					
					mod = dado.nextLine();
				}
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Informe os dias em que est� dispon�vel:");
				dias = Integer.parseInt(dado.nextLine());
				diasDisponiveis = dias;
				System.out.println();
				System.out.println("============================================");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
