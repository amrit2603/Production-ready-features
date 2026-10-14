package net.engineeringdigest.controllers;


import lombok.RequiredArgsConstructor;
import net.engineeringdigest.dto.PostDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    @GetMapping
    public List<PostDTO> getAllPosts(){
        return postService.getAllposts();
    }

    @GetMapping("/{postId}")
    public PostDTO getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @PostMapping
    public PostDTO createNewPost(@RequestBody PostDTO inputPost){
        return postService.creatNewPost(inputPost);
    }

    @PutMapping("{postId")
    public PostDTO updatePost(@RequestBody PostDTO inputPost, @PathVariable Long postId){
        return postService.updatePost(inputPost,postId);
    }
}
