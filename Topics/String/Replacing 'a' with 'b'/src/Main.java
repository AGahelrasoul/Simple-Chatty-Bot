import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == 'a') {
                System.out.print("b");
            }
            else {
                System.out.print(ans.charAt(i));
            }

        }
    }
}