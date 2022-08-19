package br.com.bb.designpatterns.proxy;

import br.com.bb.designpatterns.builder.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);

        Pessoa pessoa = new Pessoa.PessoaBuilderInterno()
                .sobreNome("Piotto 2")
                .dataNascimento("12/03/1985")
                .nome("Anderson 2")
                .apelido("Careca")
                .documento("35461848889")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
    }
}
