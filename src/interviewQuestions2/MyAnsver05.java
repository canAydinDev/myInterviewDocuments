package interviewQuestions2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MyAnsver05 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
     farkBul();
    }
    public static  void farkBul(){
        System.out.println("Array uzunlugunu giriniz");
        int uzunluk=input.nextInt();
        int []arr=new int[uzunluk];
        for (int i=0; i<uzunluk; i++){
            System.out.println("eleman giriniz");
            int eleman= input.nextInt();
            arr[i]=eleman;
        }
        OptionalInt max=Arrays.stream(arr).max();
        OptionalInt min=Arrays.stream(arr).min();
        String str=max.toString();

        System.out.println("En buyuk sayi :"+max+"\nEn kucuk sayi : "+min);

        Arrays.sort(arr);
        System.out.println("Fark = "+(arr[arr.length-1]-arr[0]));

    }
}
