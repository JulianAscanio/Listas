package listas;

public class ListaEnlazada<E> {

    private Node<E> head;
    private int size = 0;

    public ListaEnlazada(Node head) {
        this.head = null;
    }

    public ListaEnlazada() {
    }

    public Object obtener(int index) {
        int cont = 0;
        Node<E> temp = head;
        while (cont < index) {
            temp = temp.getNext();
            cont++;
        }
        return temp.getData();
    }

    public void addPrimero(Object obj) {
        if (head == null) {
            head = new Node(obj);
        } else {
            Node<E> temp = head;
            Node<E> nuevo = new Node(obj);
            nuevo.setNext(temp);
            head = nuevo;
        }
        size++;
    }
    
    public void cortar(int index){
        int cont = 0;
            Node<E> temp = head;
            while (cont < index-1) {
                temp = temp.getNext();
                cont++;
            }
            temp.setNext(null);
            size = index;
    }

    public void remove(int index) {

        if (index == 0) {
            head = head.getNext();
        } else {
            int cont = 0;
            Node<E> temp = head;
            while (cont < index - 1) {
                temp = temp.getNext();
                cont++;
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

    public void removePrimerElemento() {
        head = head.getNext();
        size--;
    }

    public int size() {
        return size;
    }

    public boolean estaVacia() {
        return (head == null);
    }

}
