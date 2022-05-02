package insiders.calculaIMC.service;

import insiders.calculaIMC.model.Pessoa;
import insiders.calculaIMC.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public String calculaimc(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        DecimalFormat df = new DecimalFormat("###.##");
        double media = calcular(pessoa);
            if(media < 18.50){
                return pessoa.getNome() +"\n"+df.format(media) + "\nAbaixo do Peso Normal";
            }else if(media <25){
                return pessoa.getNome() +"\n"+df.format(media) + "\nPeso Normal";
            }else if(media < 30){
                return pessoa.getNome() +"\n"+df.format(media) + "\nExcesso de Peso";
            }else if(media < 35){
                return pessoa.getNome() +"\n"+df.format(media) + "\nObesidade Classe 1";
            }else if(media < 40){
                return pessoa.getNome() +"\n"+df.format(media) + "\nObesidade Classe 2";
            }else{
                return pessoa.getNome() +"\n"+df.format(media) + "\nObesidade Classe 3";
            }
    }

    private double calcular(Pessoa p) {
        double alt = p.getAltura();
        double peso= p.getPeso();
        return (peso/(alt*alt));
    }


}
