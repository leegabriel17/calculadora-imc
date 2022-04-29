package insiders.calculaIMC.controller;

import insiders.calculaIMC.model.Pessoa;
import insiders.calculaIMC.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculaimc")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public String calcula(@RequestBody Pessoa pessoa)  {
        System.out.println(pessoa);
        return pessoaService.calculaimc(pessoa);
    }
}
