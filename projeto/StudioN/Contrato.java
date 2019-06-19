package StudioN;

import java.util.Date;

public class Contrato {

	private Fotografo fotografo;
	private Cliente cliente;
	private Produto produto;

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

	public Date MostrarDataAtual() {
		Date data = new Date();
		System.out.println(data);
		return data;
	}

}
