package com.jan.komunikator.services;

import com.jan.komunikator.model.MessageDTO;
import com.jan.komunikator.model.repository.MessengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessengerService {

    private final MessengerRepository messengerRepository;

    public MessageDTO addMessage(MessageDTO messageDTO){
        messengerRepository.getMessagesList().add(messageDTO);
        return messageDTO;
    };

    public List<MessageDTO> getMessages(){
        return messengerRepository.getMessagesList();
    }
}

