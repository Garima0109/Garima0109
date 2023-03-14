package garima;
import java.util.*;
public class number {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	     System.out.println("Enter a decimal number:");
	        int n= sc.nextInt();
	        int[] binary =new int[32];
	        
	        int i=0;
	        while(n>0){
	            binary[i]=n%2;
	            i++;
	            n/=2;
	        }
	        for (int  j=i-1;j>=0;j--){
	            System.out.print(binary[j]);
	        }
	    }
	
	     
	}


