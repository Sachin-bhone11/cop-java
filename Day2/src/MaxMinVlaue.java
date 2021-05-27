
public class MaxMinVlaue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[]= {10,20,140,110,150};
		
		int max = arr[0];
		int min = arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		  System.out.println("Maximum Value "+max);
		  System.out.println("Minimun value "+min);
	}
}
