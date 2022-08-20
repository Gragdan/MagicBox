public class MagicBox<T> {
    public int size;
//    private T item;
 public T[] items = (T[]) new Object[size];
 public int[] five;

    public  MagicBox( int size){
     //   this.items = (T[]) items;
        this.size = size;
    }

}
