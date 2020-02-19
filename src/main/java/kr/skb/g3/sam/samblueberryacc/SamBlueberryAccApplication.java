package kr.skb.g3.sam.samblueberryacc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SamBlueberryAccApplication {
	private static final Logger logger = LoggerFactory.getLogger(SamBlueberryAccApplication.class);

	public static void main(String[] args) {
        System.out.println("Hello");
		SpringApplication.run(SamBlueberryAccApplication.class, args);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean loggingFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();

		registrationBean.setFilter(new MdcLoggingFilter());

		return registrationBean;
	}

	@Bean
	public RestTemplate getRestTemplate() {
		logger.info("initialize resttemplate");
		return new RestTemplate();
	}

	

}
