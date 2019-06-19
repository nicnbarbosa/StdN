package StudioN;

import java.util.Date;

public class Contrato {

	private Cliente cliente;
	private Fotografo fotografo;
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

	public void DadosContrato() {
		System.out.println("================================================");
		System.out.println("              DADOS DO CONTRATO                 ");
		System.out.println("------------------------------------------------");
		System.out.println("FOTÓGRAFO                                       ");
		System.out.println();
		System.out.println(fotografo.);
		System.out.println("------------------------------------------------");
		System.out.println("CLIENTE                                         ");
		System.out.println();
		System.out.println(cliente.ExibirDadosCliente());
		System.out.println("------------------------------------------------");
		System.out.println("PRODUTO                                         ");
		System.out.println();
		System.out.println(produto.ExibirDadosProduto());
		System.out.println(produto.ExibirPrecoFinal());
		System.out.println("------------------------------------------------");
		System.out.println("DATA E HORÁRIO");
		System.out.println();
		System.out.println("Data: ");
		System.out.println("Hora: " + data.getTime());
		System.out.println("================================================");

	}

}
