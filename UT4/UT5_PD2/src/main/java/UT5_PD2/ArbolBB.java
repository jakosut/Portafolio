package UT5_PD2;

public class ArbolBB<T> implements IArbolBB<T> {
    private ElementoAB<T> raiz;
    private int contadorInsertar;

    @Override
    public boolean insertar(ElementoAB<T> unElemento) {
        if (esVacio()) {
            this.raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);

        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {

    }

    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
        if (esVacio()) return null;
        return raiz.preOrden();
    }

    @Override
    public String inOrden() {
        if (esVacio()) return null;
        return raiz.inOrden();
    }

    @Override
    public String postOrden() {
        if (esVacio()) return null;
        return raiz.postOrden();
    }

    public int contarHojas() {
        if (raiz == null) {
            return 0;
        }
        return raiz.contarHojas();
    }

    public int tamanio() {
        if (raiz == null) {
            return 0;
        }
        return raiz.tamanio();
    }

    public int altura() {
        if (raiz == null) {
            return 0;
        }
        return raiz.altura();
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public ElementoAB<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(ElementoAB<T> nuevaRaiz) {
        raiz = nuevaRaiz;
    }

    public int completos(){
        if (raiz == null) {
            return 0;
        }
        return raiz.completos();
    }



}

