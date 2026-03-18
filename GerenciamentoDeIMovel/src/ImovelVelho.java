/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class ImovelVelho extends Imovel{
    String ano_construcao; 
   ;
    public ImovelVelho(double valor, String endereco, int area, String ano_construcao ) {
        super(valor, endereco, area);
        this.ano_construcao = ano_construcao; 
        
    }
    public void calcDesconto( double valor_desconto){
       valor =  valor - valor_desconto; 
        
    }
    @Override
    public void info(){

        System.out.println("---Gerenciamento de imoveis antigos---");
        System.out.println("Valor:" + valor);
        System.out.println("Endereço:" + endereco);
        System.out.println("Area:"+ area); 
        System.out.println("Ano da construcão: " + ano_construcao); 
        
}
}