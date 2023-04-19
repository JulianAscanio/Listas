package listas;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada list = new ListaEnlazada();
        
        list.addPrimero(6);
        list.addPrimero(5);
        list.addPrimero(4);
        list.addPrimero(3);
        list.addPrimero(2);
        list.addPrimero(1);
        
        list.cortar(3);
        
        System.out.println("Primer Elemento: " + list.obtener(0));
        //System.out.println("index 2: "+list.obtener(2));
        System.out.println("Ultimo Elemto: " + list.obtener(list.size() - 1));
        System.out.println("Tamaño: " + list.size());
        //System.out.println("Esta vacia: " + list.estaVacia());

    }
}
