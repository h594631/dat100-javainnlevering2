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
	
	// e) hjelpemetode:
		public static boolean erKvadratiskMatrise(int[][] matrise) {
			for (int[] kolonne : matrise) {
				if(kolonne.length != matrise.length) {
					return false;
				}
			}
			return true;
		}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		if(erKvadratiskMatrise(matrise)) {
			
			int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
			
			for (int i = 0; i < matrise.length; i++) {
				for (int j = 0; j < matrise[i].length; j++) {
					speiletMatrise[i][j] = matrise[i][j];
				}
			}
			
			for (int i = 0; i < speiletMatrise.length; i++) {
				for (int j = 0; j < i; j++) {
					int temp = speiletMatrise[i][j];
					speiletMatrise[i][j] = speiletMatrise[j][i];
					speiletMatrise[j][i] = temp;
				}
			}
			
			return speiletMatrise;
		} else {
			return null;
		}
		
	}

	
	// f) hjelpemetoder:
	public static int multipliserCelle(int[][] a, int[][] b, int rad, int kol) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += a[rad][i] * b[i][kol];
		}
		return sum;
	}
	
	public static boolean multipliserbarMatrise(int[][]a, int[][] b) {
		for(int i = 0; i < a.length; i++) {
			if(b[i].length != a.length) {
				return false;
			}
		}
		return true;
	}
	
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (multipliserbarMatrise(a, b)) {
		
			int[][] multiplisertMatrise = new int[a.length][b[0].length];

			for (int rad = 0; rad < multiplisertMatrise.length; rad++) {
				for (int kol = 0; kol < multiplisertMatrise[rad].length; kol++) {
					multiplisertMatrise[rad][kol] = multipliserCelle(a, b, rad, kol);
				}
			}
			return multiplisertMatrise;
		}
		else {
			return null;
		}
	}
}
