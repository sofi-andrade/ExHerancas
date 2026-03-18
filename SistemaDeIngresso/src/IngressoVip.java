/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class IngressoVip extends Ingresso {
    String tipoCamarote; 
    public IngressoVip(String tipo_ingresso, String num_Assento, double valor, String tipoCamarote) {
        super(tipo_ingresso, num_Assento, valor);
         this.tipoCamarote = tipoCamarote; 
    }
    
    public void calc(){
        if ("Camarote Superior".equals(tipoCamarote)){
            this.valor = this.valor + 50.0;
            
        }else if ("Camarote inferior".equals(tipoCamarote)){
            this.valor = this.valor + 90.0;
        }
    }
    
    @Override 
    public void info(){
 
        System.out.println("---Informacoes da ingresso---");
        System.out.println("tipo do ingresso : " + this.tipo_ingresso );
        System.out.println ("Tipo de camorote " + this.tipoCamarote ); 
        System.out.println("Numero do assento : "+ this.num_Assento );
        System.out.println("Valor : " + this.valor );
        
    }
    
}
 