import java.util.*;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� ���� �Է����ּ���.");
		int a = sc.nextInt();
		
		System.out.println("������ ���� �Է����ּ���.");
		int b = sc.nextInt();
		
		System.out.println("�� ��° ���� ���� �˰������ �Է����ּ���.");
		int n = sc.nextInt();
		
		
	
		int result = a;
		
		
		
		for (int i = 1; i < n; i++) {
			result += b;
			System.out.println(result);
		}
	}

}
