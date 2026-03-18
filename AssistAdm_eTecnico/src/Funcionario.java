/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Funcionario {
    String numMatricula; 
    String nome; 
    
    public Funcionario(String numMatricula, String nome){
        this.nome = nome;
        this.numMatricula = numMatricula; 
        
    }
    
    public void infoF(){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Numero de matricula: "+ this.numMatricula );
    }
}
