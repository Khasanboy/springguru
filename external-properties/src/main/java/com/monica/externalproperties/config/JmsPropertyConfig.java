package com.monica.externalproperties.config;

import com.monica.externalproperties.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:jms.properties")
})
public class JmsPropertyConfig {

    @Value("${guru.jms.username}")
    String username;

    @Value("${guru.jms.password}")
    String password;

    @Value("${guru.jms.url}")
    String url;

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(username);
        jmsBroker.setPassword(password);
        jmsBroker.setUrl(url);

        return jmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
