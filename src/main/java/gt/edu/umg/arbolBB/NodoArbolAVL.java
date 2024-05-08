/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.arbolBB;

/**
 *
 * @author Bryan
 */
public class NodoArbolAVL {

    int dato, fe;
    NodoArbolAVL izq;
    NodoArbolAVL der;

    public NodoArbolAVL(int d) {
        this.dato = d;
        this.fe = 0;
        this.izq = null;
        this.der = null;
    }

}
