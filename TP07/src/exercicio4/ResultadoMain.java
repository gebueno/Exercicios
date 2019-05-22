package exercicio4;
import java.text.DecimalFormat;

import java.util.InputMismatchException;

public class ResultadoMain {

	public static void main(String[] args) {

		MediaAlunos conta = new MediaAlunos();		
		conta.mediat(conta.getNotasAlunos());
		
		
		  
		try {
		
		for (int i = 0; i < conta.getNotasAlunos().length; i++) {
			System.out.println("O aluno "+ (i+1)+ " Teve a nota: " + conta.getNotasAlunos()[i]);		
		}
		
		DecimalFormat df1 = new DecimalFormat("0.##");
		String dx = df1.format(conta.getMediatotal());		
		
		System.out.println("\nA m�dia total da turma �: " + (dx));
		
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
