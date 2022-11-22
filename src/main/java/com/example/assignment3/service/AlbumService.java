package com.example.assignment3.service;

import com.example.assignment3.model.Album;
import com.example.assignment3.repoistery.UserRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
@Autowired
private UserRepo2 ur2;
    public Album saveAlbum(Album al) {
        return ur2.save(al);
    }

    public List<Album> getAlbum() {
        return ur2.findAll();
    }

    public Album updateAlbum(Album al) {
        return ur2.save(al);
    }

   public void deleteAlbum(String albumId) {
        ur2.deleteById(albumId);
    }
}


