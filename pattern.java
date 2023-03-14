package garima;

public class pattern {
	public static void main(String[] args)
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for (j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<2*(i-1);j++)
			{
				System.out.print("*");
				}
		System.out.println();
		}
	}

}
