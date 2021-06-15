/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
“Arriba la poderosa máquina del Cruz Azul”
1. Kevin Arturo Castellanos Amador
2. Guillermo Hilario Santos Moya
3. Alejandro Joya Barajas
4. Axel Ulises Paredes Rubio
*/
/**
 *
 * @author MEMO0464
 */
public class MezclaNatural {
    
    public int [] mezclaNatural(int arreglo[]){
        int izquierda = 0, izq = 0, derecha = arreglo.length-1, der = derecha;
        boolean ordenado = false;
        do{
            ordenado = true;
            izquierda = 0;
            while(izquierda < derecha){
                izq = izquierda;
                while(izq < derecha && arreglo[izq] <= arreglo[izq+1]){
                    izq++;
                }
                der = izq+1;
                while(der == derecha-1 || der < derecha && arreglo[der] <= arreglo[der+1]){
                    der++;
                }
                if(der <= derecha){
                    arreglo = mezclaDirecta(arreglo);
                    ordenado = false;
                }
                izquierda = izq;
            }
        }while(!ordenado);
        return  arreglo;
    }
    
    
    public int[]  mezclaDirecta(int [] arreglo){
        int i,j,k;
        if(arreglo.length > 1){
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int [nElementosIzq];
            int arregloDer[] = new int [nElementosDer];
            
            for(i = 0; i < nElementosIzq; i++){
                arregloIzq[i] = arreglo[i];
            }
            
            for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++){
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            
            i = j = k = 0;
            
            while(arregloIzq.length != j && arregloDer.length != k){
                if(arregloIzq[j] < arregloDer[k]){
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                }else{
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            while(arregloIzq.length != j){
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while(arregloDer.length != k){
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }
        return arreglo;
    }

    
    
}
