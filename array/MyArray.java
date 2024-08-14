import java.util.*;
public class MyArray {

	public static void main(String[] args){
	
		//ArrayList<Integer> da = new ArrayList<>();
		
		int[] rollNo = new int[5];
		//int age[];
		//age = new int[];
		
		int dummy[] = {2,6,7,9,2,13,2};
		
		rollNo[0] = 35;
		
		//System.out.println(rollNo);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			System.out.print("Enter "+i+" th element: ");
			int element = sc.nextInt();
			rollNo[i] = element;
		
		}
		
		printArray(rollNo);
		insert(rollNo, 1, 22);
		printArray(rollNo);
		delete(rollNo, 1);
		printArray(rollNo);
	}
	
	public static void insert(int[] arr, int pos, int element){
		int size = arr.length;
		if(pos < 0 || pos>size-1){
			System.out.println("Wrong position");
			return;			
		
		}
		
		//Shifting towards the end
		for(int i=size-2; i>=pos; i--){
			arr[i+1] = arr[i];
		}
		arr[pos] = element;
	
	}
	
	public static void delete(int[] arr, int pos){
		
		//Shifting towards the front
		for(int i=pos; i<=arr.length-2; i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(",");
			
			}
		}
		
		System.out.println();		
	
	} 


}
