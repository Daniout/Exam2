/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Daniel
 */
public class Motor {
    private int Noserial;
    private String Marca;

    public Motor() {
    }

    public Motor(int Noserial, String Marca) {
        this.Noserial = Noserial;
        this.Marca = Marca;
    }

    public int getNoserial() {
        return Noserial;
    }

    public void setNoserial(int Noserial) {
        this.Noserial = Noserial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
}
