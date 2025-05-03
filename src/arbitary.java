import java.util.ArrayList;

public class arbitary<T> {
    private ArrayList<T> list;

    public arbitary(){
        list = new ArrayList<>();
    }

    public void add(T string){
        list.add(string);
    }
    public T remove(){
        if(list.size()>0){
        T x = list.remove(0);
        return x;}
        else {return null;}
    }
}
