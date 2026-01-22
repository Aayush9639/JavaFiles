//practical 5
import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		System.out.println("Enter number to be reversed: ");
		Scanner sn=new Scanner(System.in);
		int number=sn.nextInt();
		int reverse=reverse(number);
		System.out.println("Reverse of number: "+number+" is "+reverse(number));
	}
	public static int reverse(int number)
	{
		int reverse=0;
		int remainder=0;
		while(number>0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		return reverse;
	}
}