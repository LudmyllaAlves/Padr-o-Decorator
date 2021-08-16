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
public class PadrãoDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Twitch usuarioBasico = new Base();
        usuarioBasico.assinar();
        System.out.println("\n");
        
        Twitch Assinatura01 = new Package1(new Base());
        Assinatura01.assinar();
        System.out.println("\n");
        
        Twitch Assinatura02 = new Package3(new Package2(new Base()));
        Assinatura02.assinar();
        System.out.println("\n");
        
        Twitch Assinatura05 = new Package4 (new Package3(new Package2(new Base())));
        Assinatura05.assinar();
        System.out.println("\n");
        
        Twitch Assinatura03 = new Package4(new Base());
        Assinatura03.assinar();
    }
    }
    

