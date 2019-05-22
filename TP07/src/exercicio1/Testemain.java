package exercicio1;

public class Testemain {

	public static void main(String[] args) {
		
		Vetores opera = new Vetores();
		
		try {
			opera.desenvolvedor();
			System.out.println("");
			opera.conta();
			
			
			for (int i = 0; i < opera.getB().length; i++) {
				
				System.out.println("Elemento " + (i+1) + " do vetor b é: " + opera.getB()[i]);
				
			}			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O seu array está estourado"); 
		}
		
		finally {
			System.out.println("Fim do exercício");
		}
			
		
	}
		
	

}
