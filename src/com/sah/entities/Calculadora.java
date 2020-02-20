package com.sah.entities;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Calculadora implements IOperacoes {


	private double resultado = 0.0;
	public double primeiroNumero;
	public double segundoNumero;
	private Log log;
	
	
	public Calculadora(double resultado, double primeiroNumero, double segundoNumero) {
		super();
		this.resultado = resultado;
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
		log = new Log();
	}


	public double getResultado() {
		return resultado;
	}

	
	public double getPrimeiroNumero() {
		return primeiroNumero;
	}


	public void setPrimeiroNumero(double primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}


	public double getSegundoNumero() {
		return segundoNumero;
	}


	public void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}


	@Override
	public double adicao() {
		String op = null; 
		resultado = primeiroNumero + segundoNumero;
		op = primeiroNumero + "+" + segundoNumero + "=" + resultado;
		log.adicionarOperacao(op);
		return resultado; 
		
	}

	@Override
	public double divisao() {
		try {
			resultado = primeiroNumero / segundoNumero;
		} catch (ArithmeticException  e) {
			JOptionPane.showMessageDialog(null, "ERRO: Divisão por 0.");	
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
