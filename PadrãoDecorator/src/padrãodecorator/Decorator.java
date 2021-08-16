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
public class Decorator implements Twitch {
    
    public Twitch twitch;

    public Decorator(Twitch twitch) {
        this.twitch = twitch;
    }

    @Override
    public void assinar() {
        this.twitch.assinar();
    }
    
}
