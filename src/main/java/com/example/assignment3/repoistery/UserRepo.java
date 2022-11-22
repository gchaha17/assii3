package com.example.assignment3.repoistery;

import com.example.assignment3.model.Album;
import com.example.assignment3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String>  {


}

