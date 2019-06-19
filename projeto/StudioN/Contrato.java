package StudioN;

import java.util.Date;

public class Contrato {

	private Fotografo fotografo;
	private Cliente cliente;
	private Produto produto;
	private Date data;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Fotografo getFotografo() {
		return fotografo;
	}

	public void setFotografo(Fotografo fotografo) {
		this.fotografo = fotografo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date MostrarDataAtual() {
		Date data = new Date();
		System.out.println(data);
		return data;
	}
	
	public void DadosContrato(Fotografo f, Cliente c, Produto p, Date d) {
		System.out.println("Contrato");
		System.out.println();
		System.out.println("- Dados do Fotógrafo: ");
		f.ExibirDadosFotografo();
		System.out.println("- Dados do Cliente: ");
		c.ExibirDadosCliente();
		System.out.println("- Dados do Pacote: ");
		p.ExibirDadosProduto();
		System.out.println("- Preço Final: ");
		p.ExibirPrecoFinal();
		System.out.println("- Data: ");
		this.MostrarDataAtual();
		
	}

}
