package io.github.allison.cards.mscards.infra.mqueue;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmissionCardsSubscriber {

    @RabbitListener(queues = "${mq.queues.emission-cards}")
    public void ReceiveIssueOrder(@Payload String payload){
        System.out.println(payload);
    }
}
