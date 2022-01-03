package com.algaworks.cursojava.financeiro;

public class Application {
  public static void main(String[] args) {
	
 		Provider imobiliaria = new Provider();
 		imobiliaria.setName("Casa & Cia Negócios Imobiliários");
 		Provider mercado = new Provider();
 		mercado.setName("Mercado do João");
 		
 		Client atacadista = new Client();
 		atacadista.setName("Triângulo Quadrado Atacadista");
 		Client telecom = new Client();
 		telecom.setName("FoneNet Telecomunicações");
 		
 		BillPay contaPagar1 = new BillPay(imobiliaria, "Apartamento", 1230d, "10/05/2022");
 		
 		BillPay contaPagar2 = new BillPay(mercado, "Compras do mês", 390d, "19/05/2022");
 		
 		BillReceive contaReceber1 = new BillReceive(null, null, 0, null);
 		contaReceber1.setDescription("Desenvolvimento de projeto de logística em Java");
 		contaReceber1.setValue(89500d);
 		contaReceber1.setDueDate("23/05/2012");
 		contaReceber1.setClient(atacadista);		
 		
 		BillReceive contaReceber2 = new BillReceive(telecom, "Manutenção em sistema de conta online", 
 			53200d, "13/05/2012");
 		
 		contaPagar1.Pay();
 		try {
 			contaPagar2.Cancel();
 		} catch (OperationBillException msg) { 
 			System.out.println("Você executou uma operação ilegal: " + msg.getMessage());
 		}

 		contaReceber1.Receive();
 		contaReceber2.Cancel();
 }
}
