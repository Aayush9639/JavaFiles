//practical 2
class prime
{
          public static void main(String args[])
          {
	int x,y,c=0,n=30;
	for(x=2;x<n;x++)
	{
	              if(x%2!=0||x==2)
	              {
		      for(y=2;y<=x/2;y++)
		      {
			if(x%y==0)
			{
				break;
			}
		     }
		     if(y>x/2)
		     {
			System.out.println(x);
			c++;
		     }
	              }
	}
	System.out.println("\nTotal: "+c);
          }
}