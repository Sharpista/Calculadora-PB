package com.sah.entities;

import javax.swing.JOptionPane;

import com.sah.composicao.OperacaoComposicao;

public class OperacaoService implements IOperacoes {

	private double resultado = 0.0;
	public double primeiroNumero;
	public double segundoNumero;

	OperacaoComposicao opComposicao = new OperacaoComposicao();
	
	public double getResultado() {
		return resultado;
	}

	@Override
	public double adicao() {
		resultado = primeiroNumero + segundoNumero;
		return resultado;
		
	}

	@Override
	public double divisao() {
		try {
			resultado = primeiroNumero / segundoNumero;
		} catch (ArithmeticException  e) {
			JOptionPane.showMessageDialog(null, "ERRO: Divis�o por 0.");	
		}
		return resultado;
	}

	@Override
	public double multiplicacao() {
		resultado = primeiroNumero * segundoNumero;
		return resultado;
	}

	@Override
	public double subtracao() {
		resultado = primeiroNumero - segundoNumero;
		return resultado;
	}
	
	
}
