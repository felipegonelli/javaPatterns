package builder.a;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EletronicoBuilder extends ProdutoBuilder {

	@Override
	public void buildId() {
		produto.id = 10;		
	}

	@Override
	public void buildDescricao() {
		produto.descricao = "Lavadora de Louças";
	}

	@Override
	public void buildMarca() {
		produto.marca = "XPTO Tech";
	}

	@Override
	public void buildSetor() {
		produto.setor = "Eletrodoméstico";
	}

	@Override
	public void buildRastreamento() {
		produto.rastreamento = "003ET05C22";
	}

	@Override
	public void buildValor() {
		produto.valor = new BigDecimal(2650.38);
	}

	@Override
	public void buildImposto() {
		produto.imposto = new BigDecimal(1589.62);
	}
	
	@Override
	public void buildMargem() {
		produto.margemLucro = new BigDecimal(60);
	}
	
	@Override
	public void buildValorVenda() {
		BigDecimal v = produto.valor.multiply(new BigDecimal(1).add(produto.margemLucro.divide(new BigDecimal(100))));
		produto.valorVenda = v.add(produto.imposto);
	}

	@Override
	public void buildDataFabricacao() {
		produto.dataFabricacao = LocalDate.of(2017, 06, 01);	
	}

	@Override
	public void buildDataValidade() {
		produto.dataValidade = null;
	}

}
