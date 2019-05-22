package exercicio3;

public class VetoresDiv {
	
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
		
	for(int i=0; i<15; i++)	{		
		b[i] = Math.sqrt(a[i]);		
	}	
	
	}
}
