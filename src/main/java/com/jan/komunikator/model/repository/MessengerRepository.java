package com.jan.komunikator.model.repository;

import com.jan.komunikator.model.MessageDTO;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Data
@Repository
public class MessengerRepository {
    List<MessageDTO> messagesList = new ArrayList<>();
}

