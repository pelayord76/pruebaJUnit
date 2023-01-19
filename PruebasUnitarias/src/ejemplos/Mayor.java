package ejemplos;

public class Mayor {

	public static int mayor(int[] list) {

		int indice, max = Integer.MIN_VALUE;
		if (list.length == 0) {

			throw new RuntimeException();
		}
		for (indice = 0; indice < list.length; indice++)

			if (list[indice] > max) {

				max = list[indice];
			}
		return max;
	}
}
