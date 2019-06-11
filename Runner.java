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
		
		
		
	} 
}  