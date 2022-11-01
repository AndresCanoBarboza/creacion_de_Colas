
package Logica;


public class classNodo {
    
     private int numero;
    private classNodo siguiente;

    // Constructor
    
    public classNodo(int numero, classNodo siguiente) {
        this.numero = numero;
        this.siguiente = siguiente;
    }

    public classNodo(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }

    public classNodo() {
        this.numero = 0;
        this.siguiente = null;
    }

    //getter setter
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public classNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(classNodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "num= " + numero;
    }
    
}
