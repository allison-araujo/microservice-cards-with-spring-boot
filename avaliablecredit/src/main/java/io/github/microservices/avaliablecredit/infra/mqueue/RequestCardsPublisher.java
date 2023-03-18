package io.github.microservices.avaliablecredit.infra.mqueue;

import io.github.microservices.avaliablecredit.domain.model.DataRequestEmissionCards;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class RequestCardsPublisher {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queueEmissionCards;



    public void RequestCards(DataRequestEmissionCards data){


    }


}
