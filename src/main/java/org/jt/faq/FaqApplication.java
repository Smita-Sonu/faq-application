package org.jt.faq;

import org.jt.faq.service.FaqService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.RequiredArgsConstructor;

@SpringBootApplication(scanBasePackages = { "org.jt.faq", "org.jt" })
// @ComponentScan({ "org.jt.faq", "org.jt" })
@RequiredArgsConstructor
public class FaqApplication implements CommandLineRunner {
	private final FaqService service1;
	private final FaqService service2;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FaqApplication.class, args);
		// FaqService service = ctx.getBean("faqService", FaqService.class);
		// System.out.println(service.getQuestions().size());
	}

	@Override
	public void run(String... args) throws Exception {
		// System.out.println(service.getQuestions().size());
		System.out.println(service1 == service2);
	}
}
