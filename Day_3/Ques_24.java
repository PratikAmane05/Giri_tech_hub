import java.util.Scanner;
public class Ques_24 {
    static int fact(int x){ int f=1; for(int i=2;i<=x;i++) f*=i; return f; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: "); int n=sc.nextInt();
        int t=n, sum=0;
        while(t>0){ sum += fact(t%10); t/=10; }
        System.out.println((sum==n)?"Strong Number":"Not Strong Number");
    }
}
