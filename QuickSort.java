package Sorting;

public class QuickSort {

	public static void main(String[] args) 
	{
        int[] arr= {9,4,3,6,1,5,8,2};
		
		System.out.println("Before sort");
		for(int i:arr)
			   System.out.print(i+" ");
		System.out.println();
		
		quickSort(arr);
		
		System.out.println("After merge sort");
		for(int i:arr)
			   System.out.print(i+" ");
		System.out.println();
		
	}
	
	public static void quickSort(int arr[])
	{
		quickSort(arr,0,arr.length-1); 
	}
	
	private static void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pivot=placePivot(arr,low,high);
			System.out.println("in quick: ");
			for(int i:arr)
				   System.out.print(i+" ");
			System.out.println();
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
	}
	private static int placePivot(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot =low;
		int p=low+1;
		int q=high;
		while(p<q)
		{
			if(arr[p]>arr[pivot])
			{
				if(arr[q]<arr[pivot])
				{
					int temp=arr[p];
					arr[p]=arr[q];
					arr[q]=temp;
					p++;q--;
				}
				else q--;
			}
			else p++;
		}
		if(p==q)
		{
			if(arr[q]>arr[pivot])
				q--;
		}
		int temp=arr[q];
		arr[q]=arr[pivot];
		arr[pivot]=temp;
		for(int i:arr)
			   System.out.print(i+" ");
		System.out.println();
		return q;
	}


}
	/*Before sort
Before sort
9 4 3 6 1 5 8 2 
2 4 3 6 1 5 8 9 
in quick: 
2 4 3 6 1 5 8 9 
3 1 2 6 4 5 8 9 
in quick: 
3 1 2 6 4 5 8 9 
1 3 2 6 4 5 8 9 
in quick: 
1 3 2 6 4 5 8 9 
1 3 2 8 4 5 6 9 
in quick: 
1 3 2 8 4 5 6 9 
1 3 2 5 4 8 6 9 
in quick: 
1 3 2 5 4 8 6 9 
1 3 2 4 5 8 6 9 
in quick: 
1 3 2 4 5 8 6 9 
After merge sort
1 3 2 4 5 8 6 9 


	 */
	

