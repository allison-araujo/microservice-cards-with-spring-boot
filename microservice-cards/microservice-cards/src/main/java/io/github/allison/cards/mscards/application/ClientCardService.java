package io.github.allison.cards.mscards.application;


import io.github.allison.cards.mscards.domain.ClientCard;
import io.github.allison.cards.mscards.infra.repository.ClientCardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ClientCardService {
    private final ClientCardRepository repository;
    public List<ClientCard> listCardsByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
    
}
