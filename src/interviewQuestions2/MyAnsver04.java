package interviewQuestions2;

import java.util.Scanner;

public class MyAnsver04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();
        perfectNumber(sayi);
        mukemmelBul(sayi);
    }
    public static void perfectNumber(int sayi) {
        int count=0;
      for (int i=1; i<sayi; i++){
          if(sayi%i==0){
              count+=i;
              System.out.print(i+ " ");
          }
      }

      if (count==sayi){
          System.out.println("\n"+sayi+" sayisi mukemmeldir");
      }else{
          System.out.println(" \n"+sayi+" sayisi mukemmel degildir");
      }

    }
    public static  void mukemmelBul(int sayi){
        System.out.print(sayi +" sayisina kadar olan mukemmel sayilar : ");
        for (int i=1; i<=sayi; i++){
            int count=0;
            for (int j=1; j<i; j++){
                if(i%j==0){
                   count+=j;
                }
            }
            if (count==i){
                System.out.print(i+" ");
            }
        }
    }



}
