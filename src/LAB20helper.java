public class LAB20helper {
    public static void main(String[] args){
        int[] Array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(recursiveLinearSearch(Array1,9));
    }
    public static int recursiveLinearSearch(int[] array, int target){
        return recursiveLinearSearch(array, target,0);
    }
    public static int recursiveLinearSearch(int[] array, int target,int n){
        if(array[n]==target){return n;}
        else{return recursiveLinearSearch(array,target,n+1);}
    }
}
