package com.sah.entities;

import javax.swing.JOptionPane;

public class Calculadora implements IOperacoes {


	private double resultado = 0.0;
	private double primeiroNumero;
	private double segundoNumero;
	private Logs logs;
	
	
	public Calculadora() {
		logs = new Logs();
	}
	public Calculadora(double resultado, double primeiroNumero, double segundoNumero) {
		super();
		this.resultado = resultado;
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
		logs = new Logs();
	}

	@Override
	public void adicao() {
		
		resultado = primeiroNumero + segundoNumero;
		String op = null;
		op =  primeiroNumero + "+" + segundoNumero + "=" + resultado;
		logs.adicionarOperacao(op);
		
	}

	@Override
	public double divisao() {
		try {
			String op = null;
			resultado = primeiroNumero / segundoNumero;
			op = primeiroNumero + "/" + segundoNumero + "=" + resultado;
			logs.adicionarOperacao(op);
		} catch (ArithmeticException  e) {
			JOptionPane.showMessageDialog(null, "ERRO: Divisão por 0.");	
		}
		return resultado;
	}

	@Override
	public double multiplicacao() {
		String op = null;
		resultado = primeiroNumero * segundoNumero;
		op = primeiroNumero + "*" + segundoNumero + "=" + resultado;
		logs.adicionarOperacao(op);
		return resultado;
	}

	@Override
	public double subtracao() {
		String op = null;
		resultado = primeiroNumero - segundoNumero;
		op = primeiroNumero + "-" + segundoNumero + "=" + resultado;
		logs.adicionarOperacao(op);
		return resultado;
	}
	public StringBuilder getLog() {
		return logs.retornarLog();
		
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
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public Logs getLogs() {
		return logs;
	}
	public void setLogs(Logs logs) {
		this.logs = logs;
	}


	
}
