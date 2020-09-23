package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] subArray: matrise) {
			for(int el: subArray) {
				System.out.print(el + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder utTxt = new StringBuilder("");
		for (int[] subMatrix : matrise) {
			for (int el: subMatrix) {
				utTxt.append(el).append(" ");
			}
			utTxt.append("\n");
		}
		return utTxt.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] multiplisertMatrise = new int[matrise[0].length][matrise[1].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				multiplisertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		return multiplisertMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
