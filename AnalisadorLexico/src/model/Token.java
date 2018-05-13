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
 * Classe de valores do Token
 * @author Otávio Voiski, Matheus Ribeiro, Maycon Ferrari, Marcio Almeida
 */
public class Token {
    private String Classe;              //pode ter os valores ident, const, atrib, pont, fim, reserv
    private String Representacao;       //Representação: será o próprio caractere lido para classes atrib, pont, fim; ou I, R ou S para as palavras reservadas, e nulo para as demais classes.
    private int Valor;                  //Valor : o valor numérico do elemento, apenas para classe const,  se for numérica, zero para as outras classes.
    private int Apontador;        //Apontador: local onde os caracteres estarão armazenados, para o caso de constante string ou identificador, zero para as outras classes.
    private int Indtab;           //Indtab: Posição na tabela de símbolos, apenas para as classes ident e const, zero para as outras classes.

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public String getRepresentacao() {
        return Representacao;
    }

    public void setRepresentacao(String Representacao) {
        this.Representacao = Representacao;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public int getApontador() {
        return Apontador;
    }

    public void setApontador(int Apontador) {
        this.Apontador = Apontador;
    }

    public int getIndtab() {
        return Indtab;
    }

    public void setIndtab(int Indtab) {
        this.Indtab = Indtab;
    }


}
