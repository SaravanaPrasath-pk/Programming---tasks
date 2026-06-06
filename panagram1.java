import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        int flag = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                flag |= (1 << (c - 'a'));
            }
        }

        if (flag == (1 << 26) - 1) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}