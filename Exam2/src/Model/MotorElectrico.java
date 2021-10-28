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
public class MotorElectrico extends Motor implements IVendible {


    public MotorElectrico() {
    }

    public MotorElectrico(int Noserial, String Marca,Double KvxMinuto) {
        super(Noserial, Marca);
    }

    @Override
    public double getValorVenta() {
        return 0;
    }
    
}
