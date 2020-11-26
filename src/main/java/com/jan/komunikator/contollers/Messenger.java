package com.jan.komunikator.contollers;

import com.jan.komunikator.model.MessageDTO;
import com.jan.komunikator.services.MessengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Messenger {
    private final MessengerService messengerService;


    @PostMapping("/sendMessage")
    public MessageDTO sendMessage(@RequestBody MessageDTO messageDTO){
        return messengerService.addMessage(messageDTO);
    }

    @GetMapping("/receiveMessages")
    public List<MessageDTO> receiveMessages(){
        return messengerService.getMessages();
    }
}
