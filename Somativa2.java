package Formativa; //pacote em que está o  código

import java.util.Scanner; //chama o scanner

public class Somativa2 { //nome do código/classe

	public static void main(String[] args) { //função principal/main

		Scanner ler = new Scanner(System.in); //incia o Scanner ler

		double A,b,h; //Variáveis do tipo real |ENTRADA

		System.out.println("Qual a altura do seu triângulo: "); //pede a altura do triângulo
		h=ler.nextDouble(); //lê  o dado e armazena na variável h

		System.out.println("Qual a base do seu triângulo: ");//pede a base do triângulo
		b=ler.nextDouble();//lê o dado e armazena na variável b

		A=(b*h)/2; //cálculo da área do triângulo |PROCESSAMENTO

		System.out.println("A área do seu triângulo é: "+A); //mostra ao usuário | SAÍDA

		ler.close(); //fecha o scanner

	}

}