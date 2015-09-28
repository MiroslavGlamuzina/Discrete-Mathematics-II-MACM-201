import java.util.Scanner;

public class Dearangements extends Algorithm{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out
				.println("Example \nHow many ways can a (i.e) string be re-aranged so that none of its indexi are in the original position.\n\n So given index[0] =1, the dearangement can not have index[0] =1  ");

		System.out.println("\nThe Equation takes the form. . . \n");
		System.out
				.println("d_10 = N(c[0]...c[n]) = Size! - combination(size, 1)*((size-1)!/(size)!) + combination(size, 2)*((size-2)!/(size!)) +... + combination(size, size)(0!/size!)");

		System.out.println("\nEnter a word you would like dearranged. . . ");
		Scanner s = new Scanner(System.in);
		String res = s.nextLine();
		
		double ret = factorial(res.length());
		double ret2 = 0;
		for (int i = 2; i <= res.length(); i++) {
		
			if(i%2==0)
			{
				ret2 += 1/factorial(i);

			}
			else
			{
				ret2 -= 1/factorial(i);
			}
		}
		ret = ret*ret2;
	
		System.out.println("\nThere are "+(int)ret + " derangements with a string with a length of "+ String.valueOf(res.length()));
		
	}

}
