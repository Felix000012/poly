import java.util.*;
public class codeup1153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
Scanner s = new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
if (a==b) {
	System.out.println("=");
} else { 
	if (a>b) {
		System.out.println(">");
	} else {
		if (a<b) {
			System.out.println("<");
		}
	}
}
	}

}
