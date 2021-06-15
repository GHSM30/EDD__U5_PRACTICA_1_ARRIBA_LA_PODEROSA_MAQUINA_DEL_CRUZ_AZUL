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
public class TDA_V {
    int [] numero;
    int [] numero2;
    int [] o;
    int [] o2;

    public TDA_V() {
        this.numero = numero;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public int[] getO() {
        return o;
    }

    public void setO(int[] o) {
        this.o = o;
    }

    public int[] getNumero2() {
        return numero2;
    }

    public void setNumero2(int[] numero2) {
        this.numero2 = numero2;
    }

    public int[] getO2() {
        return o2;
    }

    public void setO2(int[] o2) {
        this.o2 = o2;
    }
    
    public  int [] Genera(int tam){
       numero = new int [tam];
       o = new int [tam];
       for(int i = 0; i< numero.length; i++){
           numero[i] = (int)(Math.random()*999);
           o[i] = numero[i];
       }
       return numero;
    }
    
    public  int [] Genera2(int tam){
       numero2 = new int [tam];
       o2 = new int [tam];
       for(int i = 0; i< numero2.length; i++){
           numero2[i] = (int)(Math.random()*999);
           o2[i] = numero2[i];
       }
       return numero2;
    }
}
