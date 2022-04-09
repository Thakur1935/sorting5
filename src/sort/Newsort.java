package sort;

public class Newsort {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = new int [10];
		  arr[0] = 5;
		  arr[1] = 7;
		  arr[2] = 10;
		  arr[3] = 9;
		  arr[4] = 2;
		  arr[5] = 1;
		  arr[6] = 4;
		  arr[7] = 6;
		  arr[8] = 3;
		  arr[9] = 8;
				    
	        int temp = 0;  
	         for(int i=0; i <10; i++){  
	                 for(int j=1; j <10-i; j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         } 
	         
	         for(int i=0; i<10; i++) {
	        	 System.out.print(arr[i]);
	         }
	}

}
