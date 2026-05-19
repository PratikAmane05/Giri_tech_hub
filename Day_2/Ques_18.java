import java.util.Scanner;

class Ques_18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.print("Enter character: ");
        ch = sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}
