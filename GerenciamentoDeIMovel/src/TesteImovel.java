/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class TesteImovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImovelNovo m1 = new ImovelNovo( 2500 , "rua jose nilson 55 ", 321, 2025);
        ImovelVelho m2 = new ImovelVelho(1000, "rua gertulio 44", 321, "1996" );
        m2.calcDesconto(100);
        m2.info();
        m1.valoradicional(500);
        m1.info();
    }
    
    
}
