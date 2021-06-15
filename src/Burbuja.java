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
 *
 * @author MEMO0464
 */
public class Burbuja {
     
    public int [] metodoBurbujaDesc(int [] num){
        
        int i, j, aux;
        for (i = 0; i < num.length - 1; i++) {
            for (j = 0; j < num.length - i - 1; j++) {
                if (num[j + 1] < num[j]) {
                    aux = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = aux;
                }
            }
        }
        return num;
    }

}
