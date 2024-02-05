package zukan;
import java.util.Scanner;

public class itiran extends memo{
    public static void overview(){
        itiran kyubi = new itiran();
        itiran karasutengu = new itiran();
        itiran toutetu = new itiran();
        itiran nekomata = new itiran();
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.print("見たい妖怪を選んでください");
            System.out.println("\n1:九尾\n2:烏天狗\n3:饕餮\n4:猫又");
            Integer con = stdIn.nextInt();
            
            if (con==1){
                System.out.println("九尾");
                // 1を入力したらkyubiに移動
                kyubi.kyubi();
            }
            if(con==2){
                System.out.println("烏天狗");
                // 2を入力したらkarasutenguに移動
                karasutengu.karasutengu();
            }
            if (con==3) {
                System.out.println("饕餮");
                // 3を入力したらtoutetuに移動
                toutetu.toutetu();
            }
            if (con==4){
                System.out.println("猫又");
                // 4を入力したらnekomataに移動
                nekomata.nekomata();
            }
        }catch(ArithmeticException e){
            // 数字以外が入力されると例外処理
            System.out.println("数字を入力してください!");
        }
    }
}