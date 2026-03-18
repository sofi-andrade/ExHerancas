/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Tecnico extends Funcionario {
    String area;
    String conhecimentoBasico;
    String tempoDeFormacao;
    public Tecnico (String nome,String numMatricula, String area, String conhecimentoBasico, String tempoDeFormacao) {
        super(numMatricula, nome);
        this.area = area;
        this.conhecimentoBasico = conhecimentoBasico;
        this.tempoDeFormacao = tempoDeFormacao;
    }
    

   @Override 
    public void infoF(){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Numero de matricula: "+ this.numMatricula );
        System.out.println("A area do funcionario e: " + this.area);
        System.out.println("Os conhecimentos basicos dele sao: " + this.conhecimentoBasico);
        System.out.println("O tempo de formacao na area e de: " + this.tempoDeFormacao);
    }
}
