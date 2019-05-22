package exercicio6;

public class Separar {
	
	private double[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	private double b[] = new double [20];
	private double c[] = new double [20];
	
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

	public double[] getC() {
		return c;
	}

	public void setC(double[] c) {
		this.c = c;
	}
	
	public void separaImparPar() {				
				
		for (int i = 0; i < a.length; i++) {
			 
			if(a[i]%2 == 0) {
				b[i] = a[i];								
			}
			else {
				c[i] = a[i];			
			}			
		}
		
	}

}
