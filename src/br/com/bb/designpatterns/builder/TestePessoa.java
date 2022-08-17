package br.com.bb.designpatterns.builder;

public class TestePessoa {

    public static void main(String[] args) {
        /*Pessoa pessoa = new Pessoa(
                "Anderson",
                "Piotto",
                "35461845625",
                "piottok10@gmail.com",
                "Careca",
                "12/03/1985"
        );

        System.out.println(pessoa);
         */

        /*Pessoa pessoa2 = new PessoaBuilder()
                .sobreNome("Piotto 2")
                .nome("Anderson 2")
                .dataNascimento("12/03/1985")
                .documento("35461848889")
                .apelido("Careca")
                .build();

        System.out.println(pessoa2);*/

        Pessoa pessoa3 = new Pessoa.PessoaBuilderInterno()
                .sobreNome("Piotto 2")
                .dataNascimento("12/03/1985")
                .nome("Anderson 2")
                .apelido("Careca")
                .documento("35461848889")
                .build();

        System.out.println(pessoa3);
    }
}
