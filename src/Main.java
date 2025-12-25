import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso(
                "Curso Java",
                "Descrição do curso de Java",
                8
        );

        Curso cursoJs = new Curso(
                "Curso JavaScript",
                "Descrição do curso de JavaScript",
                4
        );

        Mentoria mentoriaJava = new Mentoria(
                "Mentoria de Java",
                "Descrição da mentoria de Java",
                LocalDate.now()
        );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJs);
        bootcamp.adicionarConteudo(mentoriaJava);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
    }
}

