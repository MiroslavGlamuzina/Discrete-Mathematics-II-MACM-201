
public class GeneratingFunctions extends Algorithm {

	public static void main(String[] args) {
		System.out.println("Generating functions: Chapter 9\n");
		System.out.println(
				"while shopping one Saturday, Mildred buys 12 oranges for her children, Grace, Mary and Frank.\nIn how many ways can she distribute the oranges so that Grace gets at least four, and Mary and Frank get at least two, but Frank\ngets no more than five. . . ");
		System.out.println("\nSolution\n--------\n");
		System.out.println("Apply product rule and Exponential series");		
		System.out.println("The book represents the solution in this way. . .");
		System.out.println("return (double)(power(x,4)+power(x,5)+power(x,6)+power(x,7)+power(x,8))*(power(x,2)+power(x,3)+power(x,4)+power(x,5)+power(x,6))*(power(x,2)+power(x,3)+power(x,4)+power(x,5))");
		System.out.println("Solution: f(1)= "+generatedFunction(1));

	}
	
	public static double generatedFunction(double x)
	{	
		return (double)(power(x,4)+power(x,5)+power(x,6)+power(x,7)+power(x,8))*(power(x,2)+power(x,3)+power(x,4)+power(x,5)+power(x,6))*(power(x,2)+power(x,3)+power(x,4)+power(x,5)); 
	}
	public static double generatedFunction(int x)
	{	
		return (double)(power(x,4)+power(x,5)+power(x,6)+power(x,7)+power(x,8))*(power(x,2)+power(x,3)+power(x,4)+power(x,5)+power(x,6))*(power(x,2)+power(x,3)+power(x,4)+power(x,5)); 
	}
}
