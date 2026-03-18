/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Ingresso {
    
    String tipo_ingresso ; 
    String num_Assento; 
    double valor ; 
    
    public Ingresso(String tipo_ingresso, String num_Assento, double valor  ){
        this.valor= valor;
        this.tipo_ingresso = tipo_ingresso; 
        this.num_Assento = num_Assento; 
     
    }
    
    public void info(){ 
        System.out.println("---Informacoes da ingresso---");
        System.out.println("tipo do ingresso : " + tipo_ingresso );
        System.out.println("num_Assento : "+ num_Assento );
        System.out.println("Valor:" + valor );
    }       
}
