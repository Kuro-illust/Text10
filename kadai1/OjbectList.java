import java.util.ArrayList;
import java.util.List;

public class OjbectList<T> {
    private T value;
    public List<T> list = new ArrayList<>();

public void add(T value){
 //   if (Ivalue == null) {
 //       return;
 //   }
    this.list.add(value);
}
public T get(int index){
    return this.list.get(index);
}

public int size() {
    return this.list.size();
}

}