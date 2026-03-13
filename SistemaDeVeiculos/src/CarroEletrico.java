/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CarroEletrico extends Veiculos{
     double capacidadeBateria;
    public CarroEletrico(String marca, String modelo, String ano, double capacidadeBateria) {
        super(marca, modelo, ano);
        this.capacidadeBateria= capacidadeBateria;
        
    }
    @Override
    public void infoVeiculo(){
         System.out.println("----Informaçoes do carro eletrico----");
        System.out.println("Marca :" + this.marca);
        System.out.println("Marca :" + this.modelo);
        System.out.println("Marca :" + this.ano);
        System.out.println("Capacidade da bateria :" + this.capacidadeBateria + "kMh \n");

    }
    
    
}
       
 

