package Modelo;

import java.util.function.Predicate;

public interface Lista {
  public interface Interface_ListaSimple<T> extends Lista {
        void append(T valor); // Agrega un valor al final de la lista
    void prepend(T valor); // Agrega un valor al principio de la lista
    void insert(T valor, int indice); // Inserta un valor en un índice específico
    T get_element_at(int indice); // Obtiene el elemento en una posición específica
    int find(T valor); // Busca un valor en la lista y devuelve su índice, -1 si no se encuentra
    void remove(T valor); // Elimina la primera ocurrencia del valor dado en la lista
    void delete_at(int indice); // Elimina el elemento en el índice dado de la lista
    boolean is_empty(); // Verifica si la lista está vacía
    int size(); // Devuelve el tamaño de la lista
    void reverse(); // Invierte el orden de los elementos en la lista
    T get_head(); //Retorna el primer nodo de la lista
    T get_tail(); //Retorna el ultimo nodo de la lista    
    void ordenarLista(); //Ordena la lista de mayor a menor
    void eliminarDuplicados(); // Elimina todos los elementos duplicados en la lista
    ListaSimple<T> encontrarNumerosImpares(); // Encuentra y devuelve una lista de todos los números impares en la lista
    }

    public interface Cola<T> extends Lista {

        void enqueue(T elemento);

        T dequeue();

        T peek();

        boolean estaVacia();
    }
    public interface Interface_ListaDobleEnlazada<T> extends Lista{
    void agregarAlInicio(T valor);// Agrega un nuevo elemento al inicio de la lista
    void agregarAlFinal(T valor);// Agrega un nuevo elemento al final de la lista
    T eliminarDelInicio();// Elimina el primer elemento de la lista y lo devuelve
    T eliminarDelFinal();// Elimina el último elemento de la lista y lo devuelve
    boolean estaVacia();// Verifica si la lista está vacía
    int tamano();// Devuelve el tamaño actual de la lista
    void insertarEnMedio(T valor, int indice);   // Inserta un elemento en una posición específica de la lista
    T eliminarEnMedio(int indice); // Elimina un elemento en una posición específica de la lista y lo devuelve    
    int buscarElemento(T valor);// Busca un elemento en la lista y devuelve su índice
    void mostrarLista();// Muestra todos los elementos de la lista   
    void delete_at(int indice); // Elimina un elemento en una posición específica de la lista sin devolverlo    
    T buscar(Predicate<T> criterio);// Busca un elemento en la lista que cumpla con un criterio dado 
     T obtenerNodoEnIndice(int indice);
     void remove(T valor);
     void enqueue(T valor);
     T dequeue();
    } 
}