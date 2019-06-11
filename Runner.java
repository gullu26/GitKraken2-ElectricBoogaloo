public class Runner{
	public static void main(String[] args) 
	{
		int num = 36;
		Perfect_Square ps = (int num) -> {
			int sqrt = (int) Math.sqrt(number);
			if(sqrt*sqrt == number)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		System.out.println(ps(num));
	    int x = 10;

        int y = 5;

        Print_Quotient pQ = (float x,y)->System.out.println(x/y);

        System.out.printf("%.3f",pQ(x,y));
		
		
		
	} 
}  