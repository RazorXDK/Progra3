/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.arbolBB;

/**
 *
 * @author Bryan
 */
public class ArbolAVL {

    private NodoArbolAVL raiz;

    public ArbolAVL() {
        raiz = null;
    }

    //Buscar nodo
    public NodoArbolAVL buscar(int d, NodoArbolAVL r) {
        if (raiz == null) {
            return null;

        } else if (r.dato == d) {
            return r;

        } else if (r.dato < d) {
            return buscar(d, r.der);
        } else {
            return buscar(d, r.izq);
        }
    }

    ;
    
    //Metodo para obtener el factor de equilibrio
    
    public int obtenerFE(NodoArbolAVL x) {
        if (x == null) {
            return -1;
        } else {
            return x.fe;
        }
    }

    ;
    
    //Rotacion simple izquierda
    
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.izq;
        c.izq = auxiliar.der;
        auxiliar.der = c;
        c.fe = Math.max(obtenerFE(c.izq), obtenerFE(c.der)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.izq), obtenerFE(auxiliar.der)) + 1;
        return auxiliar;
    }

    //Rotacion simple derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.der;
        c.der = auxiliar.izq;
        auxiliar.izq = c;
        c.fe = Math.max(obtenerFE(c.izq), obtenerFE(c.der)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.izq), obtenerFE(auxiliar.der)) + 1;
        return auxiliar;
    }

    //Rotacion Doble Izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c) {
        NodoArbolAVL auxiliar;
        c.izq = rotacionDerecha(c.izq);
        auxiliar = rotacionIzquierda(c);
        return auxiliar;
    }

    //Rotacion Doble Derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c) {
        NodoArbolAVL auxiliar;
        c.der = rotacionIzquierda(c.der);
        auxiliar = rotacionDerecha(c);
        return auxiliar;
    }

    //Metodo Insertar
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArb) {
        NodoArbolAVL nuevoP = subArb;
        if (nuevo.dato < subArb.dato) {
            if (subArb.izq == null) {
                subArb.izq = nuevo;
            } else {
                subArb.izq = insertarAVL(nuevo, subArb.izq);
                if ((obtenerFE(subArb.izq) - obtenerFE(subArb.der) == 2)) {
                    if (nuevo.dato < subArb.izq.dato) {
                        nuevoP = rotacionIzquierda(subArb);

                    } else {
                        nuevoP = rotacionDobleIzquierda(subArb);
                    }
                }

            }

        } else if (nuevo.dato > subArb.dato) {
            if (subArb.der == null) {
                subArb.der = nuevo;
            } else {
                subArb.der = insertarAVL(nuevo, subArb.der);
                if ((obtenerFE(subArb.der) - obtenerFE(subArb.izq) == 2)) {
                    if (nuevo.dato > subArb.der.dato) {
                        nuevoP = rotacionDerecha(subArb);
                    } else {
                        nuevoP = rotacionDobleDerecha(subArb);
                    }
                }
            }
        } else {
            System.out.println("Nodo duplicado");
        }

        //Actualizar la altura
        if ((subArb.izq == null) && (subArb.der != null)) {
            subArb.fe = subArb.der.fe + 1;
        } else if ((subArb.der == null) && (subArb.izq != null)) {
            subArb.fe = subArb.izq.fe + 1;
        } else {
            subArb.fe = Math.max(obtenerFE(subArb.izq), obtenerFE(subArb.der)) + 1;
        }
        return nuevoP;
    }

    //Metodo para insetar
    public void insertar(int d) {
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }
    
  
}
