package Modelo;

import java.util.function.Predicate;

public class ListaDobleEnlazada<T> implements Lista.Interface_ListaDobleEnlazada<T> {
     private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public ListaDobleEnlazada() {
        cabeza = null;
        cola = null;
        tamano = 0;
    }
 // Método para agregar al final (enqueue)
    public void enqueue(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    // Método para remover y devolver el primer elemento (dequeue)
    public T dequeue() {
        if (cabeza == null) {
            throw new IndexOutOfBoundsException("La cola está vacía");
        }
        T valor = cabeza.getValor();
        cabeza = cabeza.getSiguiente();
        if (cabeza != null) {
            cabeza.setAnterior(null);
        } else {
            cola = null;
        }
        return valor;
    }

    public void agregarAlInicio(T valor) {
        // Crea un nuevo nodo con el valor dado, apuntando al nodo actual de la cabeza como siguiente
        // y null como anterior (ya que este será el nuevo inicio de la lista)
        Nodo<T> nuevoNodo = new Nodo<>(valor, cabeza, null);

        // Si la lista no está vacía, el nodo que ahora está en la cabeza debe tener como anterior al nuevo nodo
        if (cabeza != null) {
            cabeza.setAnterior(nuevoNodo);
        }

        // Actualiza la cabeza para que apunte al nuevo nodo
        cabeza = nuevoNodo;

        // Si la cola está vacía, este nuevo nodo también será la cola
        if (cola == null) {
            cola = nuevoNodo;
        }

        // Incrementa el tamaño de la lista
        tamano++;
    }

    public void agregarAlFinal(T valor) {
        // Crea un nuevo nodo con el valor dado, apuntando a null como siguiente
        // y al nodo actual de la cola como anterior (ya que este será el nuevo final de la lista)
        Nodo<T> nuevoNodo = new Nodo<>(valor, null, cola);

        // Si la lista no está vacía, el nodo que ahora está en la cola debe tener como siguiente al nuevo nodo
        if (cola != null) {
            cola.setSiguiente(nuevoNodo);
        }

        // Actualiza la cola para que apunte al nuevo nodo
        cola = nuevoNodo;

        // Si la cabeza está vacía, este nuevo nodo también será la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
        }

        // Incrementa el tamaño de la lista
        tamano++;
    }


    public boolean estaVacia() {
        // La lista está vacía si el tamaño es 0
        return tamano == 0;
    }


    public int tamano() {
        //retorna el tamaño actual de la lista
        return tamano;
    }

    public void insertarEnMedio(T valor, int indice) {
        // Verifica si el índice está fuera del rango válido
        if (indice < 0 || indice > tamano) {
            throw new IndexOutOfBoundsException("El índice está fuera del rango válido.");
        }

        // Verifica si el índice es 0
        if (indice == 0) {
            // Si es 0, inserta el valor en la cabeza de la lista
            agregarAlInicio(valor);
        } else if (indice == tamano) {
            // Verifica si el índice es igual al tamaño de la lista
            agregarAlFinal(valor);
        } else {
            // Si el índice está dentro del rango válido, pero no es 0 ni el tamaño de la lista
            Nodo<T> nodoAnterior = (Nodo<T>) obtenerNodoEnIndice(indice - 1);
            Nodo<T> nodoSiguiente = nodoAnterior.getSiguiente();
            Nodo<T> nuevoNodo = new Nodo<>(valor, nodoSiguiente, nodoAnterior);

            // Actualiza los enlaces correspondientes
            nodoAnterior.setSiguiente(nuevoNodo);
            if (nodoSiguiente != null) {
                nodoSiguiente.setAnterior(nuevoNodo);
            }

            // Incrementa el tamaño de la lista en 1
            tamano++;
        }
    }

  
    public T eliminarDelInicio() {
        // Verificamos si la lista está vacía
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía, no se puede eliminar ningún elemento.");
        }

        // Obtenemos el valor del primer nodo (cabeza de la lista)
        T valorEliminado = cabeza.getValor();

        // Actualizamos la referencia 'cabeza' para que apuntemos al siguiente nodo en la lista
        cabeza = cabeza.getSiguiente();

        // Si el nuevo nodo cabeza no es nulo, actualiza la referencia 'anterior' del nuevo nodo cabeza para que apunte a nulo
        if (cabeza != null) {
            cabeza.setAnterior(null);
        } else {
            // Si la lista quedó vacía después de la eliminación, actualiza la referencia 'cola' para que apunte a nulo
            cola = null;
        }

        // Disminuye el tamaño de la lista en 1
        tamano--;

        // Retorna el valor del nodo eliminado
        return valorEliminado;
    }

   
    public T eliminarDelFinal() {
        // Verifica si la lista está vacía
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía, no se puede eliminar ningún elemento.");
        }

        // Obtiene el valor del último nodo (cola de la lista)
        T valorEliminado = cola.getValor();

        // Actualiza la referencia 'cola' para que apunte al nodo anterior en la lista
        cola = cola.getAnterior();

        // Si el nuevo nodo 'cola' no es nulo, actualiza la referencia 'siguiente' del nuevo nodo 'cola' para que apunte a nulo
        if (cola != null) {
            cola.setSiguiente(null);
        } else {
            // Si la lista quedó vacía después de la eliminación, actualiza la referencia 'cabeza' para que apunte a nulo
            cabeza = null;
        }

        // Disminuye el tamaño de la lista en 1
        tamano--;

        // Retorna el valor del nodo eliminado
        return valorEliminado;
    }

    public T eliminarEnMedio(int indice) {
        // Verifica si el índice está fuera del rango válido
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException("El índice está fuera del rango válido.");
        }

        // Obtiene el nodo actual en el índice dado
        Nodo<T> nodoActual = (Nodo<T>) obtenerNodoEnIndice(indice);

        // Obtiene el valor del nodo actual, el nodo anterior y el siguiente nodo del nodo actual
        T valorEliminado = nodoActual.getValor();
        Nodo<T> nodoAnterior = nodoActual.getAnterior();
        Nodo<T> nodoSiguiente = nodoActual.getSiguiente();

        // Actualiza los enlaces correspondientes, dependiendo de si el nodo anterior o el siguiente nodo existen
        if (nodoAnterior != null) {
            nodoAnterior.setSiguiente(nodoSiguiente);
        } else {
            cabeza = nodoSiguiente;
        }

        if (nodoSiguiente != null) {
            nodoSiguiente.setAnterior(nodoAnterior);
        } else {
            cola = nodoAnterior;
        }

        // Disminuye el tamaño de la lista en 1
        tamano--;

        // Retorna el valor del nodo eliminado
        return valorEliminado;
    }


    public int buscarElemento(T valor) {
        // Inicializa un nodo actual en la cabeza de la lista y un contador índice a 0
        Nodo<T> nodoActual = cabeza;
        int indice = 0;

        // Utiliza un bucle 'while' para iterar mientras el nodo actual no sea nulo
        while (nodoActual != null) {
            // En cada iteración, compara el valor del nodo actual con el valor buscado
            if (nodoActual.getValor().equals(valor)) {
                // Si los valores son iguales, devuelve el contador índice para indicar la posición del valor en la lista
                return indice;
            }

            // Si el valor no se encuentra en el nodo actual, actualiza el nodo actual para que apunte al siguiente nodo en la lista
            nodoActual = nodoActual.getSiguiente();

            // Y aumenta el contador índice en 1
            indice++;
        }

        // Si el valor no se encuentra en ningún nodo de la lista, el bucle 'while' finaliza y el método devuelve -1 como indicador de que el valor no se encontró en la lista
        return -1;
    }

    public void mostrarLista() {
        // Inicializa un nodo actual en la cabeza de la lista
        Nodo<T> nodoActual = cabeza;

        // Imprime el encabezado para indicar que se está mostrando la lista
        System.out.print("Lista: ");

        // Utiliza un bucle 'while' para recorrer la lista
        while (nodoActual != null) {
            // Imprime el valor del nodo actual
            System.out.print(nodoActual.getValor() + " ");

            // Actualiza el nodo actual para que apunte al siguiente nodo en la lista
            nodoActual = nodoActual.getSiguiente();
        }

        // Imprime una nueva línea al final para separar la salida
        System.out.println();
    }

    /*
    metodos reciclados
     */
    public void delete_at(int indice) {
        // Validamos que el índice esté dentro del rango válido
        if (indice < 0 || indice >= tamano()) {
            throw new IndexOutOfBoundsException();
        }

        // Si el índice es 0, eliminamos la cabeza de la lista
        if (indice == 0) {
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
            } else {
                cola = null; // Si la lista quedó vacía, actualizamos 'cola'
            }
            tamano--;
            return;
        }

        // Buscamos el nodo anterior al nodo que se quiere eliminar
        Nodo<T> anterior = (Nodo<T>) obtenerNodoEnIndice(indice-1);

        // Eliminamos el nodo en la posición índice, actualizando los punteros
        Nodo<T> nodoEliminar = anterior.getSiguiente();
        anterior.setSiguiente(nodoEliminar.getSiguiente());
        if (nodoEliminar.getSiguiente() != null) {
            nodoEliminar.getSiguiente().setAnterior(anterior);
        } else {
            cola = anterior; // Si el nodo a eliminar era el último, actualizamos 'cola'
        }

        tamano--;
    }
    // Busca un elemento en la lista que cumpla con un criterio dado
    // Utiliza un Predicate para definir el criterio de búsqueda

    public T buscar(Predicate<T> criterio) {
        Nodo<T> nodoActual = cabeza;

        // Recorre la lista
        while (nodoActual != null) {
            // Si el valor actual cumple con el criterio especificado por el Predicate
            if (criterio.test(nodoActual.getValor())) {
                // Retorna el valor del nodo actual
                return nodoActual.getValor();
            }
            nodoActual = nodoActual.getSiguiente();
        }

        // Si no se encuentra ningún elemento que cumpla con el criterio, retorna null
        return null;
    }
    
    // Método auxiliar para obtener el nodo en un índice dado
 
    public T obtenerNodoEnIndice(int indice) {
        // Verifica si el índice está fuera del rango válido
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }

        // Inicializa el nodo actual como la cabeza de la lista
        Nodo<T> nodoActual = cabeza;
        // Itera sobre la lista hasta llegar al nodo en la posición especificada
        for (int i = 0; i < indice; i++) {
            nodoActual = nodoActual.siguiente;
        }

        // Devuelve el valor del nodo en la posición indicada
        return nodoActual.valor;

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

    // Clase interna Nodo
    private static class Nodo<T> {

        T valor;
        Nodo<T> siguiente;
        Nodo<T> anterior;

        public Nodo(T valor) {
            this(valor, null, null);
        }

        public Nodo(T valor, Nodo<T> siguiente, Nodo<T> anterior) {
            this.valor = valor;
            this.siguiente = siguiente;
            this.anterior = anterior;
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

        public Nodo<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo<T> anterior) {
            this.anterior = anterior;
        }

    }
}
