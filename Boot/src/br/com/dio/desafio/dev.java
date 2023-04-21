package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class dev {
    private String nome;
    private LinkedHashSet<conteudo> conteudosInscritos= new LinkedHashSet<>();
    private LinkedHashSet<conteudo> conteudosConcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp(bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
        public void progredir() {
            Optional<conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
            if(conteudo.isPresent()){
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            }else {
                System.err.println("Você não eta inscrito em nehum curso");
            }

        }
        public double calcularTotalXp() {
            return this.conteudosConcluidos.stream().mapToDouble(conteudo::calcuarXP).sum();
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedHashSet<conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(LinkedHashSet<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public LinkedHashSet<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(LinkedHashSet<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dev dev = (dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
