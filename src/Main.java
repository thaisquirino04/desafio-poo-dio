import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootecamp bootecamp = new Bootecamp();
        bootecamp.setNome("Bootcamp Java Developer");
        bootecamp.setDescricao("Descrição Bootecamp Java Developer");
        bootecamp.getConteudos().add(curso1);
        bootecamp.getConteudos().add(curso2);
        bootecamp.getConteudos().add(mentoria);

        Dev devThais = new Dev();
        devThais.setNome("Thais");
        devThais.increverBootecamp(bootecamp);
        System.out.println("Conteudos Inscritos" + devThais.getConteudosInscritos());

        devThais.progredir();
        devThais.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devThais.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Thais:" + devThais.getConteudosConcluidos());
        System.out.println("XP:" + devThais.calcularTotalXp());

        System.out.println("-------");

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.increverBootecamp(bootecamp);
        System.out.println("Conteudos Inscritos" + devLaura.getConteudosInscritos());

        devLaura.progredir();
        devLaura.progredir();
        devLaura.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Laura:" + devLaura.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devLaura.getConteudosInscritos());
        System.out.println("XP:" + devLaura.calcularTotalXp());



    }
}
