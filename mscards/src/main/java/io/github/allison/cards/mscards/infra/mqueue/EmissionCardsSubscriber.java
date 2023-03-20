package io.github.allison.cards.mscards.infra.mqueue;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.allison.cards.mscards.application.representation.CardSaveRequest;
import io.github.allison.cards.mscards.domain.ClientCard;
import io.github.allison.cards.mscards.domain.Card;
import io.github.allison.cards.mscards.domain.DataRequestEmissionCards;
import io.github.allison.cards.mscards.infra.repository.CardRepository;
import io.github.allison.cards.mscards.infra.repository.ClientCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmissionCardsSubscriber {

    private final CardRepository cardRepository;
    private final ClientCardRepository clientCardRepository;

    @RabbitListener(queues = "${mq.queues.emission-cards}")
    public void ReceiveIssueOrder(@Payload String payload){
        try {
            var mapper = new ObjectMapper();
            DataRequestEmissionCards datas = mapper.readValue(payload, DataRequestEmissionCards.class);
            Card card = cardRepository.findById(datas.getIdCard()).orElseThrow();
            ClientCard clientCard = new ClientCard();
            clientCard.setCard(card);
            clientCard.setCpf(datas.getCpf());
            clientCard.setLimite(datas.getLimitReleased());
            clientCardRepository.save(clientCard);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
