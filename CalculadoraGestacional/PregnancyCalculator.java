package com.alga.works.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PregnancyCalculator {

	private Date dataUltimoPeriodoMenstrual;

	// CONSTRUTOR
	public PregnancyCalculator(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
  public Date calcularDataEstimadaConcepcao() {
  	Calendar calendarConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		calendarConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		Date dataConcepcao = calendarConcepcao.getTime();
		return dataConcepcao;
	}
	
	public Date calcularDataEstimadaParto() {
		Calendar calendarParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		calendarParto.add(Calendar.WEEK_OF_YEAR, 40);
		Date dataParto = calendarParto.getTime();
		return dataParto;
	}
}
