import java.util.Scanner;
public class HollowStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row and col");
		int r = scan.nextInt();
		int c = scan.nextInt();
		for (int i = 1; i <=r; i++) {
			for (int j = 1; j <= c; j++) 
				if((i==1 || i==c) || (j==1 || j==c))
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
			
		}
	}
}