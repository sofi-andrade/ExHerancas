/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Carro extends Veiculos{
        String tipoDeCombustivel;
        
    public Carro(String marca, String modelo, String ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        this.tipoDeCombustivel= tipoDeCombustivel;
        
    }
    
    @Override
    public void infoVeiculo(){
        System.out.println("----Informaçoes do carro ----");
        System.out.println("Marca :" + this.marca);
        System.out.println("Marca :" + this.modelo);
        System.out.println("Marca :" + this.ano);
        System.out.println("Tipo de combustivel:" + tipoDeCombustivel + "\n");
    }
    
    
}
