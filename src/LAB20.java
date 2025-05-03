
public class LAB20 {
    public static void main(String[] args){
        int[] Array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(recursiveLinearSearch(Array1,9));
    }
   
    public static int recursiveLinearSearch(int[] array, int target){
        int[] newArray1 = new int[array.length-1];
        for (int i=0;i<array.length-1;i++){newArray1[i]=array[i];}
        if (array[array.length-1]==target){return (array.length-1);}
        else {return recursiveLinearSearch(newArray1, target);}
    }
}
