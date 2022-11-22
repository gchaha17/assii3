package com.example.assignment3.resource;

import com.example.assignment3.model.Comment;
import com.example.assignment3.model.Photo;
import com.example.assignment3.service.CommentService;
import com.example.assignment3.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photo")
public class PhotoResource {

    @Autowired
    private PhotoService prs;
    @PostMapping()
    public Photo savePhoto(@RequestBody Photo p1)
    {
        return prs.savePhoto(p1);

    }
    @GetMapping()
    public List<Photo> getPhoto()
    {
        return prs.getPhoto();

    }
    @PutMapping()
    public Photo updatePhoto(@RequestBody Photo p1)
    {

        return prs.updatePhoto(p1);
    }
    @DeleteMapping()
    public void deletePhoto(@RequestParam(name="photoId")String photoId)
    {
        prs.deletePhoto(photoId);

    }
}
