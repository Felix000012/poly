
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a, b, c, d, e;

		a = 'A';
		System.out.printf(" %c \t ", a);
		System.out.printf(" %d \n", (int) a);

		b = 'a';
		c = (char) (b + 1);
		System.out.printf(" %c \t", b);
		System.out.printf(" %c \n", c);

		d = 90;
		System.out.printf(" %C \n", d);

		d = '��';
		e = (char) (d + 1);
		System.out.printf(" %d \t", (int) d);
		System.out.printf(" %c \n", e);
	}
}