package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j  //lombock의 log를 사용하기 위한 annnotation
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> viewAllPosts(){
        log.debug("전체보기 ........");
        return postService.getAllPosts();
    }

    @GetMapping("posts/{postId}")
    public Post viewPostById(@PathVariable int postId){
        return postService.getPostById(postId);
    }

    @DeleteMapping("posts/{postId}")
    public void removePost(@PathVariable int postId){
        postService.removePost(postId);
    }

    @PostMapping("posts")
    public Post registPost(@RequestBody Post post){
        System.out.println("post :" +post); //차후 로깅으로 변경
        return postService.setPost(post);
    }

    @PutMapping("posts")
    public void updatePost(@RequestBody Post post){
        postService.updatePost(post);
    }
}
