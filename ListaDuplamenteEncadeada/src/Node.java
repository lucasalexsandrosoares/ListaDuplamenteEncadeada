
public class Node<T> {

    private T value;
    private Node<T> next;
    private Node<T> anterior;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public Node<T> getAnterior(){
        return  anterior;
    }
    public void setAnterior(Node<T> anterior){
        this.anterior = anterior;
    }
}
