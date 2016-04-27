
public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]={1,2,3,4};
   int length= arr.length;
   System.out.println("array you enterd:");
   for(int i=0;i<length;i++){
	 System.out.print(arr[i]);
   }
   System.out.println(" ");
   System.out.println("reversed array:");
   for(int j=(length-1);j>=0;j--){
	System.out.print(arr[j]);   
	   
   }
	}

}
