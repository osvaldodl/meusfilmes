package com.cabral.marinho.meusfilmes;

import java.util.Arrays;

/**
 * Created by marinho on 03/12/17.
 */

public class Filme {
    private String titulo;
    private String poster;
    private String panoDeFundo;
    private String[] genero;
    private String idioma;
    private String sinopse;
    private int popularidade;

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", poster='" + poster + '\'' +
                ", panoDeFundo='" + panoDeFundo + '\'' +
                ", genero=" + Arrays.toString(genero) +
                ", idioma='" + idioma + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", popularidade=" + popularidade +
                ", companhias=" + Arrays.toString(companhias) +
                ", pais='" + pais + '\'' +
                ", data='" + data + '\'' +
                ", trailer='" + trailer + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPanoDeFundo() {
        return panoDeFundo;
    }

    public void setPanoDeFundo(String panoDeFundo) {
        this.panoDeFundo = panoDeFundo;
    }

    public String[] getGenero() {
        return genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public String[] getCompanhias() {
        return companhias;
    }

    public void setCompanhias(String[] companhias) {
        this.companhias = companhias;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    private String[] companhias;
    private String pais;
    private String data;
    private String trailer;

}
