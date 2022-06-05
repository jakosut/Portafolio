/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package UT5_PD2;

public class Main {

    public static void main(String[] args) {

        ArbolBB<Integer> arbol = new ArbolBB<>();

        String[] consultas = ManejadorArchivosGenerico.leerArchivo("Claves1.txt");  // Leer un arvhivo
        for (String string : consultas) {
            String[] linea = string.trim().split(",");
            try { //
                ElementoAB<Integer> unElementoAB = new ElementoAB<>(Integer.parseInt(linea[0]), Integer.parseInt(linea[0]));
                arbol.insertar(unElementoAB);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        }



    /*    IElementoAB<Integer> busqueda = arbol.buscar(10635);
        System.out.println(busqueda.getEtiqueta());


        String salida[] = {arbol.inOrden(),arbol.preOrden(),arbol.postOrden()};
        ManejadorArchivosGenerico.escribirArchivo("recorridos.txt",salida);
        System.out.println(arbol.inOrden());
        System.out.println(arbol.preOrden());
        System.out.println(arbol.postOrden());*/
        System.out.println(arbol.altura());
       // System.out.println(arbol.completos());


    }
}
