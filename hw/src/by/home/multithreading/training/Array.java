package by.home.multithreading.training;

import java.util.Arrays;

public class Array {

	private int[][] ar = new int[5][5];

	public void changeArray(int number) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j && ar[i][j] == 0) {
					ar[i][j] = number;
					return;
				}
			}
		}
	}

	public int[][] getAr() {
		return ar;
	}

	public void setAr(int[][] ar) {
		this.ar = ar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(ar);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.deepEquals(ar, other.ar))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Array [ar=" + Arrays.toString(ar) + "]";
	}

}
