/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miembros del equipo:
//Guillermo Hilario Santos Moya 19400676 <----------------------------
//https://www.youtube.com/watch?v=fbRia-tshfo
/**
 *
 * @author MEMO0464
 */
public class Radix {
    public int [] radix(int a[]){
        int j;
        for(int x = Integer.SIZE -1; x >= 0; x--){
            int aux[] = new int [a.length];
            j=0;
            for(int i = 0; i < a.length; i++){
                boolean mover = a[i] << x >= 0;
                
                if(x == 0 ? !mover:mover){
                    aux[j] = a[i];
                    j++;
                }else{
                    a[i-j] = a[i];
                }
            }
            for(int i = j; i < aux.length; i++){
                aux[i] = a[i-j];
            }
            a = aux;
        }
        return a;
    }
}
