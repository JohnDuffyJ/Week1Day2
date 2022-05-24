import java.util.Scanner;

public class Demo {
public static void main (String [] arg) {
int a,b,sum;
System.out.print("Enter a number: ");
Scanner num = new Scanner(System.in);
a = num.nextInt();
System.out.print("Enter a number: ");
b = num.nextInt();
sum = a+b;
System.out.println("Total = " + sum);
}
}