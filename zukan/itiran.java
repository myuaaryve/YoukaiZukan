package zukan;
import java.util.Scanner;

public class itiran {
    public static void overview(){
        try{
            Scanner stdIn = new Scanner(System.in);
            System.out.print("見たい妖怪を選んでください");
            System.out.println("\n1:九尾\n2:烏天狗\n3:饕餮\n4:猫又");
            Integer con = stdIn.nextInt();
            if (con==1){
                System.out.println("九尾");
                // 1を入力したらkyubiに移動
                kyubi();
            }
            if(con==2){
                System.out.println("烏天狗");
                // 2を入力したらkarasutenguに移動
                karasutengu();
            }
            if (con==3) {
                System.out.println("饕餮");
                // 3を入力したらtoutetuに移動
                toutetu();
            }
            if (con==4){
                System.out.println("猫又");
                // 4を入力したらnekomataに移動
                nekomata();
            }
        }catch(ArithmeticException e){
            // 数字以外が入力されると例外処理
            System.out.println("数字を入力してください!");
        }
    }
    public static void kyubi(){
        System.out.println("九尾の狐（きゅうびのきつね）または九尾狐(きゅうびこ)・九尾狐狸(きゅうびこり)は、中国に伝わる伝説上の生物。9本の尾をもつキツネの霊獣または妖怪である。日本で有名なのは玉藻の前と妲己の物語。");
    }
    public static void karasutengu(){
        System.out.println("烏天狗（からすてんぐ）は、大天狗と同じく山伏装束で、烏のような嘴を持った顔をしており、自在に飛翔することが可能だとされる伝説上の生物。牛若丸に剣術を教えたという説もある。一般に伝わる天狗とはまた違うので要注意。");
    }
    public static void toutetu(){
        System.out.println("体は牛か羊で、曲がった角、虎の牙、人の爪、人の顔などを持つ。饕餮(とうてつ)の「饕」は財産を貪る、「餮」は食物を貪るの意である。何でも食べる猛獣、という印象から転じて、魔を喰らう、という考えが生まれ、後代には魔除けの意味を持つようになった。渾敦（こんとん）、窮奇（きゅうき）、檮杌（とうごつ）とともに「四凶」の一つとされる。中国の明時代では飲み食いが好きな竜の五番目の子に当たるといわれている。");
    }
    public static void nekomata(){
        System.out.println("猫又、猫股（ねこまた）は、日本の民間伝承や古典の怪談、随筆などにあるネコの妖怪。大別して山の中にいる獣といわれるものと、人家で飼われているネコが年老いて化けるといわれるものの2種類がある。人を食べるといわれたり犬を咥えていたなど所々怖い表現がされている。飼い猫が開いた扉を閉めていたら、それはもしかしたら猫又が化けているのかもしれない。");
    }
}
