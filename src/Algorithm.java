public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static double combination(int n, int r) {
		int span = n-r;
		double num = 0;
		double den = 0;
		double den2 =0;
		
		num = factorial(n);
		den = factorial(r);
		den2 = factorial(n-r);
		return (num/(den*den2));
	}
	
	public static double factorial(int n){
		double r=1;
		for(int i =1; i <= n; i++)
		{
			r*=i;
		}
		
		return r;
	}
	
	public static int power(int value, int power)
	{
		int ret =value;
		for(int i=1; i < power; i ++)
		{
			value*=ret;
		}
		return value;
	}
	public static double power(double value, int power)
	{
		double ret =value;
		for(int i=1; i < power; i ++)
		{
			value*=ret;
		}
		return value;
	}
	
}
