package zukan;
import java.util.Scanner;

public class Rank {
    public void ranking(){
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.println("見たいランキングを選んでください");
            System.out.println("\n1:能力の強さ\n2:知性の高さ\n3:危険度");
            Integer con = stdIn.nextInt();
            if (con==1){
                System.out.println("能力の強さ");
                // 1を入力したらabilityに移動
                ability();
            }
            if(con==2){
                System.out.println("知性の高さ");
                // 2を入力したらintelligenceに移動
                intelligence();
            }
            if(con==3){
                System.out.println("危険度");
                // 3を入力したらdangerに移動
                danger();
            }
        }catch(ArithmeticException e){
            System.out.println("数字を入力してください!");
        }
    }

    public void ability(){
        // 能力順位を表示
        System.out.println("1位:饕餮 \n2位:烏天狗 \n3位:九尾\n4位:猫又");
        Itiran itiran = new Itiran();
     
    }
    public void intelligence(){
        // 知能順位を表示
        System.out.println("1位:烏天狗 \n2位:九尾 \n3位:猫又\n4位:饕餮");
        Itiran itiran = new Itiran();
       
    }
    public void danger(){
        //　危険度順位を表示
        System.out.println("1位:饕餮 \n2位:九尾 \n3位:烏天狗 \n4位:猫又");
        Itiran itiran = new Itiran();
    }
}