import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float total = 0;
        float count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                total += i;
                count++;
            }
        }
        float avg = total / count;

        System.out.println(avg);
    }
}