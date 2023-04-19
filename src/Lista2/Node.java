package Lista2;

public class Node<E> {

    private E data;
    private Node<E> next;

    public Node(E ele) {
        this.data = ele;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}
