/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class estudante extends Pessoas {
    String RM;
    String curso;

    public estudante(String nome, String cpf, String telefone, String dt_nasci, String RM, String curso) {
        super(nome, cpf, telefone, dt_nasci);
        this.RM= RM;
        this.curso= curso;
    }
    
  

    @Override
    public void info(){
        System.out.println("------Cadastro estudante------");
        System.out.println("O nome:" + this.nome );
        System.out.println("CPF:" + this.cpf );
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Data de nascimento:" + this.dt_nasci);  
        System.out.println("Curso:" + this.curso);
        System.out.println("RM:" + this.RM + "\n");
    }
    
    
}
