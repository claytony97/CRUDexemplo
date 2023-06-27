package com.treina.poswebsys;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.treina.poswebsys.hrdominio.Pessoa;
import com.treina.poswebsys.hrdominio.PessoaRepositorio;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner{

    @Autowired
    private PessoaRepositorio pessoaRepo;

    @Override
    public void run(String... args) throws Exception{


        Pessoa p1 = new Pessoa("Joao");
        p1.setDataNascimento(LocalDate.of(1990, 4, 1));
        p1.setEmail("joao@gmail.com");

        Pessoa p2 = new Pessoa("Maria");
        p2.setDataNascimento(LocalDate.of(1900, 1, 1));
        p2.setEmail("maria@gamil");

        pessoaRepo.save(p1);
        pessoaRepo.save(p2);

    }

    
}
