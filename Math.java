package garima;

public class Math {
	int a,b;
	
	int addition()
	{
	 return a+b;	
		
	}
	int substraction()
	{
	
		return a-b;
	}
	int multiply()
	{
		return a*b;
	}
	int divide()
	{
		return a/b;
	}
    int mod()
    {
    	return a%b;
    }
    void display()
    {
    	    System.out.println("Addition="+addition());
    		System.out.println("Substraction="+substraction());
    		System.out.println("Product="+multiply());
    		System.out.println("Quotient="+divide());
    		System.out.println("Modulus="+mod());
    }
}
