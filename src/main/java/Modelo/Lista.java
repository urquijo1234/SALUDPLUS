package Modelo;

public interface Lista<T> {
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