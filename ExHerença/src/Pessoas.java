/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pessoas {
    String nome;
    String cpf;
    String telefone;
    String dt_nasci;
    
    public Pessoas (String nome, String cpf, String telefone, String dt_nasci)
    {
        this.nome= nome;
        this.cpf= cpf;
        this.telefone= telefone;
        this.dt_nasci= dt_nasci;  
        
    }
    public void info(){
        System.out.println("------Cadastro pessoa------");
        System.out.println("O nome:" + this.nome );
        System.out.println("CPF:" + this.cpf );
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Data de nascimento:" + this.dt_nasci + "\n");
        
    }
    
}
