package exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercicio1.Vetores;

public class Divmain {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(System.in);		
			Vetores opera = new Vetores();
			
			for (int i=0; i < 15; i++) {
			    System.out.println("Informe o valor do " + (i+1) + "º elemento de A ");
			    opera.getA()[i] = ler.nextDouble();
			    }
			
			opera.conta();			
			
			for (int i = 0; i < 15; i++) {				
				System.out.println("O numero digitado é: " + opera.getA()[i] + " o valor em B na "+ (i+1) +"ª posição é: " + opera.getB()[i]);
			}					
		}
		
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O seu array está estourado"); 
		}
		catch (InputMismatchException e) {
			System.out.println("Digite apenas números reais");
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro inesperado! Favor reiniciar o programa.");			
		}
		
	}

}


