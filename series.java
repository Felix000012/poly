import java.util.*;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 항의 값을 입력해주세요.");
		int a = sc.nextInt();
		
		System.out.println("공차의 값을 입력해주세요.");
		int b = sc.nextInt();
		
		System.out.println("몇 번째 항의 값을 알고싶은지 입력해주세요.");
		int n = sc.nextInt();
		
		
	
		int result = a;
		
		
		
		for (int i = 1; i < n; i++) {
			result += b;
			System.out.println(result);
		}
	}

}
