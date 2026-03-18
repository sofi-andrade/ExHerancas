/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Imovel {
    double valor ;
    String endereco;
    int area;
    
    public Imovel (double valor , String endereco , int area){
        this.valor= valor;
        this.endereco = endereco;
        this.area= area ;
    }
    
    public void info(){

        System.out.println("---Gerenciamento de imoveis  ---");
        System.out.print("Valor:" + valor);
        System.out.print("Endereço:"+ endereco);
        System.out.print("Area:"+ area);
    }
}
