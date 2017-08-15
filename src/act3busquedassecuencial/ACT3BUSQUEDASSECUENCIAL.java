/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3busquedassecuencial;
import static act3busquedassecuencial.busquedaSecuencial.busquedaSecuencial;

/**
 *
 * @author Angelica
 */
public class ACT3BUSQUEDASSECUENCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args){
  int[]vector ={5,7,9,3,12,17,23,28,34,88};
  int valorBuscado = 12;
  System.out.println(busquedaSecuencial(vector,valorBuscado));
 }
    
}
