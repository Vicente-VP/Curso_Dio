package br.com.dio.desafio;

public class curso extends conteudo{
    private int cargoHoraria;

    @Override
    public double calcuarXP() {
        return XP_PADRAO * cargoHoraria;
    }

    public curso(){

    }

    public int getCargoHoraria() {
        return cargoHoraria;
    }

    public void setCargoHoraria(int cargoHoraria) {
        this.cargoHoraria = cargoHoraria;
    }

    @Override
    public String toString() {
        return "curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoHoraria=" + cargoHoraria +
                '}';
    }
}
