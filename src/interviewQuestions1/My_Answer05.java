package interviewQuestions1;

import java.util.Scanner;

public class My_Answer05 {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("bir cumle giriniz");
        String str= input.nextLine();
        System.out.println("bir harf giriniz");
        String harf= input.next();
        kacKezGoster(str,harf);
    }
    public static void kacKezGoster(String str,String harf){
        String []arr=str.split("");
        int counter=0;
        for (String w : arr){
            if (w.equalsIgnoreCase(harf)){
                counter++;
            }
        }
        System.out.println("\""+str+"\""+" cumlesinde "+harf+" "+counter+" adettir.");
    }
}
