/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Produto {
    Double preco;
    
    
    public Produto(Double preco){
        this.preco = preco ; 
    }
    
    public void info(){
        System.out.println("---Sistema de pagamento---");
        System.out.println("Valor total  : "+ this.preco + "\n");
    }
}
