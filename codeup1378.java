import java.util.*;
public class codeup1378 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i<= a ; i++) {
			for (int j=0; j <= i ; j++)
				sum = sum + j;
		}
		System.out.println(sum);
	}

}
