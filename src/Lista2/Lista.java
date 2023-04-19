/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

/**
 *
 * @author ASUS
 */
public class Lista<E> {

    private Node<E> head;
    private int size = 0;

    public Lista() {
    }

    public boolean estaVacia() {

        return head == null;

    }

    public void addInicio(E element) {
        if (this.estaVacia()) {
            head = new Node<E>(element);
        } else {
            //head = new Node<>(element);
            Node<E> temp = head;
            Node<E> nuevo = new Node(element);
            nuevo.setNext(temp);
            head = nuevo;
        }
        size++;
    }

    public void addFinal(E element) {
        if (this.estaVacia()) {
            head = new Node<E>(element);
            size++;
        } else {
            Node<E> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }

            Node<E> nuevo = new Node<>(element);
            current.setNext(nuevo);
        }
    }

    public E primerElemento() {

        return head.getData();

    }

    //public E ultimoElemento(){
    //    return 
    //}
    public boolean buscarDato(E element) {

        boolean encontrar = false;
        Node<E> current = head;

        while (encontrar != true && current != null) {
            if (element.equals(current.getData())) {
                encontrar = true;
            } else {
                current = current.getNext();
            }
            if (encontrar == true) {
                break;
            }
        }

        return encontrar;
    }

    public E removeInicio() {
        
        String eliminado;
        
        
        return null;
        
    }

    public void mostrarLista() {
        Node<E> aux = head;
        while (aux != null) {
            System.out.print("[ " + aux.getData() + " ]--> ");
            aux = aux.getNext();
        }
    }
}
