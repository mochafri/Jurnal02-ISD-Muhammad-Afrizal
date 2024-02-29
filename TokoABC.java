import java.util.ArrayList;

public class TokoABC<E> {
    private final ArrayList<E> list;

    public TokoABC(int capacity){
        int initCapacity = capacity > 0? capacity:0;
        list = new ArrayList<>(initCapacity);
    }

    public void addData(E values){
        list.add(values);
    } 

    public void display(){
        for (int i = 0; i<list.size();i++) {
        System.out.printf(list.get(i) + " ");
        System.out.println();
        }
        
        }

    public void removeData(int entry){
        list.remove(entry);
    }
    
    public void setData(int object1, E object2){
        list.add(object1, object2);
    }   
}