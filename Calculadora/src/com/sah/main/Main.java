package com.sah.main;

import javax.swing.JOptionPane;

import com.sah.entities.OperacaoVO;

public class Main {

	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		boolean continua = true;				
		
		while(continua == true){
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Op��es \n  1 - SOMAR \n 2 - DIVIS�O \n 3 - MULTIPLICA��O \n 4 - SUBTRA��O \n 5 - SAIR"));
			
			if (opcao == 5) {
				continua = false;
			} else {
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com um n�mero."));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com outro n�mero."));			
				OperacaoVO operacoes = new OperacaoVO();
				
				switch (opcao) {
				case 1:
					
					operacoes.adicao(num1, num2);
					break;
				case 2:		
					operacoes.divisao(num1, num2);
					break;
				case 3:
					operacoes.multiplicacao(num1, num2);
					break;
				case 4:		
					operacoes.subtracao(num1, num2);
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Favor escolher uma op��o v�lida de 1 � 5.");
					break;
				}
			}
		}
		
	}
	
}
