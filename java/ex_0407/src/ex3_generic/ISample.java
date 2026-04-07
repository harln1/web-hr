package ex3_generic;

public interface ISample<T> {
    void addElement(T item, int index);
    T getElement(int index);
}
