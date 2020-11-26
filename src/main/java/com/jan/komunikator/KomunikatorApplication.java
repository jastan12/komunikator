package com.jan.komunikator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
@Import(KomunikatorApplication.MyConfig.class)
public class KomunikatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KomunikatorApplication.class, args);
	}

	@Configuration
	public class MyConfig {
		@Bean
		public CommonsRequestLoggingFilter requestLoggingFilter() {
			CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
			loggingFilter.setIncludeClientInfo(true);
			loggingFilter.setIncludeQueryString(true);
			loggingFilter.setIncludePayload(true);
			loggingFilter.setMaxPayloadLength(64000);
			return loggingFilter;
		}
	}
}
