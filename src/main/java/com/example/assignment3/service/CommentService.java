package com.example.assignment3.service;

import com.example.assignment3.model.Album;
import com.example.assignment3.model.Comment;
import com.example.assignment3.repoistery.UserRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    private UserRepo3 ur3;
    public Comment saveComment(Comment c1) {
        return ur3.save(c1);
    }

    public List<Comment> getComment() {
        return ur3.findAll();
    }

    public Comment updateComment(Comment c1) {
        return ur3.save(c1);
    }

    public void deleteComment(String commentId) {
        ur3.deleteById(commentId);
    }
}
