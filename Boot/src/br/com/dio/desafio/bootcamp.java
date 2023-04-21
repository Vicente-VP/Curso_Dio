package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.*;

public class bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFInal = dataInicial.plusDays(45);
    private HashSet<dev> devsInscritos = new HashSet<>();
    private HashSet<conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFInal() {
        return dataFInal;
    }

    public HashSet<dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(HashSet<dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public HashSet<conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(HashSet<conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bootcamp bootcamp = (bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFInal, bootcamp.dataFInal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFInal, devsInscritos, conteudos);
    }
}
