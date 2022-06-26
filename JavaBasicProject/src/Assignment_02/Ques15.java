package Assignment_02;

public class Ques15 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = 7, l = 4;              
        for(int i = 0; i < n; i++){    
            int j, last;    
            last = arr[arr.length-1];    
            for(j = arr.length-1; j > 0; j--){    
                arr[j] = arr[j-1];    
            }    
            arr[0] = last;  
        }
        for(int i = 0; i < l; i++){    
            int j, first; 
            first = arr[0];    
            for(j = 0; j<arr.length-1; j++){    
                arr[j] = arr[j+1];    
            }    
            arr[6] = first;
        }
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
	}
}
