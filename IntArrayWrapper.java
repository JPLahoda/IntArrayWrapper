import java.util.Arrays;

public class IntArrayWrapper {

	static final int CAPACITY = 5;
	int[] A = new int[CAPACITY];
	int numItems = CAPACITY;
	public static void main(String[] args) {
		
		System.out.println(append(3));
		System.out.println(get(2));
		clear();
		System.out.println(toString());
		System.out.println(equals());

		
	}
	
	public int get(int index) {
		return A[index];
	}
	
	public boolean append(int newItem) {
		if (A.length < CAPACITY) {
			int value = 0;
			int[] result = Arrays.copyOf(A, A.length + 1);
		    result[result.length - 1] = value;
		    A = result;
			return true;

			}
		else return false;
		}

	
	public void clear() {
		int[] B = new int[A.length - 1];

		for (int i = 0, j = 0; i < A.length; i++) {
		    if (i != A.length) {
		        B[j++] = A[i];
		    }
		}
		A = B;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < A.length; i++) {
			s += A[i] + ",";
		}
		return s;
	}

	public boolean equals(IntArrayWrapper other) {
		int count = 0;
		for (int i = 0; i<A.length; i++) {
			if (other[i] == A[i]) {
				count++;
			}
		}
			
		if (count == CAPACITY) {
			return true;
		}
		else return false;
	}
}
