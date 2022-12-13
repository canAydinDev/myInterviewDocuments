package interviewQuestions3;

import java.util.Scanner;

public class MyAnswer02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        isPalindrom(str);
    }
    public static  void isPalindrom(String str){
        StringBuilder stb=new StringBuilder(str);
        StringBuilder stb2=stb.reverse();
        if (str.equalsIgnoreCase(String.valueOf(stb2))){
            System.out.println(str+" bir palindromdur");
        }else System.out.println("Degildir");

    }

}
