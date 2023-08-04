package Programs;

public class FirstAndSecondHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {130,34,67,776,56,99,67,54,67,85,45};
        int largest=0;
        int secondLargest=0;
        System.out.println("given array list is");
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);	
		}
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i]>largest) {
        		secondLargest=largest;
        		largest=arr[i];
				
			} 
        	else if(arr[i]>secondLargest) 
        	{
				secondLargest=arr[i];
			}

		}
		System.out.println("first largest number is" + largest);
		System.out.println("secondLargest number is" + secondLargest);
    }

}
