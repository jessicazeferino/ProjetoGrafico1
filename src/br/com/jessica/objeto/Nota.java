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
public class Nota {
    private String nomeDisciplina;
    private TipoAvaliacao Tipoavaliacao;
    private float nota;

    public Nota(String nomeDisciplina, TipoAvaliacao Tipoavaliacao, float nota) {
        this.nomeDisciplina = nomeDisciplina;
        this.Tipoavaliacao = Tipoavaliacao;
        this.nota = nota;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public TipoAvaliacao getTipoavaliacao() {
        return Tipoavaliacao;
    }

    public void setTipoavaliacao(TipoAvaliacao Tipoavaliacao) {
        this.Tipoavaliacao = Tipoavaliacao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
