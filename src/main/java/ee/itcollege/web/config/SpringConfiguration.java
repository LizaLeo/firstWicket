package ee.itcollege.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ee.itcollege.web.service.INumberService;
import ee.itcollege.web.service.StaticNumberService;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public INumberService numberService() {
		return new StaticNumberService();
	}

}
