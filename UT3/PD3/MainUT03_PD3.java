/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UT03.PD3;

/**
 *
 * @author jakosut
 */
public class MainUT03_PD3 {
    public static void main(String[] args) {
        Lista nuevaLista = new Lista();
        Nodo<Integer> Nodo1 = new Nodo<>(3,03);
        Nodo<Integer> Nodo2 = new Nodo<>(2,02);
        Nodo<Integer> Nodo3 = new Nodo<>(1,01);
        
        nuevaLista.insertar(Nodo1);
        nuevaLista.insertar(Nodo2);
        nuevaLista.insertar(Nodo3);
        
     
        nuevaLista.buscar(01).imprimirEtiqueta();
        
        System.out.println("Imprimir toda la lista:");
        INodo<Integer> auxiliar = nuevaLista.getPrimero();
        while(auxiliar != null){
            auxiliar.imprimir();
            auxiliar = auxiliar.getSiguiente();
        }
        
        nuevaLista.eliminar(02);
        System.out.println("Imprimir toda la lista luego de eliminar el elemento :");
        INodo<Integer> auxiliar1 = nuevaLista.getPrimero();
        while(auxiliar1 != null){
            auxiliar1.imprimir();
            auxiliar1 = auxiliar1.getSiguiente();
        }
    }
    
}
