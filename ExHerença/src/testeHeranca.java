/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class testeHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Docente d1 = new Docente("Brenda", "4518378478", "5431-96542", "08/5/2008", "88859", "Portugues");
       Pessoas p1 = new Pessoas("fabiana", "2615641319864", "5163264131" ,"10/5/25" );
       Funcionario f1 = new Funcionario( "Creusa", "628768378478", "2131-96542", "12/6/2008", "25259", "Cordenado" );
       estudante e1 = new estudante( "fabiola", "628768378478", "2131-96542", "12/6/2008", "25259", "tecnico juridico");
       p1.info();
       f1.info();
       e1.info(); 
       d1.info();
    
    }
     
     
}
