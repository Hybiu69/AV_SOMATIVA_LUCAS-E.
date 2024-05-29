package Formativa; //pacote em que está o código

import java.util.Scanner; //chama o scanner

public class Somativa1 { //nome do código/classe

	public static void main(String[] args) { //função principal/man

		double a,b,soma,sub,mult,div; //variáveis do tipo real |ENTRADA

		Scanner ler = new Scanner(System.in); //inicia o Scanner ler

		System.out.println("Insira o valor a: "); //pede um valor ao usuário
		a=ler.nextDouble(); //lê o dado e armazena na váriavel

		System.out.println("Insira o valor b: ");//pede outro valor
		b=ler.nextDouble();//armazena em OUTRA variável

		soma=a+b; //cálculo de adição |PROCESSAMENTO

		sub=a-b; //cálculo de subtração

		mult=a*b;//cálculo de multiplicação

		div=a/b;//cálculo de divisão

		System.out.println("O resultado das quatro operações aritimetricas são: "); //mostra os resultados para o usuário | SAÍDA
		System.out.println("");
		System.out.println("A soma de a e b é: "+soma);
		System.out.println("A diferença de a e b é: "+sub);
		System.out.println("O produto de a e b é: "+mult);
		System.out.println("O quociente de a sobre b é: "+div);

		ler.close(); //fecha o scanner
	}

}