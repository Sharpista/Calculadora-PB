package com.sah.main;

import javax.swing.JOptionPane;

import com.sah.entities.Log;
import com.sah.entities.Calculadora;

public class Main {

	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		boolean continua = true;				
		int opcao;
		Calculadora operacoes = new Calculadora();
		Log log = new Log();
			while(continua == true){
				try {
					
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Op��es \n 1 - SOMA \n 2 - DIVIS�O \n 3 - MULTIPLICA��O \n 4 - SUBTRA��O  \n 5 - LOG \n 6 - SAIR"));	
					if (opcao == 6) {
						continua = false;
					} else if(opcao == 5){
						JOptionPane.showMessageDialog(null, log.retornarLog());
						
					} 
					else  {
						operacoes.primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Entre com um n�mero."));
						operacoes.segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Entre com outro n�mero."));				
						switch (opcao) {
						case 1:
							operacoes.adicao();
							JOptionPane.showMessageDialog(null, operacoes.primeiroNumero + " + " + operacoes.segundoNumero + " = " + operacoes.getResultado());
							break;
						case 2:		
							operacoes.divisao();
							JOptionPane.showMessageDialog(null, operacoes.primeiroNumero + " / " + operacoes.segundoNumero + " = " + operacoes.getResultado());
							break;
						case 3:
							operacoes.multiplicacao();
							JOptionPane.showMessageDialog(null, operacoes.primeiroNumero + " x " + operacoes.segundoNumero + " = " + operacoes.getResultado());
							break;
						case 4:		
							operacoes.subtracao();
							JOptionPane.showMessageDialog(null, operacoes.primeiroNumero + " - " + operacoes.segundoNumero + " = " + operacoes.getResultado());
							break;
						default:
							JOptionPane.showMessageDialog(null, "Favor escolher uma op��o v�lida de 1 � 5.");
							break;
						}
						log.adicionarOperacao(operacoes);
					}
					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERRO: Favor entrar apenas com n�meros.");
				}	
			}
	}
	
}
