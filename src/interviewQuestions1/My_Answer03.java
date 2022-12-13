package interviewQuestions1;

import java.util.Scanner;

public class My_Answer03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir sayi giriniz");
        int num= input.nextInt();

        System.out.println("is "+num+ " a prime number? "+isPrime(num));

    }
    public static boolean isPrime(int num){
        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
