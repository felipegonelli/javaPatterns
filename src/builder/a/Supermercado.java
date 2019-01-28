package builder.a;

//Director
public class Supermercado {

	protected ProdutoBuilder produto;
	
	public Supermercado(ProdutoBuilder produto) {
		this.produto = produto;
	}

	public void construirProduto() {
		produto.buildId();
		produto.buildDescricao();
		produto.buildMarca();
		produto.buildSetor();
		produto.buildRastreamento();
		produto.buildValor();
		produto.buildImposto();
		produto.buildMargem();
		produto.buildValorVenda();
		produto.buildDataFabricacao();
		produto.buildDataValidade();
	}
	
	public Produto getProduto() {
		return produto.getProduto();
	}

}
