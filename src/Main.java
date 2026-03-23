import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso java descrição");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Curso js descrição");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();


        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev joao = new Dev();
        joao.setName("joao");
        joao.inscreveBootcamp(bootcamp);

        System.out.println("Conteudos joao " + joao.getConteudosInscritos());
        joao.progredir();
        System.out.println();
        System.out.println("Conteudos joao inscritos " + joao.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos joao " + joao.getConteudosConcluidos());

        System.out.println();


        System.out.println("=================================");
        Dev maria = new Dev();
        maria.inscreveBootcamp(bootcamp);
        maria.setName("Maria");
        System.out.println("Conteudos maria inscritos" + maria.getConteudosInscritos());
        System.out.println();
        maria.progredir();
        System.out.println("Conteudos maria" + maria.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos maria" + maria.getConteudosConcluidos());






    }
}