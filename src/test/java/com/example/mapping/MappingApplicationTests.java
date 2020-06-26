package com.example.mapping;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MappingApplicationTests {

	@Test
	void mappingTest(@Autowired TestRestTemplate template) {
		ResponseEntity<String> response = template.getForEntity("/foo/default/file.txt?useDefaultLabel", String.class);
		assertThat(response.getBody()).isEqualTo("noparam");
	}

}
