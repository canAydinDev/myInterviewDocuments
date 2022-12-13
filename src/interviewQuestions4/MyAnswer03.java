package interviewQuestions4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyAnswer03 {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
   static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bir string giriniz");
        String str=input.nextLine().toLowerCase();
        hackerLanguage(str);
        strigCevir(str);

    }
    public static void hackerLanguage(String str){
        String [] arr=str.split("");

        for (int i=0; i<arr.length; i++){
            switch (arr[i]){
                case "s":
                    arr[i]="5";
                    break;
                case "a":
                    arr[i]="4";
                    break;
                case "e":
                    arr[i]="3";
                    break;
                case "i":
                    arr[i]="1";
                    break;
                case "o":
                    arr[i]="0";
                    break;
            }
            System.out.print(arr[i]);
        }


    }
    public static void strigCevir(String str){

        str=str.replaceAll("s","5");

        str=str.replaceAll("a","4");
        str=str.replaceAll("e","3");
        str=str.replaceAll("i","2");
        str=str.replaceAll("o","0");

        System.out.println(str);
    }
}
