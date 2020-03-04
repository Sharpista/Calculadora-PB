package com.sah.entities;

import java.util.ArrayList;
import java.util.List;

public class Logs {

	private List<String> listaDeOperacoes = new ArrayList<String>();
	
	
	public void adicionarOperacao(String string) {
		listaDeOperacoes.add(string);
	}
	public StringBuilder retornarLog() {
		StringBuilder sb = new StringBuilder();
		for(String string :listaDeOperacoes) {
			
			sb.append(string + "\n");
		}
		
		return sb;
		
	}
	
	
}
