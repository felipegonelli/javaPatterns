package builder.a;

public abstract class ProdutoBuilder {

	protected Produto produto;
	
	public ProdutoBuilder() {
		produto = new Produto();
	}
	
	public abstract void buildId();
	public abstract void buildDescricao();
	public abstract void buildMarca();
	public abstract void buildSetor();
	public abstract void buildRastreamento();
	public abstract void buildValor();
	public abstract void buildImposto();
	public abstract void buildMargem();
	public abstract void buildValorVenda();
	public abstract void buildDataFabricacao();
	public abstract void buildDataValidade();

	public Produto getProduto() {
		return produto;
	}
	
}
