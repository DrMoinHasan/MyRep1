import java.util.*;

class HourGlass{
	public static void main(String str[]){
		Scanner ip = new Scanner(System.in);
		int rows, n, i, j, k;
		System.out.print("Enter the No. of Rows: ");
		rows = ip.nextInt();
		n = rows/2;

		for(i = 0; i < n; i++){
			for(j = 0; j < i; j++){
				System.out.print(" ");
			}
			for(k = 0; k < n-i; k++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		for(i = n-1; i >= 0; i--){
			for(j = 0; j < i; j++){
				System.out.print(" ");
			}
			for(k = 0; k < n-i; k++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
 
	}
}
		