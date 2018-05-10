/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jessica.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    TRABALHO("Trabalho"),
    PROVA ("Prova, Individual"),
    SEMINARIO ("Apresentaçao");
    
    private String nome;

    private TipoAvaliacao(String nome) {
        this.nome = nome;
    }

    public static TipoAvaliacao getTRABALHO() {
        return TRABALHO;
    }

    public static TipoAvaliacao getPROVA() {
        return PROVA;
    }

    public static TipoAvaliacao getSEMINARIO() {
        return SEMINARIO;
    }

    public String getNome() {
        return nome;
    }
    

}
