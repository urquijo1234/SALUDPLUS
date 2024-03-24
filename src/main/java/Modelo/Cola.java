package Modelo;

public  class Cola<T> implements Lista.Cola<T> {
 // Atributos de nuestra clase
    private Nodo<T> cabeza; // Nodo que representa la cabeza de la cola
    private Nodo<T> cola; // Nodo que representa la cola de la cola

    // Constructor de la clase
    public Cola() {
        this.cabeza = null; // Inicializa la cabeza como nulo
        this.cola = null; // Inicializa la cola como nulo
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    // Método para agregar un elemento a la cola
    public void enqueue(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento); // Crea un nuevo nodo con el elemento proporcionado
        if (estaVacia()) {
            cabeza = nuevoNodo; // Si la cola está vacía, establece el nuevo nodo como la cabeza
        } else {
            cola.setSiguiente(nuevoNodo); // Si la cola no está vacía, establece el siguiente del último nodo como el nuevo nodo
        }
        cola = nuevoNodo; // Actualiza la cola para que apunte al nuevo nodo
    }

    // Método para remover y devolver el primer elemento de la cola
    public T dequeue() {
        if (estaVacia()) {
            throw new IndexOutOfBoundsException("La cola esta vacia"); // Lanza una excepción si la cola está vacía
        }
        T valor = cabeza.getValor(); // Obtiene el valor del primer elemento en la cola
        cabeza = cabeza.getSiguiente(); // Establece el siguiente nodo como la nueva cabeza
        if (cabeza == null) {
            cola = null; // Si la cola queda vacía después de eliminar el primer elemento, actualiza la cola como nula
        }
        return valor; // Devuelve el valor del primer elemento
    }

    // Método para obtener el primer elemento de la cola sin removerlo
    public T peek() {
        if (estaVacia()) {
            throw new IndexOutOfBoundsException("La cola esta vacia"); // Lanza una excepción si la cola está vacía
        }
        return cabeza.getValor(); // Devuelve el valor del primer elemento en la cola
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return cabeza == null; // Devuelve verdadero si la cabeza es nula, lo que indica que la cola está vacía
    }

  

//    // Método para eliminar un elemento específico de la cola
//    public T dequeue(T elementoAEliminar) {
//        if (estaVacia()) {
//            throw new IndexOutOfBoundsException("La cola esta vacia"); // Lanza una excepción si la cola está vacía
//        }
//
//        // Verifica si el elemento a eliminar es el primero en la cola
//        if (cabeza.getValor().equals(elementoAEliminar)) {
//            return dequeue(); // Si es así, utiliza el método dequeue para eliminarlo y devolverlo
//        }
//
//        // Itera sobre la cola para encontrar el elemento a eliminar
//        Nodo<T> guia = cabeza;
//        while (guia.getSiguiente() != null && !guia.getSiguiente().getValor().equals(elementoAEliminar)) {
//            guia = guia.getSiguiente(); // Avanza al siguiente nodo hasta encontrar el elemento o llegar al final de la cola
//        }
//
//        // Verifica si se encontró el elemento a eliminar
//        if (guia.getSiguiente() != null) {
//            if (guia.getSiguiente() == cola) {
//                cola = guia; // Si el siguiente nodo es la cola, actualiza la cola
//            }
//            T valor = guia.getSiguiente().getValor(); // Obtiene el valor del nodo a eliminar
//            guia.setSiguiente(guia.getSiguiente().getSiguiente()); // Elimina el nodo actualizando las referencias
//            return valor; // Devuelve el valor del nodo eliminado
//        } else {
//            throw new IndexOutOfBoundsException("El elemento especificado no está en la cola"); // Lanza una excepción si no se encuentra el elemento
//        }
//    }

    public static class Nodo<T> {

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
