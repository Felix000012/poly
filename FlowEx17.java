import java.util.*;

public class FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.printf("*을 출력할 라인의 수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}
