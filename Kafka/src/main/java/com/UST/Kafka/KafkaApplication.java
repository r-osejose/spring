package com.UST.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaApplication {
	
	@Autowired
	private KafkaTemplate<String,Object> template;
	
	private String topic="rose";
	
	@GetMapping("/publish/{name}")
	public String PublishMessage(@PathVariable String name) {
		template.send(topic, "Hi"+name+"I Love You");
		return "Data published";		
	}
	
	@GetMapping("/publishjson")
	public String publicMessage() {
		Emp emp = new Emp(123,"Rose","rose@gmail.com","7023417754");
		template.send(topic, emp);
		return "Json data published";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

}
