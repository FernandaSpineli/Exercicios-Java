package com.alga.works.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String args[]) {
		new Application();
	}
	
	public Application() {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Data do último período menstrual (dd/mm/aaaa):");
			String ultimoPeriodoMenstrual = scan.nextLine();

			Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
			PregnancyCalculator calculadora = new PregnancyCalculator(dataUltimoPeriodoMenstrual);

			Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
			System.out.println("Data estimada da concepção: " 
				+ this.formatarData(dataEstimadaConcepcao));

			Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
			System.out.println("Data estimada para parto: " 
				+ this.formatarData(dataEstimadaParto));			
		} catch (ParseException pe) {
			System.out.println("Informe uma data no padrão dd/mm/aaaa.");
		}
		scan.close();
	}
	
	private String formatarData(Date data) {
		DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", 
			new Locale("pt", "br"));
		return formatador.format(data);
		
	}
	
	private Date converterEmData(String texto) throws ParseException {
		String dataTexto = texto;
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataDate = formatador.parse(dataTexto);
		System.out.println(formatador.format(dataDate));
		return dataDate;
	}
	
}
