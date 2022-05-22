package UT4_pd5;

public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    
    public TArbolBB() {
        raiz = null;
    }
       
    public TElementoAB claveMenor() {
        TElementoAB menor = null;
        if (raiz != null){
            menor = raiz.claveMenor();
        }
        return menor;
    }

    public TElementoAB claveMayor() {
        TElementoAB mayor = null;
        if (raiz != null){
            mayor = raiz.claveMayor();
        }
        return mayor;
    }
    
    public Comparable claveAnterior(Comparable clave) {
        if (raiz == null) {
            return -1;
        } else {
            return raiz.claveAnterior(clave);
        }
    }
    
    public void listarHojas() {
        if (raiz != null) {
            raiz.listarHojas();
        } else {
            System.out.println("Arbol vacío");
        }
    }

    
    public int cantNodosNivel(int nivel) {
        if (raiz == null){
             return 0;
         }else {
             return raiz.cantNodosNivel(nivel);
         }
     }
    
    public boolean esABB() {
        if (raiz != null) {
            return false;
        } else {
            return raiz.esABB();
        }
    }
    
    
       
    
}

   


