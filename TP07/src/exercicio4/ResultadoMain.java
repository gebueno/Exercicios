package exercicio4;

public class ResultadoMain {

	public static void main(String[] args) {

		MediaAlunos conta = new MediaAlunos();
		
		MediaAlunos.mediat(MediaAlunos.getNotasAlunos());		
		System.out.println((MediaAlunos.getMediatotal()));
	}

}
