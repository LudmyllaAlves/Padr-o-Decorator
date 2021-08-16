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
public class Base implements Twitch{
    @Override
    public void assinar() {
        System.out.println("Assinatura base");
        System.out.println("Assistir stream e videos em apenas 1 dispositivo por: R$9,99. \n");
    }
    
}
