import java.util.Scanner;

public class MultiFunctionProgram {

    Scanner sc = new Scanner(System.in);

    void arithmetic() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Add: " + (a + b) +
                          " Sub: " + (a - b) +
                          " Mul: " + (a * b) +
                     (b != 0 ?
                          " Div: " + (a / b) +
                          " Mod: " + (a % b) :
                          " Div/Mod not possible"));
    }

    void swapping() {
        System.out.print("Enter two numbers to swap: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After:  a = " + a + ", b = " + b);
    }

    int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    void reverseNumber() {
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt();
        System.out.println("Reversed: " + reverse(num));
    }

    void checkPalindrome() {
        System.out.print("Enter number to check palindrome: ");
        int num = sc.nextInt();
        System.out.println(num == reverse(num) ? "Palindrome" : "Not a Palindrome");
    }

    public static void main(String[] args) {
        MultiFunctionProgram obj = new MultiFunctionProgram();
        obj.arithmetic();
        obj.swapping();
        obj.reverseNumber();
        obj.checkPalindrome();
        obj.sc.close();
    }
}
