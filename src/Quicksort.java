/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miembros del equipo:
//Guillermo Hilario Santos Moya 19400676 <----------------------------
//https://www.youtube.com/watch?v=yXy7WzgUaSA
//http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html#:~:text=El%20m%C3%A9todo%20de%20ordenaci%C3%B3n%20Quicksort,m%C3%A1s%20peque%C3%B1os%2C%20y%20ordenar%20%C3%A9stos.
/**
 *
 * @author MEMO0464
 */
public class Quicksort {
    
    public int [] quicksort(int a[]){
        
       a = quircksort1(a);
       return a;
    }

    private int[] quircksort1(int[] numeros) {
        return quicksort2(numeros,0,numeros.length-1);
    }

    private int[] quicksort2(int[] numeros, int izq, int der) {
        if(izq >= der) return numeros;
        int i = izq, d = der;
        if(izq != der){
            int pivote;
            int aux;
            pivote = izq;
            while(izq != der){
                while(numeros[der] >= numeros[pivote] && izq < der) der--;
                while(numeros[izq] < numeros[pivote] && izq < der) izq++;
                if(der != izq){
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }
            if(izq == der){
                quicksort2(numeros,i,izq-1);
                quicksort2(numeros,izq+1,d);
            }
        }else return numeros;
        return numeros;
    }
}
