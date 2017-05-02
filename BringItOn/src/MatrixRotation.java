import java.util.Scanner;

public class MatrixRotation {
	
	public static int[][] Rotation(int[][] arr){
		
		int n =4;
		int size = 4;
		int currLayer = n/2;
		int j=0;
		while(j<currLayer){
			for(int i=j; i<size; i++){
			
				int top = arr[j][i];
				int temp = top;
				//i++;
				
				int left = arr[n][j];
				arr[j][i] = left;
				//top = left;
				//n--;
				
				
				int bottom = arr[size][n];
				arr[n][j] = bottom;
				//left = bottom;
				
				
				int right = arr[i][size];
				
				arr[size][n] = right;
				arr[i][size] = temp;
				//bottom = right;
				//right = temp;
				//i++;
				n--;
			}
			j++;
			size -= 1;
			n=size;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		
		arr = Rotation(arr);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(arr[i][j] + " ");
			}
		}
		

	}

}
