
package Logica;

import java.awt.Graphics;


public class classCola {
    
    private classNodo principio;
    private classNodo fin;
    private int tamanio;

    public classCola() {
        this.principio = null;
        this.fin = null;
        this.tamanio = 0;
    }
    
    public boolean Empty() {
        
        return principio == null;
    }    
    
    public void Push(classNodo nodo) {
        
        if(tamanio == 0) {
            principio = nodo;
            fin = nodo;
        } else { 
            fin.setSiguiente(nodo);
            fin = nodo;
        }
        tamanio++;
        
    }

    public classNodo Pop() {
        
        classNodo aux = principio;
        if(tamanio == 1) {
            principio = null;
            fin = null;
        } else {   
             principio = principio.getSiguiente();
        }
        tamanio--;
      
    return aux;
    }
    
    public classNodo Get(int i) {
        
        classNodo aux = principio;
        for(int j = 0; j < i; j++) {
            aux = aux.getSiguiente(); 
        }
        
    return aux;
    }
    
    public int tamano() {
        return tamanio;
    }
    
    public void Mostrar(Graphics draw) {
        
        draw.drawOval(10, 175, 75, 50);
        draw.drawLine(85, 200, 100, 200); 
        draw.drawString("Principio", 24, 203);
        int i = 0;
        for(i = 0; i < tamano(); i++) {
            Drawing(draw,100+(90*i), 175, 85, 50, Get(i));
        }
        
        draw.drawOval(100+(90*i), 175, 75, 50);
        draw.drawString("Fin", 100+(90*i)+28, 203);
    }
    
    private void Drawing(Graphics draw, int x, int y, int x1, int y1, classNodo nodo) {
            
            draw.drawOval(x, y, x1, y1);
            draw.drawLine(x+85, 200, x+90, 200); 
            draw.drawString(nodo.toString(), x+13,203);
        }

    public void Erase() {
        
        for(int i = 0; i < tamano(); i++) {
            classNodo aux = principio;    
            if(tamanio == 1) {
                principio = null;
                fin = null;
            } else {   
                 principio = principio.getSiguiente();
            }
           
        }
       tamanio--; 
    
    }
    
   
        
       /* int tamano = getTamano(pila);
        int i = tamano - 1;
        while (i >= 0) {
            pila[i] = null;
            i--;*/
            
}

    

