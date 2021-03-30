
public class FlowEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int a=1; a<=5; a++) {
	for(int b=1; b<=5;b++) {
		if(a==b) {
			System.out.printf("[%d, %d]", a,b);
		}else {
			System.out.printf("%5c", ' ');
		}
		System.out.println();
		}
	}
}
	}
