import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {
        // Scanner sc = null;
        // try {
        //     sc = new Scanner(System.in);
        //     System.out.println("Enter a number :");
        //     int num = sc.nextInt();
        //     System.out.println(num);
        // } catch (Exception e) {
        //     System.out.println("something went wrong");
        // } finally {
        //     sc.close();
        // }

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}