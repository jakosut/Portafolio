package UT4_pd5;

public interface IElementoAB<T> {
    
public Comparable getEtiqueta();

public TElementoAB<T> getHijoIzq();

public TElementoAB<T> getHijoDer();

public void setHijoIzq(TElementoAB<T> elemento);

public void setHijoDer(TElementoAB<T> elemento);

public T getDatos();	

public TElementoAB claveMenor();

public TElementoAB claveMayor();

public Comparable claveAnterior(Comparable clave) ;

public int cantNodosNivel(int nivel) ;

public void listarHojas() ;

public boolean esABB();
}




