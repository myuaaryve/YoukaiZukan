package zukan;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Root{
    public static void main(String[] args){
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.print("進みたい項目を選んでください");
            System.out.println("\n1:妖怪図鑑\n2:強さランキング\n3:妖怪クイズ(図鑑後推奨)");
            Integer con = stdIn.nextInt();
            
            if (con==1){
                System.out.println("妖怪図鑑");
                Itiran itiran = new Itiran();
                itiran.overview();
            }
            if(con==2){
                System.out.println("妖怪の強さランキング");
                Rank rank = new Rank();
                rank.ranking();
                
            }
            if(con==3){
                System.out.println("妖怪クイズ");
                Quizu quizu = new Quizu();
                quizu.mondai();
            }
        }catch(InputMismatchException e){
            System.out.println("数字を入力してください!");
        }
    }
}
