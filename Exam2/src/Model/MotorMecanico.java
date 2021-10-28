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
public class MotorMecanico extends Motor implements IReservable {

    public MotorMecanico() {
    }

    public MotorMecanico(int Noserial, String Marca,Double TamañoxCombustible) {
        super(Noserial, Marca);
    }

    @Override
    public double getValorReserva() {
        return 0;
    }
    
}
