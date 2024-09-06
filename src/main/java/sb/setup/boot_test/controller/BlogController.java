package sb.setup.boot_test.controller;

import org.springframework.web.bind.annotation.*;
import sb.setup.boot_test.model.Blog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private HashMap<Integer, Blog> data = new HashMap<>();

    @GetMapping
    public List<Blog> getBlogData(){
        return new ArrayList<Blog>(data.values());
    }

    @PostMapping
    public Boolean postBlogData(@RequestBody Blog blog){
        data.put(blog.getId(),blog);
        return true;
    }
}
