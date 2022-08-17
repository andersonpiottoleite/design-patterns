package br.com.bb.designpatterns.proxy;

import br.com.bb.designpatterns.builder.Pessoa;

import java.util.Objects;

public interface PessoaRepositoryProxyI {

    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
