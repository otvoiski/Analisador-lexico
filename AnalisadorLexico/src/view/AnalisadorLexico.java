package view;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author Otávio Voiski, Matheus Ribeiro, Maycon Ferrari, Marcio Almeida
 */
public class AnalisadorLexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        //Leitura de um arquivo texto          
        Analise analisador = new Analise("codigo/CodigoFonteLexico.txt");
                
        ArrayList<Token> Tokens = analisador.Analisar();
        
        if (Tokens != null) 
            for (Token token : Tokens) {                                        //Imprime como solicitado
                System.out.print(analisador.getExpressao() + " -> ");           //Usa a espressão encontrada
                
                    System.out.print
                        ("[" + token.getClasse() + ","
                            + token.getRepresentacao() + ","
                            + token.getValor() + ","
                            + token.getApontador() + ","
                            + token.getIndtab() + "]"
                        );
                
            }        
        System.out.println("");
    }
}
