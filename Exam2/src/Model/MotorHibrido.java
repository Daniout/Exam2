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
public class MotorHibrido extends Motor implements IReservable,IVendible {

    public MotorHibrido() {
    }

    public MotorHibrido(int Noserial, String Marca,Double KvxMinuto,Double TamañoxCombustible) {
        super(Noserial, Marca);
    }

    @Override
    public double getValorReserva() {
        return 0;
    }

    @Override
    public double getValorVenta() {
        return 0;
    }
    
    public double CalculoTotal(){
    
    return this.getValorVenta()*this.getValorReserva();
    }
    
}
