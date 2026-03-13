/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class testeVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculos v1 = new Veiculos("toyota", "yares", "2016");
        Carro c1 = new Carro("VolkSwagen", "Nivus", "2025", "Gasolina");
        CarroEletrico e1 = new  CarroEletrico("BDY","BDY Dolphin", "2026", 1.800);
        
        v1.infoVeiculo();
        c1.infoVeiculo();
        e1.infoVeiculo();
    }
    
}
