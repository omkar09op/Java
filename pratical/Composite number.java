import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int x = in.nextInt();
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }

        if (count != 2) {
            System.out.println("Number is Composite");
        } else {
            System.out.println("Number is not Composite");
        }
    }
}
