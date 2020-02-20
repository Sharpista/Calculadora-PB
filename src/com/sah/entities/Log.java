package com.sah.entities;

import java.util.ArrayList;
import java.util.List;

public class Log {

	private List<String> listaDeOperacoes = new ArrayList<String>();

	public List<String> getListaDeOperacoes() {
		return listaDeOperacoes;
	}
	
	public void adicionarOperacao(String operacaoService) {
		listaDeOperacoes.add(operacaoService);
	}
	public String retornarLog() {
		
		StringBuilder sb = new StringBuilder();
		
		for (String string : listaDeOperacoes) {
			sb.append(string + "\n");
			return string;
		}
		
		return null;
		
	}
	
	
}
