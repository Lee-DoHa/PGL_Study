package dev.doha.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("post")
public class PostRestController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private List<PostDto> postList;

    public PostRestController(){
        this.postList = new ArrayList<>();
    }


    @PostMapping()
    public void createPost(@RequestBody PostDto postDto){
        logger.info(postDto.toString());
        this.postList.add(postDto);
    }


    @GetMapping()
    public List<PostDto> readPostAll(){
        logger.info("in read post all");
        return this.postList;
    }


    @GetMapping("{id}")
    public PostDto readPost(@PathVariable("id") int id){
        logger.info("in read post");
        return this.postList.get(id);
    }

    @PutMapping("{id}")
    public void updatePost(@PathVariable("id") int id, @RequestBody PostDto postDto){
        PostDto targetPost = this.postList.get(id);
        if(postDto.getTitle() != null){
            targetPost.setTitle(postDto.getTitle());
        }
        if(postDto.getContent() != null){
            targetPost.setContent(postDto.getContent());
        }
        this.postList.set(id, targetPost);
    }

    @DeleteMapping("{id}")
    public void deletePost(@PathVariable("id") int id){
        this.postList.remove(id);
    }

    // POST /post
    // GET /post/0/
    // GET /post
    // PUT /post/0/
    // DELETE /post/0
}
