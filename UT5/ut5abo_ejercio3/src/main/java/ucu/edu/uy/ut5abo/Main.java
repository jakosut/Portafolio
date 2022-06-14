/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut5abo;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;
import ucu.edu.uy.util.CalculadorMatricesOptimo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;


/**
 *
 * @author nnavarro
 */
public class Main
{

    public static void main(String[] args)
    {
      
        TArbolBB elArbol = new TArbolBB();
      

        String[] palabras = ManejadorArchivosGenerico.leerArchivo("palabras.txt"); 
        int cantElementos = palabras.length;
         for (String string : palabras) { 
          
            String[] palabra = string.split(" ");
             try { //manejo de excepciones
              
                String e =palabra[0];
                int d =Integer.parseInt(palabra[1]); 
                
                TElementoAB unElementoAB = new TElementoAB(e,d); //elemento de tipo arbol (etiqueta,dato)
                 elArbol.insertar(unElementoAB);
             } catch (Exception e) {
                 System.out.println("Error: " + e);
            }
         }



        /* // cargar FRECUENCIAS DE BUSQUEDAS  EXITOSAS
         String[] palabras2 = ManejadorArchivosGenerico.leerArchivo("palabras2.txt");
         String[] claves = new String[cantElementos+1];
         int[] frecExito = new int[cantElementos+1];
         for (int i = 1; i <= palabras2.length; i++) {
             String linea = palabras2[i-1];
             String[] valores = linea.split(" ");
             claves[i] = valores[0];
             frecExito[i] = Integer.valueOf(valores[1]);
 
           }
         */
        // cargar FRECUENCIAS DE BUSQUEDAS NO EXITOSAS
        
        String[] nopalabras = ManejadorArchivosGenerico.leerArchivo("nopalabras.txt");
        int[] vectorBetas = new int[cantElementos + 1];
        for (int j = 0; j < nopalabras.length; j++) {
            String linea = nopalabras[j];
            vectorBetas[j] = Integer.valueOf(linea);
            String[] datos = linea.split(" ");
            vectorBetas[j] = Integer.parseInt(datos[0]);
            }
            int[] vectorAlfas = new int[cantElementos+1];
            String[] vectorClaves = new String[cantElementos+1];
            elArbol.completarNodosExternos(vectorBetas);
            System.out.println(elArbol.obtenerCosto());
        }
        
         
    } 
