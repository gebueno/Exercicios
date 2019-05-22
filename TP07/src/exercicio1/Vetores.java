package exercicio1;

public class Vetores {
	
	private double[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	private double[] b = new double[15];
	
	public double[] getA() {
		return a;
	}

	public void setA() {
		this.a = a;
	}

	public double[] getB() {
		return b;
	}

	public void setB(double[] b) {
		this.b = b;
	}

	public void conta()	{
		
	for(int i=0; i<15; i++)
	{
		b[i]=a[i]*a[i];
		
	}	
	}
	
	public void desenvolvedor() {
		System.out.println("Desenvolvido por Gerson Pereira Bueno RA: D827DF-0 TURMA: 2SI");
		
	}

}
