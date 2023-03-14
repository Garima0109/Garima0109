package garima;
public class Question2 {
		public static void main(String[] args)
		{  
			String[] arr = {"Rohit","Ankit","khushi","snehal"};   
			try {
				for(int i=0;i<=arr.length;i++) {
					System.out.println(arr[i]);
				}
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index is out of Bound");
				}
			  
		}  
	}

