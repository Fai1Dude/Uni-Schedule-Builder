import java.util.ArrayList;

public class LAB23 {
    
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 2;i<101;i++){list1.add(i);}

        for(int i = 0;i<list1.size();i++){
            for(int j = i+1;j<list1.size();j++){
                if(list1.get(j) % list1.get(i) == 0){
                    list1.remove(j);}}
        }
        System.out.println(list1);
    }
}
