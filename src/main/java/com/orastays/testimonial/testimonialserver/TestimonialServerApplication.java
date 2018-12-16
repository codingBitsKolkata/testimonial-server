package com.orastays.testimonial.testimonialserver;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class TestimonialServerApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(TestimonialServerApplication.class, args);
	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/test/**").addResourceLocations("/test/").setCachePeriod(0);
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(0);
        registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(0);
        registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(0);
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        converters.add(new MappingJackson2HttpMessageConverter());
        super.configureMessageConverters(converters);
    }

	@Bean
	public ModelMapper modelMapper() {

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setAmbiguityIgnored(true);
		return modelMapper;
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
