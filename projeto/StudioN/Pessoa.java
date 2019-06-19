package StudioN;

public class Pessoa {

	private String Nome;
	private String Telefone;
	private String Email;
	private String CPF;

	public Pessoa() {

	}

	public Pessoa(String nome, String tel, String email, String cpf) {
		this.setNome(nome);
		this.setTelefone(tel);
		this.setEmail(email);
		this.setCPF(cpf);

	}

	public String getNome() {
		return this.Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getTelefone() {
		return this.Telefone;
	}

	public void setTelefone(String tel) {
		this.Telefone = tel;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String cpf) {
		this.CPF = cpf;
	}

}
