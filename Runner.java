public class Runner{
	public static void main(String[] args) 
	{
	    int x = 10;

        int y = 5;

        Print_Quotient pQ = (float x,y)->System.out.println(x/y);

        System.out.printf("%.3f",pQ(x,y));
		
	} 
}  