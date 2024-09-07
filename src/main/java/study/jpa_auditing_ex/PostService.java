package study.jpa_auditing_ex;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.jpa_auditing_ex.domain.Post;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findOne(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    @Transactional
    public Post save(PostDto postDto) {
        Post post = new Post(postDto.getTitle(), postDto.getContent());
        return postRepository.save(post);
    }

    @Transactional
    public Post update(Long postId, PostDto postDto) {
        Post post = postRepository.findById(postId).orElse(null);

        if(post == null) return null;

        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());

        return postRepository.save(post);
    }
}
