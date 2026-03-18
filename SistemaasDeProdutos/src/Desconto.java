/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Desconto extends Produto {
    
  
    Double desconto ;
    
    public Desconto(Double preco, Double desconto ) {
        super(preco);
        this.desconto = desconto ; 
    }
    public void calcDesconto(){
        this.desconto = ( this.preco * this.desconto)/100 ;  
        preco = preco - desconto;
    }
    @Override
    public void info(){
    System.out.println("---Sistema de pagamento---");
    System.out.println("DESCONTO APLICADO!!"); 
    System.out.println("Valor do desconto: " + this.desconto);
    System.out.println("Valor total : " + this.preco );    
    }
}
