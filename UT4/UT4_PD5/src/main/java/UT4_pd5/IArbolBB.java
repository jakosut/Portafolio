package UT4_pd5;

public interface IArbolBB<T> {

    public TElementoAB claveMenor();

    public TElementoAB claveMayor() ;
    
    public Comparable claveAnterior(Comparable clave);
    
    public void listarHojas() ;
    
    public int cantNodosNivel(int nivel);
    
    public boolean esABB();
       
}
