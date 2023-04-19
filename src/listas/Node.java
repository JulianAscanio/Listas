package listas;

public class Node<E> {

    private E data;
    private Node<E> next;// Puntero

    public Node(E valor) {
        this.data = valor;
    }

    public E getData() {
        return data;
    }

    public void setNext(Node<E> n) {
        this.next = n;
    }

    public Node<E> getNext() {
        return next;
    }
}
