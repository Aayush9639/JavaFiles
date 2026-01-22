//practical 4
import java.util.*;
class Secondmax
{
	public static void main(String args[])
	{
		int max=0,second_max=0,temp,n;
		System.out.println("How many numbers do you want to print: ");
		Scanner sn=new Scanner(System.in);
		n=sn.nextInt();
		System.out.println("Enter Numbers:");
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
			max=sn.nextInt();
			}
			else
			{
			temp=sn.nextInt();
			if(temp>max)
			{
			second_max=max;
			max=temp;
			}
			else if(temp>second_max)
			{
			second_max=temp;
			}
			}
		}
		
		System.out.println("second max number is: "+second_max);
	}
}