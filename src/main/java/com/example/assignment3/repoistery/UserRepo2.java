package com.example.assignment3.repoistery;

import com.example.assignment3.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo2 extends MongoRepository<Album,String> {
}
