/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Docente extends Pessoas {
    String RF;
    String Disciplina;
    public Docente(String nome, String cpf, String telefone, String dt_nasci, String RF, String Disciplina) {
        super(nome, cpf, telefone, dt_nasci);
        this.RF = RF;
        this.Disciplina = Disciplina;
               
        
    }
    
   
   @Override
    public void info(){
        System.out.println("------Cadastro docente------");
        System.out.println("O nome:" + this.nome );
        System.out.println("CPF:" + this.cpf );
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Data de nascimento:" + this.dt_nasci);  
        System.out.println("Curso:" + this.Disciplina);
        System.out.println("RM:" + this.RF);
    }
    
    
}
