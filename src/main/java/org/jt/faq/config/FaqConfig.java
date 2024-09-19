package org.jt.faq.config;

import org.jt.faq.repository.FaqRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FaqConfig {
    @Bean
    FaqRepository faqRepository(){
        return new FaqRepository();
    }
}
