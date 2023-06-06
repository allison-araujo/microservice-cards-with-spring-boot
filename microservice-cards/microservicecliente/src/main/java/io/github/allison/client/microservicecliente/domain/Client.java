package io.github.allison.client.microservicecliente.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;


    private String cpf;

    private String name;

    private Integer age;


    public Client(String cpf, String name, Integer age) {

        this.cpf = cpf;
        this.name = name;
        this.age = age;
    }


}
