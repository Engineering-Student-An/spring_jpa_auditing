package study.jpa_auditing_ex;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.jpa_auditing_ex.domain.Post;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostApiController {

    private final PostService postService;

    @GetMapping
    public List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{postId}")
    public Post findOne(@PathVariable("postId") Long postId) {
        return postService.findOne(postId);
    }

    @PostMapping
    public Post create(@RequestBody PostDto postDto) {
        return postService.save(postDto);
    }

    @PutMapping("/{postId}")
    public Post update(@PathVariable("postId") Long postId, @RequestBody PostDto postDto) {
        return postService.update(postId, postDto);
    }
}
