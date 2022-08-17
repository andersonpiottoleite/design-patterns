package br.com.bb.designpatterns.proxy;

import br.com.bb.designpatterns.builder.Pessoa;

public class PessoaService {

    private PessoaRepositoryProxyI pessoaRepositoryProxyI;

    public PessoaService(PessoaRepositoryProxyI pessoaRepositoryProxyI) {
        this.pessoaRepositoryProxyI = pessoaRepositoryProxyI;
    }

    public void save(Pessoa pessoa){
        pessoaRepositoryProxyI.save(pessoa);
    }


    public Pessoa findById(Long id){
        return pessoaRepositoryProxyI.findById(id);
    }


}
