/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3busquedassecuencial;

/**
 *
 * @author Angelica
 */
public class busquedaSecuencial {
    
    
     public static int busquedaSecuencial(int []arreglo,int dato){
 int pos = -1;
  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
    pos = i;
    break;
   }
 }
 return pos;
 
}

}
