package br.com.dio.desafio;

import java.time.LocalDate;

public class mentoria extends conteudo {

    private LocalDate data;

    @Override
    public double calcuarXP() {
        return XP_PADRAO + 20d;
    }

    public mentoria(){

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
