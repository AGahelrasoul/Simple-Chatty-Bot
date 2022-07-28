import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans1 = scanner.nextLine();
        String ans2 = scanner.nextLine();
        String ans3 = scanner.nextLine();

        System.out.println("The form for " + ans1 + " is completed. We will contact you if " +
                "we need a chef who cooks " + ans3 + " dishes and has " + ans2 +
                " years of experience.");
    }
}