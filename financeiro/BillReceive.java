package com.algaworks.cursojava.financeiro;

public class BillReceive extends Bill {

	private Client client;
	
	BillReceive(Client client,String description, double value, String dueDate) {
		this.client = client;
		this.description = description;
		this.value = value;
		this.dueDate = dueDate;
	}
	
	public void Receive() {
		
	}
	
	public BillSituation Cancel() {
	
		if(this.value > 50.000 && this.getBillSituation().equals(BillSituation.CANCELED)) {
			
			System.out.println("-----------------------------------------------------------\n");
  		System.out.println("Contas com o valor acima de R$50.000,00 não podem ser canceladas.");
			System.out.println("Descrição da conta: " + description + " valor: " + value + 
					" vencimento: " + dueDate +	" situação conta: " + billSituation);
			System.out.println("-------------------------------------------------------------");
			return this.billSituation;
			
	  } else {
	  	
	  	System.out.println("-----------------------------------------------------------\n");
  		this.billSituation = BillSituation.CANCELED;
  		System.out.println("Conta cancelada.");
  		System.out.println("Descrição da conta: " + description + " valor: " + value + 
  				" vencimento: " + dueDate + " situacao conta: " + billSituation);
  		System.out.println("-------------------------------------------------------------");
	  	return this.billSituation;
		  }
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}

	@Override
	public void showDetails() {
		System.out.println("==================================================");
		System.out.println("              CONTA A RECEBER");
		System.out.println("==================================================\n");
		System.out.println("Cliente: " + this.getClient().getName());
		System.out.println("Descrição: " + this.getDescription());
		System.out.println("Valor: " + this.getValue());
		System.out.println("Data de vencimento: " + this.getDueDate());
		System.out.println("Situação: " + this.getBillSituation());
		System.out.println("\n==================================================");

	}
}
