package io.github.microservices.avaliablecredit.infra.mqueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    public void RequestCards(DataRequestEmissionCards data) throws JsonProcessingException{
        var json = convertIntoJson(data);
        rabbitTemplate.convertAndSend(queueEmissionCards.getName(), json);
    }


    private String convertIntoJson(DataRequestEmissionCards values) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        var json = mapper.writeValueAsString(values);
        return json;

    }


}
