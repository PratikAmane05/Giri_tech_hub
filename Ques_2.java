import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter byte: "); byte b = sc.nextByte();
        System.out.print("Enter short: "); short s = sc.nextShort();
        System.out.print("Enter int: "); int i = sc.nextInt();
        System.out.print("Enter long: "); long l = sc.nextLong();
        System.out.print("Enter float: "); float f = sc.nextFloat();
        System.out.print("Enter double: "); double d = sc.nextDouble();
        System.out.print("Enter char: "); char c = sc.next().charAt(0);
        System.out.print("Enter boolean: "); boolean bo = sc.nextBoolean();

        System.out.println("You entered:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bo);
        sc.close();
    }
}
