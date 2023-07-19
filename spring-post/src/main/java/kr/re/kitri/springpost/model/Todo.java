package kr.re.kitri.springpost.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    private long id;
    private String title;
    private boolean completed;
}
