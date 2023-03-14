package garima;

public class Problem3 {
	

	  public static void main(String[] args) {
			String[] arr = {"Hello", "World", null, "Java"};

	        try {
	            checkForNull(arr);
	            System.out.println("Array is valid");
	        } catch (NullPointerException e) {
	            System.err.println(e.getMessage());
	        }
	    }

		public static void checkForNull(String[] arr) throws NullPointerException {
			
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == null) {
	                throw new NullPointerException("Null value found at index " + i);
	            }
	        }
	    }

	}

