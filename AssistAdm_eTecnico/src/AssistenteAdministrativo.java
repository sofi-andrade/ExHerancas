/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class AssistenteAdministrativo extends Funcionario{
    String formacaoAcademica;
    String funcoes;
    
    public AssistenteAdministrativo(String numMatricula, String nome, String formacaoAcademica, String funcoes) {
        super( numMatricula, nome);  
        this.formacaoAcademica = formacaoAcademica;
        this.funcoes = funcoes;
    }
    
    
    
 @Override 
        public void infoF(){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Numero de matricula: "+ this.numMatricula );
        System.out.println("Formacao academica exigida: " + this.formacaoAcademica);
        System.out.println("As funcoes do funcionario sao: " + this.funcoes);
        
        
       
}
}