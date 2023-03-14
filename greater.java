package garima;

public class greater {
	public static void main(String[]args)
	{
		int a[]= {1,2,5,89,6,54,32,54};
		int i,max;
		max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println("Greatest no="+max);
		System.out.println("The greater no. is found at index="+(i+1));
		
	}

}
