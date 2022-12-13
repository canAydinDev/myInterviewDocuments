package interviewQuestions3;

import java.util.Scanner;

public class MyAnswer03 {
    public static void main(String[] args) {
        sumNumbers();
    }
    public static void sumNumbers(){
        Scanner input=new Scanner(System.in);
        int sum=0;
        int count=0;
       while(!(sum>500||count>9)){
           System.out.println("bir sayi giriniz");
           int num= input.nextInt();
           sum+=num;
           count++;

       }
        System.out.println(count+" tane sayi girdiniz ve toplamlari = "+sum);

    }
}
