package exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divmain {

	public static void main(String[] args) {
		
		System.out.println("Desenvolvido por: Gerson Pereira Bueno RA: D827DF-0 Turma: 2SI ");
		
		try {
			Scanner ler = new Scanner(System.in);		
			VetoresDiv opera = new VetoresDiv();
			
			for (int i=0; i < 15; i++) {
			    System.out.println("Informe o valor do " + (i+1) + "� elemento de A ");
			    opera.getA()[i] = ler.nextDouble();
			    }
			
			opera.conta();			
			
			for (int i = 0; i < 15; i++) {				
				System.out.println("O numero digitado �: " + opera.getA()[i] + " o valor em B na "+ (i+1) +"� posi��o �: " + opera.getB()[i]);
			}					
		}
		
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O seu array est� estourado"); 
		}
		catch (InputMismatchException e) {
			System.out.println("Digite apenas n�meros reais");
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro inesperado! Favor reiniciar o programa.");			
		}
		
	}

}


