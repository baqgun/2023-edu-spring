package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Test
    public void testGetAllPosts(){
        List<Post> posts = postService.getAllPosts();

        System.out.println(posts);

        //Assertions.assertTrue(posts.size()<0);
    }

//    public List<Post> getAllPosts() {
//        return postRepository.selectAllPosts();
//    }
}
