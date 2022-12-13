package interviewQuestions3;

import java.util.Scanner;

public class MyAnswer01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir string girin");
        StringBuilder stb=new StringBuilder(input.nextLine());
        System.out.println(stb.reverse());

        System.out.println("Bir string girin");
        String str=input.nextLine();
        String newStr="";
        for (int i=str.length()-1; i>=0; i--){
            newStr+=str.charAt(i)+"";
        }
        System.out.println(newStr);
        reverse();
    }
    public static void reverse(){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir string girin");
        String str=input.nextLine();
        char []arr=str.toCharArray();
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+"");
        }
    }
}
