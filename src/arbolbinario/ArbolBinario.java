/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Morad
 */
public class ArbolBinario {
  // Función para realizar el recorrido inorden del árbol
    private static void recorridoInorden(Nodo nodo) {
        if (nodo == null) {
            return;
        }

        recorridoInorden(nodo.izquierdo);
        System.out.print(nodo.valor + " ");
        recorridoInorden(nodo.derecho);
    }

    public static void main(String[] args) {
        // Creamos el árbol binario manualmente (podría ser una función para construir un árbol más grande)
        Nodo raiz = new Nodo(5);
        raiz.izquierdo = new Nodo(3);
        raiz.derecho = new Nodo(7);
        raiz.izquierdo.izquierdo = new Nodo(2);
        raiz.izquierdo.derecho = new Nodo(4);
        raiz.derecho.izquierdo = new Nodo(6);
        raiz.derecho.derecho = new Nodo(8);

        // Realizamos el recorrido inorden y mostrar los valores de los nodos en orden ascendente
        System.out.println("Recorrido inorden:");
        recorridoInorden(raiz);
    }
}

/*
El algoritmo de recorrido inorden para un árbol binario es una estrategia
para visitar todos los nodos del árbol siguiendo un patrón específico. 
Comenzamos desde la raíz del árbol y, recursivamente, primero recorremos
el subárbol izquierdo, luego visitamos el nodo actual y, finalmente,
recorremos el subárbol derecho. Este proceso se repite para cada nodo
del árbol, lo que nos permite recorrer todos los nodos en orden ascendente. 

El código en Java implementa un árbol binario pequeño manualmente,
donde cada nodo contiene un valor entero. La función `recorridoInorden`
realiza el recorrido inorden del árbol de manera recursiva. Comenzando 
desde la raíz, primero verifica si el nodo actual no es nulo, luego recorre 
el subárbol izquierdo, muestra el valor del nodo actual y, finalmente, 
recorre el subárbol derecho. Después de construir el árbol binario y
realizar el recorrido inorden, el programa muestra los valores de los 
nodos en orden ascendente, que en este caso sería "2 3 4 5 6 7 8". 
El recorrido inorden es útil para explorar los nodos de un árbol en orden 
ascendente, lo que puede ser útil en diversas aplicaciones y problemas 
relacionados con estructuras de datos y algoritmos basados en árboles.
*/