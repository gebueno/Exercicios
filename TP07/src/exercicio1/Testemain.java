package exercicio1;

import java.util.InputMismatchException;

public class Testemain {

	public static void main(String[] args) {
		
		System.out.println("Desenvolvido por: Gerson Pereira Bueno RA: D827DF-0 Turma: 2SI ");
		
		Vetores opera = new Vetores();
		
		try {			
			opera.conta();			
			
			for (int i = 0; i < opera.getB().length; i++) {				
				System.out.println("Elemento " + (i+1) + " do vetor b é: " + opera.getB()[i]);				
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
