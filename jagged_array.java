import java.util.*;
public class jagged_array {

	public static void main(String[] args){
		int[][] twod_arr = new int[3][];
		Scanner sc = new Scanner(System.in);
		int customSize = 4;
		for(int i=0; i<twod_arr.length; i++){
			twod_arr[i] = new int[customSize];
			for(int j=0; j<twod_arr[i].length; j++){
				System.out.println("Enter "+j+" th element: ");
				int element = sc.nextInt();
				twod_arr[i][j] = element;	
			}
			customSize--;
		}
		print2d(twod_arr);
		insert2dArray(twod_arr, 0, 1, 8);
		System.out.println();
		print2d(twod_arr);
		delete2dArray(twod_arr, 0, 1);
		System.out.println();
		print2d(twod_arr);
		update2dArray(twod_arr, 0, 1, 8);
		System.out.println();
		print2d(twod_arr);
	}
	
	public static void update(int[] arr, int pos, int element){
		int size = arr.length;
		if(pos<0 || pos>size-1){
			System.out.println("Wrong position");
		}
		arr[pos] = element;	
	}
	
	public static void update2dArray(int[][] arr, int i, int j, int element){
		update(arr[i], j, element);
	}
	
	public static void print2d(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
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
	
	public static void insert2dArray(int arr[][], int i, int j, int element){
		insert(arr[i], j, element);
	}
	
	public static void delete(int[] arr, int pos){
		
		//Shifting towards the front
		for(int i=pos; i<=arr.length-2; i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}
	
	public static void delete2dArray(int[][] arr, int i, int j){
		delete(arr[i], j);
	}
	
}
