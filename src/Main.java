import br.com.dio.desafio.dominio.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da Mentoria Java");
        mentoria1.setData(LocalDate.now());


        //Conteudo conteudo = new Curso(); //Polimorfismo

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devKarla = new Dev();
        devKarla.setNome("Karla");
        devKarla.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscristos: "+devKarla.getConteudosInscritos());
        devKarla.progredir();
        devKarla.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscristos: "+devKarla.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: "+devKarla.getConteudosConcluidos());
        System.out.println("XP: "+devKarla.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscristos: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscristos: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());
    }

}