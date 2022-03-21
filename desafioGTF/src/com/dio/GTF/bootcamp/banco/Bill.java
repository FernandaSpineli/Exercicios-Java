package com.dio.GTF.bootcamp.banco;

public class Bill {
    public String description;
    public double value;
    public String dueDate;
    public BillSituation billSituation;

    Bill() {
        this.billSituation = BillSituation.PENDING;
    }

    public abstract void showDetails();

    public BillSituation Cancel() throws OperationBillException {
        if(this.getBillSituation().equals(BillSituation.PAID) ||
                this.getBillSituation().equals(BillSituation.CANCELED)) {
            throw new OperationBillException("Conta paga ou cancelada não pode ser cancelada." +
                    this.getBillSituation());
        }else {

            //SOMENTE CONTA PENDENTE PODE SER CANCELADA

            System.out.println("-----------------------------------------------------------\n");
            this.billSituation = BillSituation.CANCELED;
            System.out.println("Conta cancelada.");
            System.out.println("Descrição da conta: " + description + " valor: " + value +
                    " vencimento: " + dueDate + " situacao conta: " + billSituation);
            System.out.println("-------------------------------------------------------------");
            return this.billSituation;
        }
    }

    // getters e setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public BillSituation getBillSituation() {
        return billSituation;
    }
}
