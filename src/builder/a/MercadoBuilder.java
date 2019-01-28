package builder.a;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MercadoBuilder extends ProdutoBuilder {

	@Override
	public void buildId() {
		produto.id = 1;		
	}

	@Override
	public void buildDescricao() {
		produto.descricao = "Biscoito de Chocolate";
	}

	@Override
	public void buildMarca() {
		produto.marca = "XPTO";
	}

	@Override
	public void buildSetor() {
		produto.setor = "Doces/Biscoitos";
	}

	@Override
	public void buildRastreamento() {
		produto.rastreamento = "003BX01F09";
	}

	@Override
	public void buildValor() {
		produto.valor = new BigDecimal(1.10);
	}

	@Override
	public void buildImposto() {
		produto.imposto = new BigDecimal(0.85);
	}
	
	@Override
	public void buildMargem() {
		produto.margemLucro = new BigDecimal(55);
	}
	
	@Override
	public void buildValorVenda() {
		BigDecimal v = produto.valor.multiply(new BigDecimal(1).add(produto.margemLucro.divide(new BigDecimal(100))));
		produto.valorVenda = v.add(produto.imposto);
	}

	@Override
	public void buildDataFabricacao() {
		produto.dataFabricacao = LocalDate.of(2018, 10, 20);	
	}

	@Override
	public void buildDataValidade() {
		produto.dataValidade = produto.dataFabricacao.plusMonths(12);
	}

}
