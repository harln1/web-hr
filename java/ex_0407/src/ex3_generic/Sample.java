package ex3_generic;

public class Sample<T> implements ISample<T> {
    private Object[] array;

    public Sample(int size) {
        array = new Object[size];
    }

    @Override
    public void addElement(T item, int index) {
        array[index] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        return (T) array[index];
    }

    public static void main(String[] args) {
        Sample<String> sample = new Sample<>(10);
        sample.addElement("This is String ", 5);
        System.out.println(sample.getElement(5));
    }
}
 
