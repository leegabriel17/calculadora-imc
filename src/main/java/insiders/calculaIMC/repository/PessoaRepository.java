package insiders.calculaIMC.repository;

import insiders.calculaIMC.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa,Long> {
}
