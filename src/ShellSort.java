/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miembros del equipo:
//Guillermo Hilario Santos Moya 19400676 <----------------------------
//http://puntocomnoesunlenguaje.blogspot.com/2014/09/metodo-shell-de-ordenacion.html
/**
 *
 * @author MEMO0464
 */
public class ShellSort {
    
    public int [] shell(int a[]){
        
        int salto, aux, i;
        boolean cambios;
  
        for(salto = a.length / 2; salto != 0; salto /= 2){
            cambios = true;
            while(cambios){                                     
                cambios = false;
                for(i = salto; i < a.length; i++){
                    if(a[i - salto] > a[i]){       
                        aux = a[i];                  
                        a[i] = a[i - salto];
                        a[i - salto] = aux;
                        cambios = true;                                  
                    }
                }
            }
        }
        return a;
    }
}
