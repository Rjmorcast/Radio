/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public interface douglas {
  
   public void onOff();
   
   public float Switch();
   
   public float siguiente(float estacion);
   
   public float anterior(float estacion);
   
   public void guardar(float estacion, int boton);
   
   public float seleccionar(int boton);
}
