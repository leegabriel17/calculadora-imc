package insiders.calculaIMC.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private double altura;

    private  double peso;

}
