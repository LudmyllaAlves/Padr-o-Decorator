/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãodecorator;
        
public class Package1 extends Decorator {
    
    public Package1(Twitch twitch) {
        super(twitch);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote N:1");
        System.out.println("Assistir vídeos em diversos dispositivos por R$19,99.");
    }
    
}