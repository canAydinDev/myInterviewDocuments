package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class MyAnswer02 {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {

        System.out.println(changeList(randomList()));
    }
    public static List<Integer> randomList(){
     List<Integer> myList=new ArrayList<>();
     int count=0;
     while (count<10){
         myList.add((int)(Math.random()*20));
         count++;
     }
     return myList;
    }
    public static List<Integer> changeList(List<Integer> myList){
        int count=0;
        for (int i=0; i<myList.size(); i++){
            if (myList.get(i)%2==0){
                myList.set(i,111);
                count++;
            }
        }
        if (count==0){
            System.out.println("cift sayi yoktur");
        }
        return myList;
    }
}
