/*
 * The MIT License
 *
 * Copyright 2018 Otávio Voiski, Matheus Ribeiro, Maycon Ferrari, Marcio Almeida.
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

/**
 *
 * @author Otávio Voiski, Matheus Ribeiro, Maycon Ferrari, Marcio Almeida
 */
public class Err {
    /**
     * Classe para de impressão de Erros
     * @param codigo 
     */
    public static boolean show(int codigo){
        
        String msg = null;
        boolean saida = false;
        
        /* INICIO ERRO */ 
        switch (codigo) {
            case 0:
                msg = "Erro não identificado.";
                saida = false;
                break;
            case 1:
                msg = "Não foi encontrado um identificador.";
                saida = false;
                break;
            case 2:
                msg = "";
                saida = false;
                break;
            case 3:
                msg = "";
                saida = false;
                break;
            case 4:
                msg = "Não foi encontrado ';'";
                saida = false;
                break;
            case 5:
                msg = "Analise concluida com sucesso.";
                saida = true;
                break;
            case 6:
                msg = "Identificadores não devem começar com números.";
                saida = false;
                break;
            default:
                msg = "Codigo de erro não encontrado";
                saida = false;
                break;
        }
        /* FIM ERRO */ 
        
        System.out.println(msg);
        return saida;
    }
}
