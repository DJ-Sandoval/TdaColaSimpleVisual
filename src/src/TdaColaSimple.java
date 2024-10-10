/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jose
 */
public class TdaColaSimple {
   private final int MAXCOLA;
    private int frente;
    private int fin;
    private Object cola[];

    public TdaColaSimple(int maxCola) {
        MAXCOLA = maxCola;
        frente = 0;
        fin = -1;
        cola = new Object[MAXCOLA];
    }
    
    public void inicializarCola() {
        frente = 0;
        fin = -1;
    }
    
    public boolean colaVacia() {
        return frente > fin;
    }
    
    public boolean colaLlena() {
        return frente == 0 && fin == MAXCOLA - 1;
    }
    
    public Object frenteCola() {
        return cola[frente];
    }
    
    public void insertar(Object elemento) {
        fin++;
        cola[fin] = elemento;
    }
    
    public Object quitar() {
        Object aux = cola[frente];
        for (int x = 0; x < fin; x++) {
            cola[x] = cola[x+1];
        }
        fin--;
        return aux;
    }
    
    public int getFrente() {
        return frente;
    }
    
    public int getFin() {
        return fin;
    } 
    
    
}
