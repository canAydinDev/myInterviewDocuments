package interviewQuestions3;
/*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */
public class MyAnswer06 {
    public static void main(String[] args) {
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        System.out.println(kacEleman(arr));
    }
    public static int kacEleman(int[] []arr){
        int count=0;
        for (int[] w: arr){
            for (int j:w){
                count++;
            }

        }
        return count;
    }
}
