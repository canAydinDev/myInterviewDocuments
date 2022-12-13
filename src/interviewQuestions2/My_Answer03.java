package interviewQuestions2;

import java.util.Scanner;

public class My_Answer03 {
    static Scanner input=new Scanner(System.in);
//0-1-1-2-3-5-8-13-21-34....
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        int num= input.nextInt();
        createFibonacci(num);
    }
    public static void createFibonacci(int num){
        int count1=0;
        int count2=1;
        int count3=1;

        while (count1<=num){
            System.out.print(count1+"-");
           count1=count2;
           count2=count3;
           count3=count1+count2;

        }
    }
}
