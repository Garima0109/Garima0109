package garima;

import java.util.Scanner;

public class print {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		float a,b;
		System.out.println("Enter length & breadth:");
		a=sc.nextFloat();
		b=sc.nextFloat();
		area r= new area(a,b);
		float area = r.returnArea();
		System.out.println("Area="+area);
	}

}
