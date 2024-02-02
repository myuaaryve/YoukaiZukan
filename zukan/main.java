package zukan;
import java.util.InputMismatchException;
import java.util.Scanner;


public class main{
    public static void main(String[] args){
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.print("進みたい項目を選んでください");
            System.out.println("\n1:妖怪図鑑\n2:強さランキング");
            Integer con = stdIn.nextInt();
            if (con==1){
                System.out.println("妖怪図鑑");
                itiran.overview();
            }
            if(con==2){
                System.out.println("妖怪の強さランキング");
                rank.ranking();
            }
            if(con==3){
                System.out.println("");
                
            }
        }catch(InputMismatchException e){
            System.out.println("数字を入力してください!");
        }
    }
}
