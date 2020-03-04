package com.sah.main;

import javax.swing.JOptionPane;

import com.sah.entities.Logs;
import com.sah.entities.Calculadora;

public class Main {

	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		boolean continua = true;				
		int opcao;
		Calculadora operacoes = new Calculadora();

			while(continua == true){
				try {
					
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Op��es \n 1 - SOMA \n 2 - DIVIS�O \n 3 - MULTIPLICA��O \n 4 - SUBTRA��O  \n 5 - LOG \n 6 - SAIR"));	
					if (opcao == 6) {
						continua = false;
					} else if(opcao == 5){
						JOptionPane.showMessageDialog(null, operacoes.getLog());
						
					} 
					else  {
						operacoes.setPrimeiroNumero(Double.parseDouble(JOptionPane.showInputDialog("Entre com um n�mero.")));
						operacoes.setSegundoNumero(Double.parseDouble(JOptionPane.showInputDialog("Entre com outro n�mero.")));				
						switch (opcao) {
						case 1:
							operacoes.adicao();
							break;
						case 2:		
							operacoes.divisao();
							break;
						case 3:
							operacoes.multiplicacao();
							break;
						case 4:		
							operacoes.subtracao();
							break;
						default:
							JOptionPane.showMessageDialog(null, "Favor escolher uma op��o v�lida de 1 � 5.");
							break;
						}
						
					}
					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERRO: Favor entrar apenas com n�meros.");
				}	
			}
	}
	
}
