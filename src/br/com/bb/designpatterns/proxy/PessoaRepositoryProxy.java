package br.com.bb.designpatterns.proxy;

import br.com.bb.designpatterns.builder.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements PessoaRepositoryProxyI{

    private static Logger log =  Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa){
        log.info("Inicio da chamada do metodo Save");
        super.save(pessoa);
        log.info("Fim da chamada metodo Save");
    }


    @Override
    public Pessoa findById(Long id){
        long inicio = System.currentTimeMillis();
        log.info("Inicio da chamada do metodo findById");

        Pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))){
            log.info("chamou do cache");
            pessoa = cache.get(id);
        } else {
            log.info("chamou do PessoaRepository");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("Fim da chamada metodo findById");
        long fim = System.currentTimeMillis();
        log.info("Tempo da Chamada: " + (fim - inicio));
        return pessoa;
    }
}
