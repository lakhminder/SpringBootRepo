package org.lucky.spring.boot.data.eg2.model.repository;

import org.lucky.spring.boot.data.eg2.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
