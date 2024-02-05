package zukan;
import java.util.Scanner;

public class Itiran{
    public void overview(){
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.print("見たい妖怪を選んでください");
            System.out.println("\n1:九尾\n2:烏天狗\n3:饕餮\n4:猫又");
            Integer con = stdIn.nextInt();
            
            if (con==1){
                System.out.println("九尾");
                // 1を入力したらkyubiに移動
                Memo kyubi = new Memo();
                kyubi.kyubi();
            }
            if(con==2){
                System.out.println("烏天狗");
                // 2を入力したらkarasutenguに移動
                Memo karasutengu = new Memo();
                karasutengu.karasutengu();
            }
            if (con==3) {
                System.out.println("饕餮");
                // 3を入力したらtoutetuに移動
                Memo toutetu = new Memo();
                toutetu.toutetu();
            }
            if (con==4){
                System.out.println("猫又");
                // 4を入力したらnekomataに移動
                Memo nekomata = new Memo();
                nekomata.nekomata();
            }
        }catch(ArithmeticException e){
            // 数字以外が入力されると例外処理
            System.out.println("数字を入力してください!");
        }
    }
}