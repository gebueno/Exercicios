package exercicio4;

public class MediaAlunos {
	private static double mediatotal;
    private static double[] notasAlunos = {10, 5, 7, 8, 6, 8, 10, 9, 7, 6, 7, 6, 8, 4, 6};
    
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
            soma = soma + notasAlunos[i];
            mediatotal = soma;
        }
        mediatotal = soma / 15;
        return soma;

}
}
