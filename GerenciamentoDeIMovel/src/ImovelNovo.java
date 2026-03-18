/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class ImovelNovo extends Imovel {
    int ano; 
    public ImovelNovo(double valor, String endereco, int area,int ano) {
        super(valor, endereco, area);
        this.ano= ano; 
    }
    
    public void valoradicional( double valor_adicional){
        
       this.valor = this.valor + valor_adicional; 
    }
    @Override
    public void info(){
        System.out.println("---Gerenciamento de imoveis novos ---");
        System.out.println("Valor:" + this.valor);
        System.out.println("Endereço:"+ this.endereco);
        System.out.println("Area:"+ this.area + " M²");  
        System.out.println("Ano: "+ this.ano);
    }
    
}
