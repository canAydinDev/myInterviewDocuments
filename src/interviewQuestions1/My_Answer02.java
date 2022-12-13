package interviewQuestions1;

import java.util.Scanner;

public class My_Answer02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str= input.next();
        System.out.println("Bir sayi giriniz");
        int num= input.nextInt();
        yaz(str,num);

    }
    public static void yaz(String str,int num){
        String chr=""+str.charAt(0)+str.charAt(str.length()-1);
        String chr2="";
        for (int i=1; i<=num; i++){
            chr2=chr2+chr;
        }
        System.out.println(chr2);
    }

}
