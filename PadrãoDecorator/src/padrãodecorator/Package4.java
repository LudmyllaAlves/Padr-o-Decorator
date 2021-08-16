/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãodecorator;

/**
 *
 * @author tatia
 */
public class Package4 extends Decorator{
      public Package4(Twitch twitch) {
        super(twitch);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote N:4");
        System.out.println(" Cartão de crédito Platinum R$49,99. \n" );
    }
    
    
}
