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
public class Intercalacion {
    
    public int [] intercalacion(int [] arregloA, int [] arregloB){
        int i,j,k;
        int arregloC[] = new int[arregloA.length + arregloB.length];
        for(i = j = k = 0; i < arregloA.length && j < arregloB.length; k++){
            if(arregloA[i] < arregloB[j]){
                arregloC[k] = arregloA[i];
                i++;
            }else{
                arregloC[k] = arregloB[j];
                j++;
            }
        }
        for(; i < arregloA.length; i++, k++){
            arregloC[k] = arregloA[i];
        }
        for(; j < arregloB.length; j++, k++){
            arregloC[k] = arregloB[j];
        }
        return arregloC;
    }
    
}
