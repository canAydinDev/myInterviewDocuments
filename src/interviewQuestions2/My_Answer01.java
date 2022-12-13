package interviewQuestions2;

import java.util.Random;
import java.util.Scanner;
/*
    a nın mutlak degeri
    a ve b den en buyuk olani
 */
public class My_Answer01 {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        int num= input.nextInt();
        isAmstrong(num);
        hangisiAmstrong(num);
    }
    public static  void isAmstrong(int num){
        int a=0;
        int b=0;
        int c=num;
        while (num>0){
            a=num%10;
            b+=(int)Math.pow(a,3);
            num=num/10;
        }
        if(b==c){
            System.out.println(c+" sayisi bir amstrong sayisidir");
        }
    }

    public static void hangisiAmstrong(int num){
        for (int i=1; i<=num; i++){
           isAmstrong(i);
        }
    }
}
