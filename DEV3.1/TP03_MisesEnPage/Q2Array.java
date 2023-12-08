import java.util.ArrayList;
import java.util.List;

public class Q2Array<T> {
    private List<T> elements;

    public Q2Array() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public List<T> getListe() {
        return elements;
    }
}