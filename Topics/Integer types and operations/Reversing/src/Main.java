import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int num1 = (num % 10);
        int num2 = ((num % 100) / 10);
        int num3 = ((num / 100));

        int newNum = (num1 * 100) + (num2 * 10) + (num3);

        System.out.print(newNum);

    }
}