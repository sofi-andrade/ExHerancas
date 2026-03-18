/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AssistenteAdministrativo adm1 = new AssistenteAdministrativo( "2846103","Brenda" , "Ensino Medio Completo", 
        "Organizacao, suporte, controle de planilhas e apoio a processos");
        adm1.infoF();
        
        Tecnico tec1 = new Tecnico ("Pilar", "7952481", "Desenvolvimento de Sistemas",
        "Office 365, HTML, CSS, SQL, Phyton, Java e JavaScript", "Um ano e meio");
        tec1.infoF();
    }
    
}
