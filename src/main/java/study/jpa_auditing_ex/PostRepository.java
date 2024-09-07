package study.jpa_auditing_ex;

import org.springframework.data.jpa.repository.JpaRepository;
import study.jpa_auditing_ex.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
