/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Animal {
    String nome;
    int idade; 
    String especie;
    String raca;

 public Animal(String especie, String raca, int idade , String nome){
   this.especie= especie;
   this.raca= raca;
   this.nome= nome;
   this.idade= idade; 
}    

 public void caminhar (){
    System.out.println("O"+ especie + "está caminhando!!");
        
}   
 
 public void comer(){
   System.out.println("O"+ especie + "está comendo!!");
} 
 
 public void beberAgua(){
    System.out.println("O"+ especie + "está bebendo agua!!");
}


 public void infoAnimal(){
   System.out.println("Nome: "+ nome);
   System.out.println("Especie: " + especie);
   System.out.println("Raca" + raca) ;
   System.out.println("Idade: "+ idade);
}
}
