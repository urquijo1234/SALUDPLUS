package Modelo;

import java.util.*;
import java.io.Serializable;

public class ListaSimple<T> implements Lista.Interface_ListaSimple<T>  {

    private Nodo<T> cabeza;

    // Constructor para inicializar la lista vacía
    public ListaSimple() {
        this.cabeza = null;
    }

    // Método para agregar al final
    public void append(T valor) {
        if (cabeza == null) {
            cabeza = new Nodo<>(valor);
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(new Nodo<>(valor));
    }

    // Método para agregar al principio
    public void prepend(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor, cabeza);
        cabeza = nuevoNodo;
    }

    // Método para insertar en una posición específica
    public void insert(T valor, int indice) {
        // Validamos que el índice esté dentro del rango válido
        if (indice < 0 || indice > size()) {
            throw new IndexOutOfBoundsException();
        }

        // Si el índice es 0, llamamos al método prepend para insertar al principio
        if (indice == 0) {
            prepend(valor);
            return;
        }

        // Si el índice es igual al tamaño, llamamos al método append para insertar al final
        if (indice == size()) {
            append(valor);
            return;
        }

        // Caso general: insertamos en una posición intermedia
        Nodo<T> actual = cabeza;
        for (int i = 0; i < indice - 1; i++) {
            actual = actual.getSiguiente(); //iteramos hasta la posicion anterior a la insercion
        }
        Nodo<T> nuevoNodo = new Nodo<>(valor, actual.getSiguiente());//obtenemos y le pasamos el actual de la busqueda
        actual.setSiguiente(nuevoNodo); //setiamos el valor de nuestra referencia actual con el valor del nodo de la busqueda
    }

    // Método para obtener el valor en una posición específica
    public T get_element_at(int indice) {
        // Validamos que el índice esté dentro del rango válido
        if (indice < 0 || indice >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Nodo<T> actual = cabeza; //apuntamos al primer nodo de la lista
        for (int i = 0; i < indice; i++) { 
            actual = actual.getSiguiente(); //iteramos y obtenemos hasta la posicion exacta en la lista por eso no va -1
        }
        return actual.getValor();
    }

    public int find(T valor) {
        // Referenciamos al nodo actual en la lista
        Nodo<T> actual = cabeza;
        // Declaramos la variable que almacena el índice del nodo actual.         
        int indice = 0;

        // Mientras el nodo actual no sea nulo (es decir, mientras no se haya llegado al final de la lista)
        while (actual != null) {
            // Si el valor del nodo actual es igual al valor buscado
            if (actual.getValor().equals(valor)) {
                // Devuelve el valor de la variable indice
                return indice;
            }

            // Si el valor del nodo actual no es igual al valor buscado
            // Avanza al siguiente nodo en la lista
            actual = actual.getSiguiente();
            // Incrementa el valor de la variable indice en 1
            indice++;
        }

        // Si el valor no se encuentra en la lista, devuelve -1
        return -1;
    }

    public void remove(T valor) {
        // Si la lista está vacía, no hay nada que hacer 
        if (cabeza == null) {
            return;
        }
        // Si el valor a eliminar está en la cabeza de la lista
        if (cabeza.getValor().equals(valor)) {
            cabeza = cabeza.getSiguiente();
            return;
        }
        // Buscamos el nodo anterior al nodo con el valor a eliminar utilizando el puntero anterior
        Nodo<T> anterior = cabeza;
        while (anterior.getSiguiente() != null && !anterior.getSiguiente().getValor().equals(valor)) {
            anterior = anterior.getSiguiente(); // se recorre la lista hasta encontrar el nodo con el valor a eliminar o hasta llegar al final
        }
        // Si encontramos el nodo con el valor a eliminar
        if (anterior.getSiguiente() != null) {
            // Setiamos el nodo con el valor a eliminar
            anterior.setSiguiente(anterior.getSiguiente().getSiguiente()); // e actualiza el puntero anterior para que apunte al siguiente nodo en la lista
        }
    }

    public void delete_at(int indice) {
        // Validamos que el índice esté dentro del rango válido
        if (indice < 0 || indice >= size()) {
            throw new IndexOutOfBoundsException();
        }

        // Si el índice es 0, eliminamos la cabeza de la lista
        if (indice == 0) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        // Buscamos el nodo anterior al nodo que se quiere eliminar
        Nodo<T> anterior = cabeza; //usamos la referencia anterior
        for (int i = 0; i < indice - 1; i++) {
            anterior = anterior.getSiguiente(); //recorremos la lista hasta encontrar el nodo anterios al nodo con el indice especificado
        }

        // Eliminamos el nodo en la posición índice, actualizando el puntero anterior para que apunte al nodo siguiente al nodo a eliminar
        anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
    }

    public boolean is_empty() {
        // Si la cabeza es nula, significa que la lista está vacía
        // Por lo tanto, retornamos true, indicando que la lista está vacía
        return cabeza == null;
    }

    public int size() {
        // Inicializamos el contador de tamaño en 0
        int size = 0;

        // Referenciamos al primer nodo de la lista
        Nodo<T> actual = cabeza;

        // Recorremos la lista mientras el nodo actual no sea nulo
        while (actual != null) {
            // Incrementamos el contador de tamaño en 1
            size++;
            // Movemos el puntero al siguiente nodo
            actual = actual.getSiguiente();
        }

        // Retornamos el tamaño de la lista
        return size;
    }

    public void reverse() {
        // Si la lista está vacía o tiene solo un elemento, no hay necesidad de invertirla
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return;
        }

        // Inicializamos tres nodos para seguir el proceso de inversión
        Nodo<T> anterior = null; // Nodos para mantener la referencia al nodo anterior
        Nodo<T> actual = cabeza; // Nodo actual que estamos procesando
        Nodo<T> siguiente = null; // Nodos para mantener la referencia al siguiente nodo

        // Recorremos la lista mientras haya nodos para procesar
        while (actual != null) {
            // Guardamos el siguiente nodo antes de cambiar la referencia del actual
            siguiente = actual.getSiguiente();
            // Cambiamos la referencia del actual para que apunte al nodo anterior
            actual.setSiguiente(anterior);
            // Movemos los nodos un paso hacia adelante
            anterior = actual;
            actual = siguiente;
        }

        // Finalmente, actualizamos la cabeza de la lista para que apunte al último nodo (anterior)
        cabeza = anterior;
    }

    // Método para obtener el primer elemento de la lista
    public T get_head() {
        Nodo<T> actual = cabeza;
        if (actual != null) { // Si la cabeza no es nula
            return cabeza.getValor(); // Devuelve el valor de la cabeza
        } else {
            return null; // Si la lista está vacía, devuelve null
        }
    }

    // Método para obtener el último elemento de la lista
    public T get_tail() {
        Nodo<T> actual = cabeza;
        if (actual == null) { // Si la lista está vacía
            return null; // Devuelve null
        }
        while (actual.getSiguiente() != null) { // Recorre la lista hasta llegar al último nodo
            actual = actual.getSiguiente();
        }
        return actual.getValor(); // Devuelve el valor del último nodo
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.getValor());
            if (actual.getSiguiente() != null) {
                sb.append(" -> ");
            }
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    /*
    ejercicios adicionales
     */
    public void ordenarLista() {
    // Si la lista está vacía o tiene solo un elemento, no hay necesidad de ordenarla
    if (cabeza == null || cabeza.getSiguiente() == null) {
        return;
    }

    boolean intercambio; // Variable para verificar si se hizo algún intercambio durante una pasada
    do {
        intercambio = false; // Inicialmente no hay intercambios
        Nodo<T> actual = cabeza;
        Nodo<T> anterior = null;

        // Iteramos sobre la lista
        while (actual.getSiguiente() != null) { //Dentro del bucle while, se compara el valor del nodo actual con el valor del siguiente nodo.
            //Si el valor del nodo actual es menor que el del siguiente nodo (se está ordenando en orden descendente), se intercambian los nodos.
           
            if (((Comparable<T>) actual.getValor()).compareTo(actual.getSiguiente().getValor()) < 0) {
                Nodo<T> burbuja = actual.getSiguiente(); // Guardamos el nodo siguiente temporalmente
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); //se realiza el intercambio de los nodos actual y siguiente
                burbuja.setSiguiente(actual); // Nodo siguiente apunta a nodo actual
                if (anterior == null) { // Si estamos en la cabeza de la lista, actualizamos la cabeza
                    cabeza = burbuja;
                } else {
                    anterior.setSiguiente(burbuja); // Conectamos el nodo anterior al nodo burbuja
                }
                intercambio = true; // Marcamos que se realizó un intercambio
            }
            // Movemos los punteros al siguiente par de nodos
            anterior = actual;
            actual = actual.getSiguiente();
        }
    } while (intercambio); // Seguimos iterando hasta que no haya más intercambios
}
    
    
    public ListaSimple<T> encontrarNumerosImpares() {
        // Crear una nueva lista para almacenar los números impares
        ListaSimple<T> numerosImpares = new ListaSimple<>();

        // Inicializar un puntero para recorrer la lista original
        Nodo<T> actual = cabeza;

        // Recorrer la lista original hasta que el puntero sea nulo (fin de la lista)
        while (actual != null) {

            // Verificar si el valor del nodo actual es un número entero
            if (actual.getValor() instanceof Integer) {

                // Convertir el valor del nodo actual a un entero
                Integer valor = (Integer) actual.getValor();

                // Verificar si el entero es impar (el residuo de la división por 2 no es 0)
                if (valor % 2 != 0) {

                    // Añadir el entero impar a la lista de números impares
                    numerosImpares.append(actual.getValor());
                }
            }

            // Avanzar al siguiente nodo en la lista original
            actual = actual.getSiguiente();
        }

        // Devolver la lista de números impares
        return numerosImpares;
    }

    public void eliminarDuplicados() {
        // Si la lista está vacía o tiene solo un elemento, no hay duplicados que eliminar
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return;
        }

        // Creamos un conjunto para rastrear los elementos únicos
        Set<T> elementosUnicos = new HashSet<>();

        // Inicializamos un puntero para el nodo anterior y el nodo actual
        Nodo<T> anterior = null;
        Nodo<T> actual = cabeza;

        // Recorremos la lista original hasta que el puntero actual sea nulo (fin de la lista)
        while (actual != null) {

            // Verificamos si el valor del nodo actual ya está en el conjunto de elementos únicos
            if (elementosUnicos.contains(actual.getValor())) {

                // Si el elemento actual ya está en el conjunto, lo eliminamos de la lista
                anterior.setSiguiente(actual.getSiguiente());
            } else {

                // Si el elemento actual no está en el conjunto, lo agregamos
                elementosUnicos.add(actual.getValor());

                // Actualizamos el nodo anterior para seguir avanzando en la lista
                anterior = actual;
            }

            // Movemos al siguiente nodo en la lista original
            actual = actual.getSiguiente();
        }
    }
    
    

    // Clase interna Nodo
    private static class Nodo<T> {

        private T valor;
        private Nodo<T> siguiente;

        public Nodo(T valor) {
            this(valor, null);
        }

        public Nodo(T valor, Nodo<T> siguiente) {
            this.valor = valor;
            this.siguiente = siguiente;
        }

        public T getValor() {
            return valor;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }

    }
}

