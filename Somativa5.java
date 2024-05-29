package Formativa; //pacote em que está o código

import java.util.Scanner; //chama o scanner

public class Somativa5 { //nome do código

	public static void main(String[] args) { //função principal/main


		String g []= new String [6]; //vetor do tipo string com 6 "espaços" |ENTRADA

		Scanner ler = new Scanner(System.in); //inicia o scanner ler

		for(int i=0;i<6;i++) { //estrutura de repetição |ESTRUTURA DE REPETIÇÃO

			System.out.println("Qual o nome do carro que vai estacionar?"); //Pergunta ao usuário o carro
			 g[i]= ler.next(); //guarda o nome dentro do vetor
		}
		
		System.out.println("");
		
		for(int i=0;i<6;i++) { //estrutura de repetição |SAÍDA
			 System.out.println(g[i]);
		}

		ler.close();
	}

}
