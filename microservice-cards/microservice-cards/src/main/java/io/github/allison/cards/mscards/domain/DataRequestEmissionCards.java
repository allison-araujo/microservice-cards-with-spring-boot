package io.github.allison.cards.mscards.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DataRequestEmissionCards {
    private Long idCard;
    private String cpf;
    private String address;
    private BigDecimal limitReleased;
}
