public class PracticeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫번째 정수입력: ");
        int i = scanner.nextInt();
        System.out.println(i);
        
        System.out.println("첫번째 문자열입력: ");
        String str1 = scanner.nextLine();
        System.out.println(str1);
        
        System.out.println("두번째 정수입력: ");
        int j = scanner.nextInt();
        System.out.println(i);
        
        System.out.println("두번째 문자열입력: ");
        String str2 = scanner.next();
        System.out.println(str2);
    }
}
