//practical 3
import java.util.*;
class maximum
{
	public static void main(String args[])
	{
		int a,b,c,max;
		System.out.println("Input Three Numbers: ");
		Scanner sn=new Scanner(System.in);
		a=sn.nextInt();
		b=sn.nextInt();
		c=sn.nextInt();
		max=a>b?(a>c?a:b):(b>c?b:c);
		System.out.println("Maximum of three number is: "+max);
	}
}