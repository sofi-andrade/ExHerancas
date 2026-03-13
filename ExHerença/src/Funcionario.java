/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoas {
    String RGM;
    String Cargo;

    public Funcionario(String nome, String cpf, String telefone, String dt_nasci, String RGM, String Cargo) {
        super(nome, cpf, telefone, dt_nasci);
        this.RGM= RGM;
        this.Cargo= Cargo;
    }
    
    @Override
    public void info(){
        System.out.println("------Cadastro Funcinario------");
        System.out.println("O nome:" + this.nome );
        System.out.println("CPF:" + this.cpf );
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Data de nascimento:" + this.dt_nasci); 
        System.out.println("Cargo:" + this.Cargo); 
        System.out.println("RGM:" + this.RGM + "\n"); 
        
    }
    
       
}
