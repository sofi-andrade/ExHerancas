/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Desconto p1 = new Desconto(200.00, 30.0);
       Produto p2 = new Produto (400.0);
       p2.info();
       p1.calcDesconto();
       p1.info();
    }
    
}
