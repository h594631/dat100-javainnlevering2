package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int el : tabell) {
			System.out.print(el);
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		StringBuilder utTxt = new StringBuilder("[");
		for (int i = 0; i < tabell.length; i++) {
			utTxt.append(tabell[i]).append("");
			if (i < tabell.length - 1) {
				utTxt.append(",");
			}
		}
		utTxt.append("]");
		return utTxt.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		
		/*
		** for-løkke:
		*
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		*/
		
		/*
		 ** while-løkke: 
		 * 
		int i = 0;
		while (i < tabell.length) {
			sum+=tabell[i];
			i++;
		}
		*/
		
		// utvidet for-løkke / forEach
		for (int el : tabell) {
			sum += el;
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int i = 0, j = tabell.length - 1;
		
		int[] reversedArray = new int[tabell.length];
		
		while (i < tabell.length) {
			reversedArray[i] = tabell[j];
			i++;
			j--;
		}
		return reversedArray;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] joinedArray = new int[tabell1.length + tabell2.length];
		int j = 0;
		
		for (int i = 0; i < tabell1.length; i++) {
			joinedArray[i] = tabell1[i];
			j++;
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			joinedArray[j] = tabell2[i];
			j++;
		}
		
		return joinedArray;
	}
}
