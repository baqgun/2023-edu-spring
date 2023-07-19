package kr.re.kitri.springpost.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private long postId;
    private String title;
    private String body;
    private int likes;

}
