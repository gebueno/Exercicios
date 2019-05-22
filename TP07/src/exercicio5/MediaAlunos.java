package exercicio5;

public class MediaAlunos {
	private static double mediatotal;
    private static double notasAlunos[] = new double [15];
    
	public static double getMediatotal() {
		return mediatotal;
	}
	public static void setMediatotal(double mediatotal) {
		MediaAlunos.mediatotal = mediatotal;
	}
	public static double[] getNotasAlunos() {
		return notasAlunos;
	}
	public static void setNotasAlunos(double[] notasAlunos) {
		MediaAlunos.notasAlunos = notasAlunos;
	}
    
	public static double mediat(double notasAlunos[]) {

        double soma = 0;
        for (int i = 0; i < 15; i++) {
            soma = soma + MediaAlunos.notasAlunos[i];                                 
        }
        soma = soma / 15;
        mediatotal = soma;
        
        return soma;
}

}
