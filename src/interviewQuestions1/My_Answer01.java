package interviewQuestions1;

import java.util.HashMap;

public class My_Answer01 {
     /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

    public static void main(String[] args) {
      String chr="alacan";
       chrCount(chr);

    }

    public static void chrCount(String  chr){
        HashMap<String,Integer> myMap=new HashMap<>();

       String []newChr=new String[chr.length()];
       newChr=chr.split("");

        int i=0;
       while (i<newChr.length){

           if(myMap.get(newChr[i])==null){
               myMap.put(newChr[i],1);
           }else {
               myMap.replace(newChr[i],myMap.get(newChr[i])+1);
           }
           i++;
       }
        System.out.println(myMap);
    }
}
