package org.springframework.samples.petclinic.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SampleConfig {

	//해당 bean을 수동으로 넣어주게 되면, org/springframework/samples/petclinic/sample/SampleController.java:5 에서 controller Annotation 생략 가능
	@Bean
	public SampleController sampleController() {
		return new SampleController();
	}

}
