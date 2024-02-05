package zukan;

import java.util.Scanner;

public class Quizu {
    public void mondai(){
        System.out.println("クイズ開始!");
        Quizu riddle = new Quizu();
        riddle.riddle();
    }
public void riddle(){
    try{
        System.out.println("1問:日本で有名な九尾の物語は?");
        System.out.println("\n1:玉藻物語,2:御伽草子,3:日本書記");
        System.out.print("\n\n数字を入力:");
        Scanner stdIn = new Scanner(System.in);
        int q = stdIn.nextInt();
        if(q==1){
            System.out.println("正解!日本で最も有名なのは玉藻物語です、がそれでも知っている人は少ないんです。");
            System.out.println("次の問題!");
            issue();
        }
        if (q==2){
            System.out.println("不正解!最も有名なのは1の玉藻物語です。");
        }if (q==3){
            System.out.println("不正解!最も有名なのは1の玉藻物語です。");
        }
    }catch(ArithmeticException e){
        System.out.println("数字を入力してください");
    }
}
public void issue(){
    try{
        System.out.println("2問:烏天狗が牛若丸に教えたものは何?");
        System.out.println("\n1:文学,2:神通力,3:剣術");
        System.out.print("\n\n数字を入力:");
        Scanner stdIn = new Scanner(System.in);
        int q = stdIn.nextInt();
        if(q==1){
            System.out.println("不正解!教えたのは3の剣術です。");
        }
        if (q==2){
            System.out.println("不正解!教えたのは3の剣術です。");
        }
        if (q==3){
            System.out.println("正解!烏天狗が牛若丸に教えたとされるのは剣術です。神通力があるのに人間に合わせて剣術を教えてくれました。");
            System.out.println("次の問題!");
            problem();
        }
    }catch(ArithmeticException e){
        System.out.println("数字を入力してください");
    }
}
public void problem(){
    try{
        System.out.println("3問:饕餮の「饕」は何の意味?");
        System.out.println("\n1:財を貪る,2:食物を貪る,3:あらゆるものを貪る");
        System.out.print("\n\n数字を入力:");
        Scanner stdIn = new Scanner(System.in);
        int q = stdIn.nextInt();
        if(q==1){
            System.out.println("正解!饕餮の饕は「財を貪る」という意味です。");
        }
        if (q==2){
            System.out.println("不正解!食物を貪るは饕餮の「餮」の意味です。");
        }
        if (q==3){
            System.out.println("不正解!あらゆるものを貪るのは饕餮そのものです。");
        }
    }catch(ArithmeticException e){
        System.out.println("数字を入力してください");
    }
}
}
