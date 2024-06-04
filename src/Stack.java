import java.util.ArrayList;

public class Stack implements StackInterface{

    ArrayList arry =new ArrayList();
    public void add(Object o) {
    arry.add(o);
    }

    public Object pop() {
        if ((arry.size()-1) >= 0) {

            Object r = arry.get(arry.size() - 1);
            arry.remove(arry.size() - 1);
            return r;
        } else
            return "error";
    }//end of pop

    public Object peek() {
        return arry.get(size()-1);
    }

    public boolean isEmpty() {
        if (arry.size()-1 >= 0) {
            return false;
        }else
            return true;
    }

    public int size() {
        return arry.size();
    }
}
