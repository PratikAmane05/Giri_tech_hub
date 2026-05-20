import java.util.Scanner;
public class Ques_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3+ digit number: "); int n = sc.nextInt();
        String s = Integer.toString(n);
        if(s.length()<=1) System.out.println(n);
        else {
            char[] a = s.toCharArray();
            char tmp = a[0]; a[0]=a[a.length-1]; a[a.length-1]=tmp;
            System.out.println(Integer.parseInt(new String(a)));
        }
    }
}
