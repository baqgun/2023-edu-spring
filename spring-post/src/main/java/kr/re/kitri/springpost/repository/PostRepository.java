package kr.re.kitri.springpost.repository;

import kr.re.kitri.springpost.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface PostRepository {
    List<Post> selectAllPosts();
    Post selectPostById(int postId);
    void deletePost(int postId);
    void insertPost(Post post);

    void updatePost(Post post);
}
