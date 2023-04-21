import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       curso curso1 = new curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("Curso java desc");
       curso1.setCargoHoraria(8);
       System.out.println(curso1);

       curso curso2 = new curso();
       curso2.setTitulo("curso py");
       curso2.setDescricao("Curso py desc");
       curso2.setCargoHoraria(10);

       mentoria mentoria = new mentoria();
       mentoria.setTitulo("Mentoria Java");
       mentoria.setDescricao("Mentoria Java desc");
       mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/


       bootcamp bootcamp = new bootcamp();
       bootcamp.setNome("Bootcamp Java Dev");
       bootcamp.setDescricao("Desc Java Dev");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       dev devVicente = new dev();
       devVicente.setNome("Vicente");
       devVicente.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Vicente:" + devVicente.getConteudosInscritos());
       devVicente.progredir();
       devVicente.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Vicente:" + devVicente.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos Vicente:" + devVicente.getConteudosConcluidos());
       System.out.println("XP:" + devVicente.calcularTotalXp());

       System.out.println("---------------");

       dev devJoao = new dev();
       devJoao.setNome("joao");
       devJoao.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
       devJoao.progredir();
       devJoao.progredir();
       devJoao.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos Joao:" + devJoao.getConteudosConcluidos());
       System.out.println("XP:" + devVicente.calcularTotalXp());

    }
}