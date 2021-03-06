package sample.httpsession;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.session.hazelcast.Hazelcast4IndexedSessionRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SampleHttpSessionHazelcastApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		assertThat(context.getBeansOfType(Hazelcast4IndexedSessionRepository.class)).isNotNull();
	}

}
