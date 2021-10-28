/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Model.*;
/**
 *
 * @author Daniel
 */
public class Catalogo extends Motor {
    private int nMaxMotores;
    private Motor[] lista;

    public Catalogo() {
        this.nMaxMotores=20;
        this.lista = new Motor [this.nMaxMotores];
    }
    
    
    public boolean RegistrarMotor(Motor m){
    
    return true;
    }
}
