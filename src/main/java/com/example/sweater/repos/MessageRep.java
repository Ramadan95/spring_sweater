package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRep extends CrudRepository<Message, Long> {

    Iterable<Message> findByTag(String filter);
}
