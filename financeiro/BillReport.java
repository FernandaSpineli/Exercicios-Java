package com.algaworks.cursojava.financeiro;

public class BillReport {

	public void showListing(Bill[] bills) {

		System.out.println("\n=======================================================");
		System.out.println("                  RELATORIO DE CONTAS                    ");
		System.out.println("=======================================================\n");
		
    for (int i = 0; i < bills.length; i++) {
			
			  bills[i].showDetails();
			
		}	
	}
}

