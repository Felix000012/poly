import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 !을 계산할 까요? (숫자만 입력)");
		int num = scanner.nextInt();
		int fac = 1;

		for (int i = num; i > 0; i--) {
			fac = fac * i;
		}
		System.out.println("[" + num + "!] =" + fac);
	}

}
