package study.jpa_auditing_ex;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AuditorAwareImpl implements AuditorAware<Long> {

    private final HttpServletRequest request;

    @Override
    public Optional<Long> getCurrentAuditor() {
        Long userId = Long.valueOf(request.getHeader("loginUserId"));
        return Optional.ofNullable(userId);
    }
}
