package com.example.assignment3.repoistery;

import com.example.assignment3.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo4 extends MongoRepository<Photo,String> {
}
