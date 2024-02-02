package zukan;

import java.util.Scanner;

public class itiran {
    public static void overview(){
            try{
            Scanner stdIn = new Scanner(System.in);
            System.out.print("見たい妖怪を選んでください");
            System.out.println("\n1:九尾\n2:烏天狗\n3:饕餮");
            Integer con = stdIn.nextInt();
            if (con==1){
                System.out.println("九尾");
                kyubi();
            }
            if(con==2){
                System.out.println("烏天狗");
                karasutengu();
            }
            if (con==3) {
                System.out.println("饕餮");
                toutetu();
            }
        }catch(ArithmeticException e){
            System.out.println("数字を入力してください!");
        }
    }
    public static void kyubi(){
        System.out.println("狐が");
    }
    public static void karasutengu(){
        System.out.println("山に住む");
    }
    public static void toutetu(){
        System.out.println("扉の");
    }
}
