import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� !�� ����� ���? (���ڸ� �Է�)");
		int num = scanner.nextInt();
		int fac = 1;

		for (int i = num; i > 0; i--) {
			fac = fac * i;
		}
		System.out.println("[" + num + "!] =" + fac);
	}

}
