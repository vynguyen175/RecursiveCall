//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        int number = 1234;
        System.out.println("Sum of digits of " + number + " is: " + sumDigits(number));
    }


    public static int factorial(int n){
        if(n == 0){
            return 1;// need a base case to not have indefinite clashes
        }
        return n * factorial(n-1); // Recursive call
    }

    public static int fibonacci(int n){
        if(n == 0) return 0; // base case
        if(n == 1) return 1; // base case
        return fibonacci(n-1) + fibonacci(n-2); //Recursive call
    }

    public static int sumDigits(int n){
        if (n == 0) return 0; // base case
        return (n%10) + sumDigits(n/10); //recursive call
    }
}