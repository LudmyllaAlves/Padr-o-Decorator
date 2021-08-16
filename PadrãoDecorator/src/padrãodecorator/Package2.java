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
public class Package2 extends Decorator{
      public Package2(Twitch twitch) {
        super(twitch);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote N:2");
        System.out.println("Frete Grátis em produtos por: R$9,99.");
    }
    
}
