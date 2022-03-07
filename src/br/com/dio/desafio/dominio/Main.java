package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);





        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());  //ira atribuir a data de criação

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichael = new Dev();
        devMichael.setNome ("Michael");
        devMichael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Michael: " + devMichael.getConteudosInscritos());
        devMichael.progredir();
        devMichael.progredir();
        devMichael.progredir();
        System.out.println("Conteúdos Inscritos Michael: " + devMichael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Michael: " + devMichael.getConteudosConcluidos());
        System.out.println("XP:" + devMichael.calcularTotalXp());

        System.out.println("---------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());



    }

}
