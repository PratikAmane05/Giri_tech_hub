public class patt_7 {
    public static void main(String[] args){
        for(char c='A'; c<='E'; c++){
            for(char d='A'; d<=c; d++) System.out.print(d);
            System.out.println();
        }
    }
}
