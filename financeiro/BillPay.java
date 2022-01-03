package com.algaworks.cursojava.financeiro;

public class BillPay extends Bill {
	
	public Provider provider;
	
	BillPay(Provider provider,String description, double value, String dueDate){
		this.provider = provider;
		this.description = description;
		this.value = value;
		this.dueDate = dueDate;
	}
	
	 public void Pay() {
	  	
	  	if(this.getBillSituation().equals(BillSituation.CANCELED)) {
	  		
	  		System.out.println("-----------------------------------------------------------\n");
	  		System.out.println("Pagamento não efetuado. Esta conta está CANCELADA.");
				System.out.println("Descrição da conta: " + description + " valor: " + value +
						" vencimento: " + dueDate + " fornecedor: " + provider.name + 
						" situacao conta: " + billSituation);
				System.out.println("-------------------------------------------------------------");
				
	  	}else if (this.getBillSituation().equals(BillSituation.PAID)) {
	  		
	  		System.out.println("-----------------------------------------------------------\n");
	  		System.out.println("Pagamento não efetuado. Esta conta já foi PAGA.");
				System.out.println("Descrição da conta: " + description + " valor: " + value + 
						" vencimento: " + dueDate + " fornecedor: " + provider.name + 
						" situacao conta: " + billSituation);
				System.out.println("-------------------------------------------------------------");

	  	}else {
	  		this.billSituation = BillSituation.PAID;

				System.out.println("-----------------------------------------------------------\n");
				System.out.println("Pagamento efetuado:");
				System.out.println("Descrição da conta: " + description + " valor: " + value + 
						" vencimento: " + dueDate + " fornecedor: " + provider.name +
						" situacao conta: " + billSituation);
				System.out.println("-----------------------------------------------------------");
	  	}
	  }

	@Override
	public void showDetails() {
		System.out.println("==================================================");
		System.out.println("                CONTA A PAGAR");
		System.out.println("===================================================\n");
		System.out.println("Fornecedor: " + this.getProvider().getName());
		System.out.println("Descrição: " + this.getDescription());
		System.out.println("Valor: " + this.getValue());
		System.out.println("Data de vencimento: " + this.getDueDate());
		System.out.println("Situação: " + this.getBillSituation());
		System.out.println("\n====================================================");
	}
	
	//getters e setters

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
}
