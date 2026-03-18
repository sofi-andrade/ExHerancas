/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class TesteAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gato g1 = new Gato("Gato" , "Siames", 3 , "Smurf");
       cachorro c1 = new cachorro("Cachorro", "pitbul" , 5 , "Zeus");
       
       c1.infoAnimal();
       c1.latir();
       c1.caminhar();
       
       g1.infoAnimal();
       g1.comer();
       g1.miar();
    }
    
}
