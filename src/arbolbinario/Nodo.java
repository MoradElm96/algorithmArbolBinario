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
class Nodo {
  int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

/*
Nodo es una clase que representa un nodo en un árbol binario.
Cada nodo contiene un valor entero (int valor) y
dos referencias a otros nodos, izquierdo y derecho,
que representan los hijos izquierdo y derecho del nodo actual, respectivamente.

El constructor de la clase Nodo se utiliza para crear
un nuevo nodo con un valor específico. 
Cuando se crea un nodo, inicialmente se establece
su valor en el valor proporcionado y las referencias a 
los nodos izquierdo y derecho se establecen en null, ya que el nodo aún no tiene hijos.

Esta clase es esencial para construir un árbol binario,
ya que cada nodo actúa como un punto de conexión entre 
los demás nodos, permitiendo así la construcción de una estructura 
jerárquica en forma de árbol. Cada nodo puede tener cero, uno o dos hijos,
dependiendo de si es un nodo hoja, un nodo interno con 
un solo hijo o un nodo interno con dos hijos, respectivamente.
*/