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
public class Package3 extends Decorator{
      public Package3(Twitch twitch) {
        super(twitch);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote N:3");
        System.out.println(" Caixa surpresa com produtos relacionados a filmes e séries R$29,99.\n" );
    }
    
}
