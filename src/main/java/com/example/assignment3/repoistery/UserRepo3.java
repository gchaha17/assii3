package com.example.assignment3.repoistery;

import com.example.assignment3.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo3 extends MongoRepository<Comment,String> {

}
