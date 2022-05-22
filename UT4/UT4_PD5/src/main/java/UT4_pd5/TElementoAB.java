package UT4_pd5;

import static java.lang.Integer.max;

import java.util.ArrayList;

public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T datos;

  
   
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }
 

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public T getDatos() {
        return datos;
    }

    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;

    }

    
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

  
    public int obtenerCantidadHojas() {
        int izq = 0;
        int der = 0;
        if (hijoIzq == null && hijoDer == null){
            return 1;
        }else{
            if (hijoIzq != null){
                izq =+ hijoIzq.obtenerCantidadHojas();
            }
            if (hijoDer != null){
                der =+ hijoDer.obtenerCantidadHojas();
            }
            return izq + der;
        }
    }

    public TElementoAB claveMenor() {
        TElementoAB menor = this;
        if (hijoIzq != null){
            menor = hijoIzq.claveMenor();
        }
        return menor;
    }

    
    public TElementoAB claveMayor() {
        TElementoAB mayor = this;
        if (hijoDer != null){
            mayor = hijoDer.claveMayor();
        }
        return mayor;
    }

    public boolean esABB() {
        boolean izq = true;
        boolean der = true;
        if (hijoIzq == null && hijoDer == null) {
            return true;
        } else {
            if (hijoIzq != null) {
                if ((this.getEtiqueta().compareTo(hijoIzq.getEtiqueta())) > 0) {
                    return izq && hijoIzq.esABB();
                } else {
                    return false;
                }
            }
            if (hijoDer != null) {
                if ((this.getEtiqueta().compareTo(hijoDer.getEtiqueta())) < 0) {
                    return der && hijoDer.esABB();
                } else {
                    return false;
                }
            }
            return izq && der;

        }

    }

    public int cantNodosNivel(int nivel) {
        int izq = 0;
        int der = 0;
        if (nivel == 0) {
            return 1;
        } else {
            if (hijoIzq != null) {
                izq = izq + hijoIzq.cantNodosNivel(nivel - 1);
            }
            if (hijoDer != null) {
                der = der + hijoDer.cantNodosNivel(nivel - 1);
            }
            return izq + der;
        }

    }
    
  
    
    public void listarHojas() {
        
        if (hijoIzq == null && hijoDer == null) {
            System.out.print(this.getEtiqueta().toString());
            //System.out.println(" - en Nivel: " );
        } else {
            if (hijoIzq != null) {
                hijoIzq.listarHojas();
            }
            if (hijoDer != null) {
                hijoDer.listarHojas();
            }
        }
    }

    
    public Comparable claveAnterior(Comparable clave) {
        if (hijoIzq == null && hijoDer == null) {
            return -1;
        } else {
            if (clave.compareTo(etiqueta) < 0) {
                if (hijoIzq != null && hijoIzq.getEtiqueta() == clave) {
                    return this.etiqueta;
                } else {
                    return hijoIzq.claveAnterior(clave);
                }
            } else {
                if (clave.compareTo(etiqueta) > 0) {
                    if (hijoDer != null && hijoDer.getEtiqueta() == clave) {
                        return this.etiqueta;
                    } else {
                        return hijoDer.claveAnterior(clave);
                    }
                } else {
                    return -1;
                }
            }

        }

    }

}


    


