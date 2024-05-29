package Formativa; //pacote em que está o código

import java.util.Scanner; //chama o scanner

public class Somativa4 { //nome do código/classe

	public static void main(String[] args) { //função principal/main

		Scanner ler = new Scanner(System.in); //incia o Scanner ler

		int s=0; //variável tipo inteiro (soma inica com o valor 0)
		int n[] = new int [15]; //vetor com 15 "espaços"

		for(int i=0; i<15;i++) { //estrutura de condição ( quando o índice for igual ou maior a 15 para a ação)

			System.out.println("Informe os Valores "+i); //pede para o usuário informar o valor
			n[i]=ler.nextInt(); //armazena os dados no vetor
			
			s=s+n[i]; //soma os números (soma = 0+x)
		}
		
		System.out.println("Resultado da soma desses números é: "+s); //mostra o resultado dá soma
		
		ler.close(); //fecha o scanner
	}

}