package exercicio5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ResultadoMain {

	public static void main(String[] args) {
				
		Scanner ler = new Scanner(System.in);
		
		try {
			for (int i = 0; i < MediaAlunos.getNotasAlunos().length; i++) {
				System.out.println("Digite a nota do " + (i+1) + "º aluno:");
			MediaAlunos.getNotasAlunos()[i] = ler.nextDouble();					
			}
		
		for (int i = 0; i < MediaAlunos.getNotasAlunos().length; i++) {
			System.out.println("O aluno "+ (i+1)+ " Teve a nota: " + MediaAlunos.getNotasAlunos()[i]);		
		}
		
		System.out.println("\nA média total da turma é: " + (MediaAlunos.mediat(MediaAlunos.getNotasAlunos())));
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


