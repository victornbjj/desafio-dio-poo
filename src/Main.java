import br.com.dio.desafio.domain.Curso;
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





        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);



    }
}