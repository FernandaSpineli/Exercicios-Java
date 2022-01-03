package com.algaworks.cursojava.financeiro;

public class ApplicationPtTwo {

	public static void main(String[] args) {
		
		
		Provider imobiliaria = new Provider();
		imobiliaria.setName("Casa & Cia Negócios Imobiliários");
		Provider mercado = new Provider();
		mercado.setName("Mercado do João");
		
		
		Client atacadista = new Client();
		atacadista.setName("Triângulo Quadrado Atacadista");
		Client telecom = new Client();
		telecom.setName("FoneNet Telecomunicações");
		
		
		BillPay contaPagar1 = new BillPay(null, null, 0, null);
		contaPagar1.setDescription("Aluguel da matriz");
		contaPagar1.setValue(1230d);
		contaPagar1.setDueDate("10/05/2012");
		contaPagar1.setProvider(imobiliaria);
		BillPay contaPagar2 = new BillPay(mercado, "Compras do mês", 390d, "19/05/2012");
		
		
		BillReceive contaReceber1 = new BillReceive(null, null, 0, null);
		contaReceber1.setDescription("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValue(89500d);
		contaReceber1.setDueDate("23/05/2012");
		contaReceber1.setClient(atacadista);
		BillReceive contaReceber2 = new BillReceive(telecom, "Manutenção em sistema de conta online", 
			53200d, "13/05/2012");

		
		BillReport relatorio = new BillReport();
		Bill[] contas = new Bill[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		
		relatorio.showListing(contas);
	}

}
