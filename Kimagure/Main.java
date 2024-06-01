

import java.util.Random;
import java.util.Scanner;

public class Main extends Object{
public static void main(String[] args) {
        int suuzi=0;
        int count=0;
        System.out.println("名前を入力してください");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("チャンスを手にする回数を入力してください");
        count=new java.util.Scanner(System.in).nextInt();
        if (count==0) {
               System.out.println("あなたにチャンスは不要だったようです。"); 
        }
        else{
                System.out.println("番号を入力してください");
        int summ=new java.util.Scanner(System.in).nextInt();
        Random rand=new Random();
        System.out.println(name+"さんが"+"の結果は・・・");
        for(int i=0;i<count;i++){
            suuzi=rand.nextInt(15);
        switch (suuzi) {
            case 0:
                    System.out.println("R-1");
                break;
            case 1:
                    System.out.println("レギュラーシングルギフト券390円");
                break;
            case 2:
                    System.out.println("なし");
                    break;
            case 3:
                    System.out.println("ミスタードーナツ500円");
                    break;
            case 4:
                    System.out.println("笹");
                    break;
            case 6:
                    System.out.println("飴玉一個");
                    break;
            case 7:
                    System.out.println("うまい棒一本");
                    break;
            case 8:
                    System.out.println("パン");
                    break;
            case 9:
                    System.out.println("10円ガム");
                    break;
            case 10:
                    System.out.println("残念賞ティッシュ");
                    break;
            case 11:
                    System.out.println("課題");
                    break;
            case 12:
                    System.out.println("単位");
                    break;
            case 13:
                    System.out.println("芋");
                    break;
            case 14:
                    System.out.println("労働");
                    break;
                }
            }   
        }

    }
    
}
