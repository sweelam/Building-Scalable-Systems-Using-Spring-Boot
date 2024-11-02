package com.scalable.system.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalableSystemHelloWorldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScalableSystemHelloWorldApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Score.list();
	}

	enum Score {
		WINS, LOSES, TIES;

		public static void list() {
			for (var score : Score.values()) {
				System.out.print(score.name() + " ");
			}
		}
	}

}











