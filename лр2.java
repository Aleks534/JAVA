import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите число N: ");
    int n = scan.nextInt();
    int sum = 0;
    for (int i = 0; i <= n; i++) {
        sum = sum + i;
    }
    System.out.printf("Сумма чисел от 1 до %d составляет %d%n", n, sum);
 }
}