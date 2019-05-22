package exercicio2;

public class Vetores2 {
	
	private double[] a = new double[15];
	private double[] b = new double[15];
	
	public double[] getA() {
		return a;
	}

	public void setA(double[] a) {
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
