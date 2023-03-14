package garima;

import java.util.Scanner;

public class Problem2 extends Exception {

	public Problem2(String string) {
		super(string);
	}
	
	public class InvalidMailIdException {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter email ID to validate:");
	        String email = sc.nextLine();
	        try {
	            if (!email.contains("@")) {
	                throw new Problem2("Email ID is invalid");
	            }
	            System.out.println("Email ID is valid");
	        } catch (Problem2 e) {
	            System.err.println(e.getMessage());
	        }
	    }
	}
}
