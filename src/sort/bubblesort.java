/**
 * 
 */
package sort;
/**
 * @author thaku
 *
 */
public class bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [10];
		  arr[0] = 10;
		  arr[1] = 9;
		  arr[2] = 8;
		  arr[3] = 7;
		  arr[4] = 6;
		  arr[5] = 5;
		  arr[6] = 4;
		  arr[7] = 3;
		  arr[8] = 2;
		  arr[9] = 1;
				    
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


