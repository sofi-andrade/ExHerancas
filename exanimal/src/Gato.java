/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Gato extends Animal {
    
    public Gato(String especie, String raca, int idade, String nome) {
        super(especie, raca, idade, nome);
    }
    
    @Override
    public void infoAnimal(){
      System.out.println("----informaçoes do animal----");
      System.out.println("Nome: "+ nome);
      System.out.println("Especie: " + especie);
      System.out.println("Raca: " + raca) ;
      System.out.println("Idade: "+ idade);  
    }

   
    @Override
    public void caminhar(){
      System.out.println("O "+ especie + " está caminhando!!");   
    }
    
    @Override 
   public void comer(){
      System.out.println("O "+ especie + " está comendo!!");
    }
   
   @Override 
   public void beberAgua(){
      System.out.println("O"+ especie + " está bebendo agua!!");
    }
    
    public void miar (){
      System.out.println("miu miu miu !!");
    }
    
}
