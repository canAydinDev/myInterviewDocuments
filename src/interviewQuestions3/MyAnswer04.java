package interviewQuestions3;

import java.util.Scanner;

public class MyAnswer04 {
    public static void main(String[] args) {
        frequency();
    }
    public static void frequency(){
        Scanner input=new Scanner(System.in);
        System.out.println("bir String giriniz");
        String str=input.nextLine();
        System.out.println("bir harf giriniz");
        String ch= input.next();

        String [] arr=str.split("");
        int count=0;
        for (int i=0; i< arr.length; i++){
            if(arr[i].equalsIgnoreCase(ch)){
                count++;
            }

        }
        System.out.println(str +" kelimesinde "+ch+ " harfi "+count +" defa geciyor");

    }

}
