package ex3_generic;

public class DataList<T> {
    private Object[] data;
    private int size;
    private int defaultSize = 10;

    public DataList() {
        this.data = new Object[defaultSize];
    }

    public DataList(int size) {
        this.data = new Object[size];
    }

    public void add(T value) {
        data[size++] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }
}


