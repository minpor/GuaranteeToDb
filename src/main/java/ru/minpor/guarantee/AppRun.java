package ru.minpor.guarantee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.minpor.guarantee.service.GuaranteeService;

@SpringBootApplication(scanBasePackages = "ru.minpor.guarantee.config")
public class AppRun {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(AppRun.class, args);
		GuaranteeService bean = ctx.getBean(GuaranteeService.class);
		bean.addGuarantee();
	}

}
