package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public Set<Conteudo> getConteudos() {
        return Collections.unmodifiableSet(conteudos);
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

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
}

