package interviewQuestions4;

public class MyAnswer04 {
     /*
    ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin 7 dogru cevabi var.
    2 nolu ogrencinin 6 dogru cevabi var.
       "           "
       "           "
       "           "
    8 nolu ogrencinin 7 dogru cevabi var.
*/
     public static void main(String[] args) {
         char[][] answers = {
                 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

         char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

         sonuclarriVer(answers,keys);

     }
     public static void sonuclarriVer(char[][] answers,char[] keys){
         int ogrnSayi=1;
         for (char[] w:answers){
             int count=0;

             for (int i=0; i<w.length; i++){
                 if (w[i]==keys[i]){
                     count++;
                 }
             }
             System.out.println(ogrnSayi+ " nolu ogrencinin "+ count+ " dogru cevabi vardir");
             ogrnSayi++;

         }
     }
}
