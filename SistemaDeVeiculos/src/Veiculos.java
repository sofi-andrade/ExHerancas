/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Veiculos {
    String marca;
    String modelo; 
    String ano;
    
    public Veiculos(String marca, String modelo, String ano){
        this.marca= marca;
        this.modelo = modelo;
        this.ano = ano; 
        
    }
    
    public void infoVeiculo(){
        System.out.println("----Sistema de veiculos----");
        System.out.println("Marca :" + this.marca);
        System.out.println("Marca :" + this.modelo);
        System.out.println("Marca :" + this.ano + "\n");
        
    }
}
