package interviewQuestions2;

import java.util.Scanner;

public class My_Answer02 {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("bir sayi giriniz");
        int num= input.nextInt();
        isAmstrong(num);
    }
    public static  void isAmstrong(int num){
        String str=""+num;
        int a=0;
        int b=0;
        int c=num;
        while (num>0){
            a=num%10;
            b+=(int)Math.pow(a,str.length());
            num=num/10;
        }
        if(b==c){
            System.out.println(c+" sayisi bir amstrong sayisidir");
        }
    }
}
