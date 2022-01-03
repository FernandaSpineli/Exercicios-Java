package com.alga.works.java.poo.collections;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

	//ARMAZENA UMA LISTA DE POLITICOS POR ESTADO DA FEDERAÇÃO
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		
		//RECUPERA A LISTA DE POLITICOS PARA UM PARTIDO
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		//SE NÃO EXISTIR UMA LISTA DE POLITICOS PARA O PARTIDO INFORMADO,
		//DEVEMOS INSTANCIAR UMA NOVA LISTA(POIS É A PRIMEIRA INCLUSÃO NESTE PARTIDO)
		
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		//ADICIONA O POLITICO RECEBID0 COMO PARAMETRO À LISTA DE POLITICOS
		politicos.add(politico);
		
		//ADICIONA A LISTA DE POLITICOS AO MAPA DE PARTIDOS USANDO COMO CHAVE O NOME DO PARTIDO
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		List<Politico> listaPoliticos = this.partidosPoliticos.get(partidoPolitico);

		System.out.println("-------------------------------------------------------------------");
		System.out.println("Partido político: " + partidoPolitico);

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		BigDecimal totalSalarios = new BigDecimal(0d);

		for (Politico politico : listaPoliticos) {
			System.out.println("Político: " + politico.getNome() + " - cargo: " + 
					politico.getCargo().getDescricao() + " " + 
					formatador.format(politico.getCargo().getSalario().doubleValue()));

			totalSalarios = totalSalarios.add(politico.getCargo().getSalario());
		}// FIM DO FOR
		return totalSalarios;
	}// FIM DO METODO
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {

List<Politico> listaPoliticos = this.partidosPoliticos.get(partidoPolitico);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Partido político: " + partidoPolitico);

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		BigDecimal totalSalarios = new BigDecimal(0d);

		for (Politico politico : listaPoliticos) {
		if (politico.getCargo() == cargo) {

				System.out.println("Político: " + politico.getNome() + " cargo: " +
				  politico.getCargo().getDescricao()	+ " salário: " + 
				  formatador.format(politico.getCargo().getSalario().doubleValue()));

				totalSalarios = totalSalarios.add(politico.getCargo().getSalario());
			}// FIM DO IF
		}// FIM DO FOR
		return totalSalarios;
	}// FIM DO METODO
}
