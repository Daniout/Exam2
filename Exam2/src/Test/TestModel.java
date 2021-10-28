/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Data.Catalogo;
import Model.*;
/**
 *
 * @author Daniel
 */
public class TestModel {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        
        try{
                Motor motor1 = new MotorElectrico(1222,"AMV15",12.1);
                
                 Motor motor2 = new MotorMecanico(1222,"KIT1253",9.4);
                 
                
                
                
                
                
        }catch(IllegalArgumentException iae){
                 System.out.println(iae);       };
    }
    
  
}
