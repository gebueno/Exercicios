package exercicio6;

import java.util.InputMismatchException;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Desenvolvido por: Gerson Pereira Bueno RA: D827DF-0 Turma: 2SI ");
		
		Separar obj = new Separar();
		obj.separaImparPar();
		
		try {
		System.out.print("Os números pares são: ");
		for (int i = 0; i < obj.getB().length; i++) {			
			System.out.print(obj.getB()[i]);			
		}
		System.out.println("");
		
		System.out.print("Os números ímpares são: ");
		for (int i = 0; i < obj.getC().length; i++) {
			System.out.print(obj.getC()[i]);			
		}
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O seu array está estourado"); 
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro inesperado! Favor reiniciar o programa.");			
		}
	}	
}


