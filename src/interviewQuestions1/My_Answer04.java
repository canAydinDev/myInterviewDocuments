package interviewQuestions1;

import java.util.Scanner;

public class My_Answer04 {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        String pin="hello";
        System.out.println();
        sifreBul(pin);
    }
    public static void sifreBul(String pin){
        int count =3;
        do {

            System.out.println("Bir pin giriniz\ntoplam " +count+" hakkiniz kaldi");
            String str=input.nextLine();
            if (str.equals(pin)){
                System.out.println("pin dogru");
                break;
            }else {
                System.out.println("hatali giris yaptiniz");
                count--;
            }

        }while(count>0);
    }
}
