import java.util.Scanner;
public class Ques_25 {
    static int pow(int a,int b){ int r=1; for(int i=0;i<b;i++) r*=a; return r; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: "); int n=sc.nextInt();
        int t=n, digits=0; while(t>0){ digits++; t/=10; }
        t=n; int sum=0; while(t>0){ sum += pow(t%10,digits); t/=10; }
        System.out.println((sum==n)?"Armstrong":"Not Armstrong");
    }
}
