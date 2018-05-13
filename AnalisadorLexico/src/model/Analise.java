/*
 * The MIT License
 *
 * Copyright 2018 Administrador.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*  Caracteres de lay-out (espaços, salto de linha, tabulações, comentários) serão usados para sinalizar o final de um elemento e inicio de outro. 
*    
*   A tabela de símbolos será usada para armazenar os tokens do tipo palavra reservada (carregadas inicialmente na tabela), 
*   identificador ou constante, podendo ser usado qualquer tipo de estrutura de dados (desde que utilize algum indexador) para sua implementação. 
*    
*   Após a leitura do texto, devem ser listados os tokens obtidos com esta leitura, com cada token estando entre chaves, com os valores de seus 
*   parâmetros separados por vírgulas.
*   Exemplos de texto a serem analisados e de resultados obtidos:
* 
*   int valor;			→[reserv,I, 0,0,0][ident,,0,1,1][fim,;,0,0,0]
*   string nome = “José”;	→[reserv,S,0,0,0][ident,,0,2,2][atrib,=,0,0,0][const,,0,3,0][fim,;,0,0,0]
*   real taxa = 0.093 ;		→[reserv,R,0,0,0][ident,,0,4,3][atrib,=,0,0,0][const,,0.093,0,0][fim,;,0,0,0]
*   string msg ;  (variável para mensagens) →[reserv,S,000][ident,,0,5,4][fim,;,0,0,0]
*   int a, b, c;		→[reserv,I,0,0,0][ident,,0,5,4][pont,,,0,0,0][ident,,0,6,5][pont,,,0,0,0][ident,,0,7,6]  [fim,;,0,0,0]
*
*   Se na leitura não for identificado padrão válido, dar mensagem de erro indicando a posição que estava lendo (pode ser o numero do caractere lido ou o numero da palavra lida).
*   O software deve ser fornecido com fonte, podendo ser escrito em qualquer linguagem de programação, porém se houver plágio o valor do trabalho será zerado. Além do fonte, os AFDs 
*   para o reconhecimento dos padrões dos elementos deverão ser fornecidos.
*   Para a execução do trabalho, as equipes deverão ter no máximo 4 elementos.
* 
* @author Administrador
*/
public class Analise {
    private final boolean DEBUG;
        
    private String Diretorio;
    private String Expressao;                                                   // Expressão lida
    private ArrayList<String> PalavrasReservadas;                               // Palavras reservadas
    private ArrayList<Token> Tokens;                                            // Tabela de Tokens

    public Analise(String diretorio) {
        /* Inicio Construtor */
        this.DEBUG = false;                                                     //Debug é usado para mostrar mensagens!
        this.Diretorio = diretorio;                                             //Diretorio do arquivo
        /* Fim Construtor */
        
        /* Inicio Listas */
        PalavrasReservadas = new ArrayList<>();                                 //Palavras reservadas
        Tokens = new ArrayList<>();                                             //Tokens lidos
        /* Fim Listas */        
        
        /* Inicio Palavras Reservadas */
        PalavrasReservadas.add("int");
        PalavrasReservadas.add("string");
        PalavrasReservadas.add("real");
        /* Fim Palavras Reservadas */
        
        CarregarCodigo();
    }

    /**
     * Faz a leitura do codigo, este codigo é rodado assim que o contrutor
     * é iniciado.
     */
    private void CarregarCodigo() {
        Token token;
        
        try {
            File file = new File(Diretorio);
            if(file.exists()){
                Scanner scan = new Scanner(file);

                while (scan.hasNext()) {                                            //Verifica se existe um Token a ser lido                
                    if(DEBUG)   System.out.println(scan.next());                    //Printa o token
                    //token = new Token();
                }
            } else 
                System.out.println("Arquivo não encontrado no local " + Diretorio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /** 
    *   Retorna a lista de Tokens encontrados atravez da Expressão
    *   @return ArrayList<Token>
    */
    public ArrayList<Token> Analisar() {
        return null;
    }
    
    public void CarregaCodigo(){
         
        int i = 0;
        String[] Codigo = new String[20];
        
        try {
            File File = new File(this.Diretorio);
            Scanner scan = new Scanner(File);
            while(scan.hasNext()){
                System.out.println(scan.next());
                Codigo[i] = scan.next();
                if(Codigo[i].endsWith(";")){
                    
                    i++;
                    Codigo[i] = ";";
                    
                }
                i++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(view.AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        for (int j = 0; j < Codigo.length; j++) {
            if (DEBUG) {
                System.out.println(Codigo[j]);
            }
        }
       
        
    }
    
    public void AnalisaPalavra(String Palavra){
    
        int i = 0;
        
        do {
            if( Palavra.equals(PalavrasReservadas.get(i))){
                    
        
            }
        }   while (i < PalavrasReservadas.size() || !Palavra.equals(PalavrasReservadas.get(i)));
            
        if(";".equals(Palavra)){
            
        }
    }

    public String getExpressao() {
        return Expressao;
    }

    public void setExpressao(String Expressao) {
        this.Expressao = Expressao;
    }
    
    
    
}
