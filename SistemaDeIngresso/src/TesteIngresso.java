/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class TesteIngresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IngressoNormal n1 = new IngressoNormal("Normal", "C-12", 80.0);
       IngressoVip v1 = new IngressoVip("Vip", "A-25", 100.0 , "Camarote inferior"); 
       
       n1.info(); 
       v1.calc();
       v1.info();
        
       
    
    }
}
