package io.github.allison.cards.mscards.application.representation;


import io.github.allison.cards.mscards.domain.ClientCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardWithClientResponse {

    private String name;
    private String flag;
    private BigDecimal limitRelease;


    public static CardWithClientResponse fromModel(ClientCard model){
        return new CardWithClientResponse(
                model.getCard().getName(),
                model.getCard().getFlag().toString(),
                model.getLimite()

        );

    }
}
