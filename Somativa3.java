package Formativa; //o pacote em que está o código

import java.util.Scanner; //traz o scanner para poder ser utilizado

public class Somativa3 { //o nome do código/classe

	public static void main(String[] args) {  //todo código fica dentro da função principal(main)

		Scanner ler = new Scanner (System.in); //inicia o Scanner ler

		int d; //armazena a váriavel do tipo inteiro que se chama "d" |ENTRADA
		
		System.out.println("Qual dia da semana você quer saber o nome?"); //pergunta ao usuário
		
		d=ler.nextInt(); //lê a variável

		switch (d) {  //estrutura de condição em que se o usuário digita x informa na tela y |CONDIÇÃO E SÁIDAS
		case 1:   //caso o usuário digite 1
			System.out.println("Domingo"); //vai mostrar domingo
			break; //encerra essa condição
		case 2: //a lógica continua
			System.out.println("Segunda-feira");
			break;
		case 3:  
			System.out.println("Terça-feira");
			break;
		case 4:  
			System.out.println("Quarta-feira");
			break;
		case 5:  
			System.out.println("Quinta-feira");
			break;
		case 6:  
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");  
			break;
		default: //similar ao else ele sempre deve terminar essa estrutura
			System.out.println("Dia inválido");
			break;
		}

		ler.close(); //fecha o scanner

	}
}
