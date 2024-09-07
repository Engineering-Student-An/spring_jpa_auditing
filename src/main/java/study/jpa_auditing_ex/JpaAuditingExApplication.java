package study.jpa_auditing_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JpaAuditingExApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaAuditingExApplication.class, args);
    }

}
