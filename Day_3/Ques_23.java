import java.util.Scanner;
public class Ques_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: "); String s = sc.next();
        boolean duck=false;
        for(int i=0;i<s.length();i++){ if(s.charAt(i)=='0' && i!=0) duck=true; }
        System.out.println(duck?"Duck Number":"Not Duck Number");
    }
}
