package builder;

import java.math.BigDecimal;
import java.time.LocalDate;

import builder.a.EletronicoBuilder;
import builder.a.MercadoBuilder;
import builder.a.Supermercado;

public class Main {

	public static void main(String[] args) {
		// 1
		System.out.println(">>>>>>>>>>>>>Implementação 1");
		
		Supermercado supermercado = new Supermercado(new MercadoBuilder());
		supermercado.construirProduto();
		builder.a.Produto p1 = supermercado.getProduto();
		System.out.print(p1);
		
		supermercado = new Supermercado(new EletronicoBuilder());
		supermercado.construirProduto();
		p1 = supermercado.getProduto();
		System.out.print(p1);
	
		// 2
		System.out.println("\n>>>>>>>>>>>>>Implementação 2");
		
		BigDecimal v = new BigDecimal(1.10).multiply(new BigDecimal(1).add(new BigDecimal(55).divide(new BigDecimal(100))));
		builder.b.Produto pB1 = new builder.b.Produto.Builder(1)
				.descricao("Biscoito de Chocolate")
				.marca("XPTO")
				.setor("Doces/Biscoitos")
				.rastreamento("003BX01F09")
				.valor(new BigDecimal(1.10))
				.imposto(new BigDecimal(0.85))
				.margemLucro(new BigDecimal(55))
				.valorVenda(v.add(new BigDecimal(0.85)))
				.dataFabricacao(LocalDate.of(2018, 10, 20))	
				.dataValidade(LocalDate.of(2018, 10, 20).plusMonths(12))
				.build();
		System.out.print(pB1);
		
		BigDecimal v2 = new BigDecimal(2650.38).multiply(new BigDecimal(1).add(new BigDecimal(60).divide(new BigDecimal(100))));
		builder.b.Produto pB2 = new builder.b.Produto.Builder(10)
				.descricao("Lavadora de Louças")
				.marca("XPTO Tech")
				.setor("Eletrodomésticos")
				.rastreamento("003ET05C22")
				.valor(new BigDecimal(2650.38))
				.imposto(new BigDecimal(1589.62))
				.margemLucro(new BigDecimal(60))
				.valorVenda(v2.add(new BigDecimal(1589.62)))
				.dataFabricacao(LocalDate.of(2017, 06, 01))
				.build();
		System.out.print(pB2);
	}

}
