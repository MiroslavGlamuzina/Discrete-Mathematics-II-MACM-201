public class Enumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("How many numbers from 1-100 (inclusive) are not divisible by 2, 3 or 5? \n ");
		ex1();
	}

	public static void ex1() {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c1c2 = 0;
		int c1c3 = 0;
		int c2c3 = 0;
		int c1c2c3 = 0;
		int Inclusion_Exclusion_Algorithm = 0;
		int answer = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				c1++;
			}
			if (i % 3 == 0) {
				c2++;
			}
			if (i % 5 == 0) {
				c3++;
			}

			if (i % 2 == 0 && i % 3 == 0) {
				c1c2++;
			}
			if (i % 2 == 0 && i % 5 == 0) {
				c1c3++;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				c2c3++;
			}

			if (i % 3 == 0 && i % 5 == 0 && i % 2 == 0) {
				c1c2c3++;
			}

			// Easy method
			if (i % 3 != 0 && i % 5 != 0 && i % 2 != 0) {
				answer++;
			}
		}
		Inclusion_Exclusion_Algorithm = 100 - (c1 + c2 + c3)
				+ (c1c2 + c1c3 + c2c3) - c1c2c3;

		System.out.println("Divisible by 2: c1= " + c1);
		System.out.println("Divisible by 3: c2= " + c2);
		System.out.println("Divisible by 5: c3= " + c3);

		System.out.println("Divisible by 2 && 3: c1c2=" + c1c2);
		System.out.println("Divisible by 2 && 5: c1c3" + c1c3);
		System.out.println("Divisible by 3 && 5: c2c3" + c2c3);

		System.out
				.println("\nN(!c1 !c2  !c3 ) = N - [c1 + c2 + c3] + [(c1c2) + (c1c3) + (c2c3)] - [c1c2c3]\n");

		System.out.println("Using Inclusion/Exclusion Algorithm \t= "
				+ Inclusion_Exclusion_Algorithm);
		System.out.println("Using Programmatic Algorithm \t\t= " + answer);

	}

}
