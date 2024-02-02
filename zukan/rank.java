package zukan;
import java.util.Scanner;

public class rank {
    public static void ranking(){
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.println("見たいランキングを選んでください");
            System.out.println("\n1:能力の強さ\n2:知性の高さ");
            Integer con = stdIn.nextInt();
            if (con==1){
                System.out.println("能力の強さ");
                itiran.overview();
            }
            if(con==2){
                System.out.println("知性の高さ");
            }
        }catch(ArithmeticException e){
            System.out.println("数字を入力してください!");
        }
    }

    public static void ability(){
        System.out.println("1位:饕餮 \n2位: \n3位");
    }
    public static void intelligence(){
        System.out.println("1位: \n2位 \n3位");
    }
}
