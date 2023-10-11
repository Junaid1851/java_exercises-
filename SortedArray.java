import java.util.Scanner;

public class SortedArray {
    private int len;
    private int[] array;;

    public static int[] getIntegers(int len){
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        int[] iarray=new int[len];
        System.out.println();
        for(int i=0;i<len;i++){
            int j=s.nextInt();
            iarray[i]=j;
            System.out.println();
        } s.close();
        return iarray;
   }
   public static int findMin(int[] array) {
       int temp = array[0];
       System.out.println(temp);
       for (int i = 0; i < array.length - 1; i++) {
           if (array[i] <= temp) {
               temp = array[i];


           }

       }  return temp;
   }
    public static int[]  sortIntegers(int [] array){
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<array.length-1;i++){
                if(array[i]<array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }
        }return array;
    }
public static void printArray(int [] array){
for(int i =0;i<array.length;i++){
    System.out.println("Element "+i+ " contents "+array[i]);
}
}
}
